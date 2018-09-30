import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Listener {
	public static void main(String[] args) {
		myListener myListener = new myListener();
		myListener.setResizable(false);
		myListener.setVisible(true);
	}

}

class myListener extends JFrame {
	JTextField output;
	Boolean b = false;
	

	myListener() {
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.setSize(300, 200);
		this.setTitle("Listener");
		this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		JLabel inputL = new JLabel("Enter String");
		inputL.setSize(50,50);
		this.add(inputL);
		JTextField input = new JTextField(20);
		input.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(b) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					
						String str = input.getText();

						char[] array = str.toCharArray();
						String yes = "";
						for (int i = array.length - 1; i >= 0; i--) {
							yes = yes + str.charAt(i);

						}

						output.setText(yes);

					}
					b=false;
				}
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		input.addMouseListener(new MouseListener() {


			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				b=true;
				
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			});
		input.setSize(225,50);
		this.add(input);
		JButton reverse = new JButton("Reverse String");
		reverse.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String str = input.getText();

				char[] array = str.toCharArray();
				String yes = "";
				for (int i = array.length - 1; i >= 0; i--) {
					yes = yes + str.charAt(i);

				}
				

				output.setText(yes);

			}
		});
		
	reverse.setSize(225,100);
		this.add(reverse);
		output = new JTextField(20);

		output.setEditable(false);
		output.setSize(225,100);
		this.add(output);

	}

}
