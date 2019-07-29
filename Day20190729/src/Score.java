import javax.swing.JTextArea;

public interface Score {
	public void input(ScoreDTO dto);

	public void print(JTextArea area);

	public void search(JTextArea area);

	public void sort();

	public void save();

	public void load();
}