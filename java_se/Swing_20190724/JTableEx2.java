import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

class PersonDTO {
	private String id;
	private String name;
	private String pwd;
	private String tel;

	public PersonDTO(String id, String name, String pwd, String tel){
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.tel = tel;
	}
	public String getId(){ return id; }
	public String getName(){ return name; }
	public String getPwd(){ return pwd; }
	public String getTel(){ return tel; }
}

//-----------------------------------------------------------------------------------

class JTableEx2 extends JFrame implements ActionListener {
	private ArrayList<PersonDTO> list;
	private Vector<String> vector;
	private DefaultTableModel model;
	private JTable table;
	private JButton insertB;
	private JButton deleteB;
	
	public JTableEx2() {
		// data
		list = new ArrayList<PersonDTO>();
		list.add(new PersonDTO("AAA","aaa","0000","010-0000-0000"));
		list.add(new PersonDTO("BBB","bbb","1111","010-1111-1111"));
		list.add(new PersonDTO("CCC","ccc","2222","010-2222-2222"));
		list.add(new PersonDTO("DDD","ddd","3333","010-3333-3333"));
		list.add(new PersonDTO("EEE","bbb","4444","010-4444-4444"));

		// title
		vector = new Vector<String>();
		vector.addElement("아이디"); // add() / addElement() 같음
		vector.addElement("이름");
		vector.add("비밀번호");
		vector.add("전화번호");

		model = new DefaultTableModel(vector,0){ // 빈 행의 개수를 만든다 (첫 줄은 제목이니까)
			@Override // 익명클래스로 오버라이드
			public boolean isCellEditable(int r, int c){
				return (c!=0) ? true : false;
			}
		}; 

		// table <- data
		for(PersonDTO dto : list){
			Vector<String> v = new Vector<String>();
			v.add(dto.getId());
			v.add(dto.getName());
			v.add(dto.getPwd());
			v.add(dto.getTel());

			model.addRow(v);
		}
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		insertB = new JButton("추가");
		deleteB = new JButton("삭제");
		
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp.add(insertB);
		jp.add(deleteB);

		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add("Center",scroll);
		con.add("South",jp);

		setBounds(300,200,600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// event
		insertB.addActionListener(this);
		deleteB.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==insertB){
			insert();
		}
		else if(e.getSource()==deleteB) {
			delete();
		}
	}

	public void insert() {
		String id = JOptionPane.showInputDialog(this, "아이디를 입력하세요");
		// 아이디 중복체크
		for(PersonDTO dto : list){
			if(dto.getId().equals(id)){
				JOptionPane.showMessageDialog(this,"이미 사용중인 아이디 입니다.");
				return;
			}
		}
		String name = JOptionPane.showInputDialog(this, "이름을 입력하세요");
		String pwd = JOptionPane.showInputDialog(this, "비밀번호를 입력하세요");
		String tel = JOptionPane.showInputDialog(this, "전화번호를 입력하세요");

		Vector<String> v = new Vector<String>();
		v.add(id);
		v.add(name);
		v.add(pwd);
		v.add(tel);

		model.addRow(v);

		JOptionPane.showMessageDialog(this,"등록완료!");
	}

	public void delete() {
		int sw = 0;
		String name = JOptionPane.showInputDialog(this,"이름을 입력하세요");
		for(int i=0; i<model.getRowCount(); i++){
			if(name.equals(model.getValueAt(i,1))){
				model.removeRow(i);
				i--;
				sw=1;
			}
		}
		if(sw==0) {
			JOptionPane.showMessageDialog(this, "삭제 할 이름이 없습니다");
		} else {
			JOptionPane.showMessageDialog(this,"삭제완료!");
		}
	}

	public static void main(String[] args) {
		new JTableEx2();
	}
}
