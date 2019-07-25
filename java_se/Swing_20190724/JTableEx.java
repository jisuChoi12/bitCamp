import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

class JTableModel extends AbstractTableModel {
	Object[][] data = {{"AAA","aaa",new Integer(1111),"a1"},
					   {"BBB","bbb",new Integer(2222),"b2"},
					   {"CCC","ccc",new Integer(3333),"c3"},
					   {"DDD","ddd",new Integer(4444),"d4"},
					   {"EEE","eee",new Integer(5555),"e5"},
				   	   {"FFF","fff",new Integer(6666),"f6"},
					   {"GGG","ggg",new Integer(7777),"g7"},
					   {"HHH","hhh",new Integer(8888),"h8"},
				       {"III","iii",new Integer(9999),"i9"},
					   {"JJJ","jjj",new Integer(0000),"j0"}};

	String[] name = {"아이디","이름","비밀번호","구분"};
	public int getColumnCount(){
		return name.length;
	}
	public int getRowCount(){
		return data.length;
	}
	public Object getValueAt(int r, int c){
		return data[r][c];
	}
	public boolean isCellEditable(int r, int c){
		return (c!=0) ? true : false;
	}
	public String getColumnName(int c){
		return name[c];
	}
	public void setValueAt(Object obj, int r, int c){
		data[r][c]=obj;
	}
}

class JTableEx extends JFrame {
	private JTable table;
	private JTableModel model;

	public JTableEx(){
		model = new JTableModel();
		table = new JTable(model);
		add(new JScrollPane(table));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200,300,300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTableEx();
	}
}
