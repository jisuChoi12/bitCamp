import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class TryNotepad extends JFrame implements ActionListener {
	private JTextArea area;
	private MenuPane menu;
	private File file;
	private JFileChooser chooser = new JFileChooser();
	private int result;

	public TryNotepad() {
		area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		menu = new MenuPane();
		this.setJMenuBar(menu);

		Container con = getContentPane();
		con.add("Center",scroll);

		setBounds(300,200,500,500);
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	public void event(){
		menu.getNewM().addActionListener(this);
		menu.getOpenM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getExitM().addActionListener(this);
		menu.getCutM().addActionListener(this);
		menu.getCopyM().addActionListener(this);
		menu.getPasteM().addActionListener(this);
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				result = JOptionPane.showConfirmDialog(TryNotepad.this,"저장하시겠습니까?","메모장",
					JOptionPane.YES_NO_CANCEL_OPTION, 
					JOptionPane.QUESTION_MESSAGE);
				if(result==JOptionPane.YES_OPTION) {
					saveDialog();
					fileWrite();
					System.exit(0);
				}
				else if(result==JOptionPane.NO_OPTION) {
					System.exit(0);
				} else {
					return;
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menu.getNewM()) {
			area.setText("");
		}else if(e.getSource()==menu.getOpenM()) {
			//경로&파일명
			openDialog();
			fileRead();
		}else if(e.getSource()==menu.getSaveM()) {
			saveDialog();
			fileWrite();
		}else if(e.getSource()==menu.getExitM()) {
			result = JOptionPane.showConfirmDialog(this,"저장하시겠습니까?","메모장",
					JOptionPane.YES_NO_CANCEL_OPTION, 
					JOptionPane.QUESTION_MESSAGE);
				if(result==JOptionPane.YES_OPTION) {
					saveDialog();
					fileWrite();
					System.exit(0);
				}
				else if(result==JOptionPane.NO_OPTION) {
					System.exit(0);
				}
		}else if(e.getSource()==menu.getCutM()) {
			area.cut();
		}else if(e.getSource()==menu.getCopyM()) {
			area.copy();
		}else if(e.getSource()==menu.getPasteM()) {
			area.paste();
		}
	}

	public void openDialog(){
		result = chooser.showOpenDialog(this);
		if(result==JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		} else if(result==JFileChooser.CANCEL_OPTION) {
			return;
		}
		JOptionPane.showMessageDialog(this,file);
	}

	public void fileRead(){
		if(file==null){
			return;
		}
		String line = null;
		area.setText("");
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null) {
				area.append(line+"\n");
			}
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void saveDialog(){
		result = chooser.showSaveDialog(this);
		if(result==JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
	}

	public void fileWrite(){
		if(file==null){
			return;
		}
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(area.getText());
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
 	}

	public static void main(String[] args) {
		new TryNotepad().event();
	}
}
