import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Calculator{
	public static void main(String[]args) {
		myCalc myCalc = new myCalc();
		myCalc.setResizable(false);
		myCalc.setVisible(true);
		
	}
}

class myCalc extends JFrame{
	JTextField output1;
	JTextField input1,input2;
	myCalc(){
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,500);
		this.setTitle("Calculator");
		this.setLayout(new GridBagLayout());
		this.getContentPane().setBackground(Color.PINK);
		GridBagConstraints c= new GridBagConstraints();
		//add label for f1
		JLabel f1 = new JLabel("F1");
		c.gridx=0;
		c.gridy=0;
		c.ipadx=10;
		c.ipady=10;
	c.gridwidth=1;
		this.add(f1,c);
		//TextField input 1
	input1 = new JTextField(50);
		c.ipadx=200;
		c.ipady=10;
		c.weightx=1;
		c.weighty=0;
		c.gridx=1;
		c.gridy=0;
		c.gridwidth=3;
	
		
		this.add(input1, c);
		JLabel f2 = new JLabel("F2");
		c.gridx=0;
		c.gridy=1;
		c.ipadx=10;
		c.ipady=10;
		c.gridwidth=1;
		
		
		this.add(f2,c);
		//TextField input2
		 input2 = new JTextField(50);
		c.ipadx=200;
		c.ipady=10;
		c.weightx=1;
		c.weighty=0;
		c.gridx=1;
		c.gridy=1;
		c.gridwidth=3;
	
		this.add(input2,c);
		//add Button
		JButton add = new JButton("+");
		c.ipadx=50;
		c.ipady=25;
		c.gridx=0;
		c.gridy=3;
		c.gridwidth=1;
		c.weighty=1;
		
		c.insets=new Insets(0,10,0,10);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in1 = input1.getText();
				String in2= input2.getText();
				if(input1.getText().equals("") || input2.getText().equals("")) {
					output1.setText("Error");
				}else {
				double add= Double.parseDouble(in1)+Double.parseDouble(in2);
				output1.setText(Double.toString(add));
				}
			}
		});
		this.add(add, c);
		//add subtract
		JButton subtract = new JButton("-");
		c.ipadx=50;
		c.ipady=25;
		c.gridx=1;
		c.gridy=3;
		c.gridwidth=1;
		c.weighty=1;
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in1 = input1.getText();
				String in2 = input2.getText();
				if(input1.getText().equals("") || input2.getText().equals("")) {
					output1.setText("Error");
				} else {
				double subtract = Double.parseDouble(in1) - Double.parseDouble(in2);
				output1.setText(Double.toString(subtract));
				}
			}
		});
		this.add(subtract, c);
	     //add multiply
		JButton multiply = new JButton("*");
		c.ipadx=50;
		c.ipady=25;
		c.gridx=2;
		c.gridy=3;
		c.gridwidth=1;
		c.weighty=1;
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in1= input1.getText();
				String in2= input2.getText();
				if(input1.getText().equals("") || input2.getText().equals("")) {
					output1.setText("Error");
				}else {
					
				
				double multi = Double.parseDouble(in1)*Double.parseDouble(in2);
				output1.setText(Double.toString(multi));
				}
			}
		});

		this.add(multiply, c);
		//add divide
		JButton divide = new JButton("/");
		c.ipadx=50;
		c.ipady=25;
		c.gridx=3;
		c.gridy=3;
		c.gridwidth=1;
		c.weighty=1;
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in1=input1.getText();
				String in2=input2.getText();
				if(input1.getText().equals("")|| input2.getText().equals("")) {
					output1.setText("Error");
				}else {
				double divide=Double.parseDouble(in1)/Double.parseDouble(in2);
				output1.setText(Double.toString(divide));
				}
			}
		});

		this.add(divide, c);
		//output
		JLabel output = new JLabel("Output");
		c.ipadx=10;
		c.ipady=10;
		c.gridx=0;
		c.gridy=4;
		c.gridwidth=1;
		c.weighty=1;
		this.add(output, c);
		//output text box
	 output1= new JTextField(50);
		c.ipadx=200;
		c.ipady=10;
		c.gridx=1;
		c.gridy=4;
		c.weightx=1;
		c.weighty=1;
		c.gridwidth=3;
		output1.setEditable(false);
		
		this.add(output1, c);
		JButton copyTof1= new JButton("Copy Ans. to F1");
		c.ipadx=150;
		c.ipady=25;
		c.gridx=0;
		c.gridy=5;
		c.weighty=1;
		c.gridwidth=2;
		copyTof1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1.setText(output1.getText());
			}
		});
		this.add(copyTof1, c);
		JButton copyTof2= new JButton("Copy Ans. to F2");
		c.ipadx=150;
		c.ipady=25;
		c.gridx=2;
		c.gridy=5;
		c.weighty=1;
		c.gridwidth=2;
		copyTof2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input2.setText(output1.getText());
			}
		});
		
		this.add(copyTof2, c);
		JButton quit= new JButton("Quit");
		c.ipadx=150;
		c.ipady=25;
		c.gridx=0;
		c.gridy=6;
		c.weighty=1;
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		this.add(quit,c);
		JButton reset = new JButton("Reset");
		c.ipadx=150;
		c.ipady=25;
		c.gridx=2;
		c.gridy=6;
		c.weighty=1;
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1.setText("");
				input2.setText("");
				
			}
		});
		this.add(reset, c);
		
		JButton fix=new JButton("Fix");
		c.weighty=1;
		
		
		
	}
	
}