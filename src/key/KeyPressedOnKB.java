package key;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class KeyPressedOnKB extends JFrame{
	public KeyPressedOnKB() {
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				char l = e.getKeyChar();
				System.out.println(l);
			}
		});
		
		setTitle("Add Image");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
	}
	public static void main(String[] args) {
		new KeyPressedOnKB();
	}

	
}
