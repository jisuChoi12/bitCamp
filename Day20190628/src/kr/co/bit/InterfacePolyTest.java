package kr.co.bit;

public class InterfacePolyTest {

	public static void main(String[] args) {
		CommandProcess cp = new CommandProcess();
		WriteCommand wc = new WriteCommand();
		Listcommand lc = new Listcommand();
		cp.process(wc);
		cp.process(lc);

	}

}
