import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


class ScoreImpl implements Score {
	private ArrayList<ScoreDTO> list = new ArrayList<ScoreDTO>();

	public void input(ScoreDTO dto) {
		list.add(dto);
	}

	public void print(JTextArea area) {
		area.setText("");
		for (ScoreDTO dto : list) {
			area.append(dto.toString() + "\n");
		}
	}
 
	public void search(JTextArea area) {
		int sw = 0;
		String hakbun = JOptionPane.showInputDialog(null, "학번을 입력하세요");
		if (hakbun == null || hakbun.equals("")) {
			return;
		}
		area.setText("");
		for (ScoreDTO dto : list) {
			if (hakbun.equals(dto.getHakbun())) {
				area.append(dto.toString() + "\n");
				sw++;
			}
		}
		if (sw == 0) {
			JOptionPane.showMessageDialog(null, "찾고자 하는 학번이 없습니다");
		}
	}

	public void sort() {
		//Collections.sort(list);
		Comparator<ScoreDTO> com = new Comparator<ScoreDTO>() {
			@Override
			public int compare(ScoreDTO o1, ScoreDTO o2) {
				return o1.getTot() < o2.getTot() ? 1 : -1;
//				if(o1.getTot() < o2.getTot()) { return 1;}
//				else if(o1.getTot() > o2.getTot()) { return -1;}
//				return 0;
			}
		};
		Collections.sort(list,com);
	}

	public void save() {
		File file = null;
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
		if (file == null) {
			return;
		}
		int count = list.size();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeInt(count);
			for (ScoreDTO dto : list) {
				oos.writeObject(dto);
				oos.flush();
			}
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void load() {
		File file = null;
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
				int count = ois.readInt();
				ScoreDTO dto = null;
				list.clear();
				for (int i = 0; i < count; i++) {
					list.add((ScoreDTO) ois.readObject());
				}
				ois.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		if (file == null) {
			return;
		}
	}

}
