

class Calculator {
	private Button[] btn;
	private Label upL, downL;

	public void init(){

		setBounds(800,250,300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator().init();
	}
}
