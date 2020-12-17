package cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cal {
	
	double first;
	double second;
	double result;
	String operation;
	String fanswer ;

	private JFrame frame;
	private JTextField textField;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnClear;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btndot;
	private JButton btn00;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnequal;
	private JButton btnPlus;
	private JButton btnminus;
	private JButton btnmultiply;
	private JButton btndivide;
	private JButton btnPercentage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 228, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 11, 217, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnB.setBounds(0, 71, 54, 52);
		frame.getContentPane().add(btnB);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {String number = textField.getText()+btn7.getText(); 
			textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(0, 121, 54, 52);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+btn4.getText(); 
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(0, 172, 54, 52);
		frame.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+btn1.getText(); 
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(0, 223, 54, 52);
		frame.getContentPane().add(btn1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+btn0.getText(); 
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(0, 273, 54, 52);
		frame.getContentPane().add(btn0);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(55, 71, 54, 52);
		frame.getContentPane().add(btnClear);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+btn8.getText(); 
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(55, 121, 54, 52);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+btn5.getText(); 
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(55, 172, 54, 52);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+btn2.getText(); 
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(55, 223, 54, 52);
		frame.getContentPane().add(btn2);
		
		btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+btndot.getText(); 
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndot.setBounds(55, 273, 54, 52);
		frame.getContentPane().add(btndot);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+btn00.getText(); 
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(110, 71, 54, 52);
		frame.getContentPane().add(btn00);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+btn9.getText(); 
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(110, 121, 54, 52);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+btn6.getText(); 
				textField.setText(number);}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(110, 172, 54, 52);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+btn3.getText(); 
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(110, 223, 54, 52);
		frame.getContentPane().add(btn3);
		
		btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String answer;
			second=Double.parseDouble(textField.getText());
			if(operation=="+") {
				
				result=first+second;
				answer=String.format("%.2f",result);
				textField.setText(answer);
				}
			
			else if(operation=="-") {
				result=first-second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
			}
			else if(operation=="*") {
				result=first*second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
			}
			else if(operation=="/") {
				result=first/second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
			}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnequal.setBounds(110, 273, 54, 52);
		frame.getContentPane().add(btnequal);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			first =Double.parseDouble(textField.getText());
			textField.setText("");
			operation="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(163, 71, 54, 52);
		frame.getContentPane().add(btnPlus);
		
		btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first =Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnminus.setBounds(163, 121, 54, 52);
		frame.getContentPane().add(btnminus);
		
		btnmultiply = new JButton("*");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first =Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmultiply.setBounds(163, 172, 54, 52);
		frame.getContentPane().add(btnmultiply);
		
		btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first =Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndivide.setBounds(163, 223, 54, 52);
		frame.getContentPane().add(btndivide);
		
		btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first =Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercentage.setBounds(163, 273, 54, 52);
		frame.getContentPane().add(btnPercentage);
	}
}

