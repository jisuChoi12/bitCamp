package kr.co.bit;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

import javax.swing.JFrame;

class Calculator extends Frame {
	private Button[] btn;
	private Label upL, downL;

	public void init(){
		
		setTitle("°è»ê±â");
		setBounds(800,250,300,400);
		setBackground(new Color(100,100,100));
		setVisible(true);
	}


	public static void main(String[] args) {
		new Calculator().init();
	}
}
