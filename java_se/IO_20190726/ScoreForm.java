import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ScoreForm extends JFrame implements ActionListener {
	private JLabel hakL, nameL, korL, engL, mathL;
	private JTextField hakT, nameT, korT, engT, mathT;
	private JTextArea area;
	private JButton addB, dispB, searchB, tot_descB, saveB, loadB;
	private ScoreImpl impl;

	public ScoreForm() {
		hakL = new JLabel("학번");
		nameL = new JLabel("이름");
		korL = new JLabel("국어");
		engL = new JLabel("영어");
		mathL = new JLabel("수학");
		hakT = new JTextField();
		nameT = new JTextField();
		korT = new JTextField();
		engT = new JTextField();
		mathT = new JTextField();
		area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		addB = new JButton("입력");
		dispB = new JButton("출력");
		searchB = new JButton("학번검색");
		tot_descB = new JButton("정렬");
		saveB = new JButton("저장");
		loadB = new JButton("파일읽기");
		impl = new ScoreImpl();

		Dimension d = new Dimension(150, 20);
		JPanel panelLT1 = new JPanel(new FlowLayout());
		panelLT1.add(hakL);
		hakT.setPreferredSize(d);
		panelLT1.add(hakT);
		JPanel panelLT2 = new JPanel(new FlowLayout());
		panelLT2.add(nameL);
		nameT.setPreferredSize(d);
		panelLT2.add(nameT);
		JPanel panelLT3 = new JPanel(new FlowLayout());
		panelLT3.add(korL);
		korT.setPreferredSize(d);
		panelLT3.add(korT);
		JPanel panelLT4 = new JPanel(new FlowLayout());
		panelLT4.add(engL);
		engT.setPreferredSize(d);
		panelLT4.add(engT);
		JPanel panelLT5 = new JPanel(new FlowLayout());
		panelLT5.add(mathL);
		mathT.setPreferredSize(d);
		panelLT5.add(mathT);
		JPanel panelLT = new JPanel(new GridLayout(5, 2, 0, 0));
		panelLT.add(panelLT1);
		panelLT.add(panelLT2);
		panelLT.add(panelLT3);
		panelLT.add(panelLT4);
		panelLT.add(panelLT5);

		JPanel panelB = new JPanel(new FlowLayout());
		panelB.add(addB);
		panelB.add(dispB);
		panelB.add(searchB);
		panelB.add(tot_descB);
		panelB.add(saveB);
		panelB.add(loadB);
		
		
		area.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		
		JPanel panelPP = new JPanel(new GridLayout(1,2,0,0));
		panelPP.add(panelLT);
		panelPP.add(scroll);

		Container con = getContentPane();
		con.add("Center", panelPP);
		con.add("South", panelB);

		setTitle("성적관리");
		setBounds(300, 300, 500, 340);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void event() {
		addB.addActionListener(this);
		dispB.addActionListener(this);
		searchB.addActionListener(this);
		tot_descB.addActionListener(this);
		saveB.addActionListener(this);
		loadB.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addB) {
			String hakbun = hakT.getText();
			String name = nameT.getText();
			int kor = Integer.parseInt(korT.getText());
			int eng = Integer.parseInt(engT.getText());
			int math = Integer.parseInt(mathT.getText());

			ScoreDTO dto = new ScoreDTO(hakbun, name, kor, eng, math);
			dto.calc();

			impl.input(dto);
			JOptionPane.showMessageDialog(this, "등록완료!");

			hakT.setText("");
			nameT.setText("");
			korT.setText("");
			engT.setText("");
			mathT.setText("");

		} else if (e.getSource() == dispB) {
			impl.print(area);
		} else if (e.getSource() == searchB) {
			impl.search(area);
		} else if (e.getSource() == tot_descB) {
			impl.sort();
			impl.print(area);
		} else if (e.getSource() == saveB) {
			impl.save();
		} else if (e.getSource() == loadB) {
			area.setText("");
			impl.load();
			impl.print(area);
		}
	}
}