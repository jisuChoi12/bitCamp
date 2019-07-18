import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


class Card {
	private Frame frame; // ±âº»:BorderLayout
	private CardLayout card;

	public void init(){
		
		frame = new Frame();
		card = new CardLayout();
		frame.setLayout(card);

		Panel[] panel = new Panel[5];
		Color[] color = {new Color(236,43,43),new Color(63,205,143),new Color(50,87,235),
									new Color(165,79,250),new Color(51,153,255)};
		String[] name = {"»¡°­","ÃÊ·Ï","ÆÄ¶û","º¸¶ó","ÇÏ´Ã"};
		
		for(int i=0; i<panel.length; i++){
			panel[i] = new Panel();
			panel[i].setBackground(color[i]);
			frame.add(panel[i], name[i]);

			panel[i].addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					//card.next(frame);
					card.show(frame, name[(int)(Math.random()*5)]);
				}
			});
		}
		
		frame.setBounds(500,150,200,200);
		frame.setVisible(true);

		// event
		frame.addWindowListener(new WindowAdapter(){ 
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Card().init();
	}
}
