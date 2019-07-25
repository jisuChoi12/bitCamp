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
		vector.addElement("���̵�"); // add() / addElement() ����
		vector.addElement("�̸�");
		vector.add("��й�ȣ");
		vector.add("��ȭ��ȣ");

		model = new DefaultTableModel(vector,0){ // �� ���� ������ ����� (ù ���� �����̴ϱ�)
			@Override // �͸�Ŭ������ �������̵�
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
		
		insertB = new JButton("�߰�");
		deleteB = new JButton("����");
		
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
		String id = JOptionPane.showInputDialog(this, "���̵� �Է��ϼ���");
		// ���̵� �ߺ�üũ
		for(PersonDTO dto : list){
			if(dto.getId().equals(id)){
				JOptionPane.showMessageDialog(this,"�̹� ������� ���̵� �Դϴ�.");
				return;
			}
		}
		String name = JOptionPane.showInputDialog(this, "�̸��� �Է��ϼ���");
		String pwd = JOptionPane.showInputDialog(this, "��й�ȣ�� �Է��ϼ���");
		String tel = JOptionPane.showInputDialog(this, "��ȭ��ȣ�� �Է��ϼ���");

		Vector<String> v = new Vector<String>();
		v.add(id);
		v.add(name);
		v.add(pwd);
		v.add(tel);

		model.addRow(v);

		JOptionPane.showMessageDialog(this,"��ϿϷ�!");
	}

	public void delete() {
		int sw = 0;
		String name = JOptionPane.showInputDialog(this,"�̸��� �Է��ϼ���");
		for(int i=0; i<model.getRowCount(); i++){
			if(name.equals(model.getValueAt(i,1))){
				model.removeRow(i);
				i--;
				sw=1;
			}
		}
		if(sw==0) {
			JOptionPane.showMessageDialog(this, "���� �� �̸��� �����ϴ�");
		} else {
			JOptionPane.showMessageDialog(this,"�����Ϸ�!");
		}
	}

	public static void main(String[] args) {
		new JTableEx2();
	}
}
