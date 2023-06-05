import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	String operator=null;
	boolean isClicked = false;
	String oldValue;
	JFrame jf;
	JLabel DisplayLabel;
	JButton ButtonNine;
	JButton ButtonEight;
	JButton ButtonSeven;
	JButton ButtonSix;
	JButton ButtonFive;
	JButton ButtonFour;
	JButton ButtonThree;
	JButton ButtonTwo;
	JButton ButtonOne;
	JButton ButtonPoint;
	JButton ButtonPlus;
	JButton ButtonMinus;
	JButton ButtonMultiply;
	JButton ButtonZero;
	JButton ButtonEqualTo;
	JButton ButtonDivision;
	JButton ButtonClear;
	
	public Calculator() {
		
		jf = new JFrame("CALCULATOR");
		jf.setSize(600,600);
		jf.setLayout(null);
		jf.setLocation(300, 80);
		jf.getContentPane().setBackground(Color.WHITE);
		
		
		DisplayLabel = new JLabel();
		DisplayLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);   
		DisplayLabel.setBounds(100, 20,340, 60);
		DisplayLabel.setBackground(Color.WHITE);
		DisplayLabel.setOpaque(true);
		jf.add(DisplayLabel);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		ButtonNine =new JButton("9");
		ButtonNine.setBounds(100,100,70,70);
		ButtonNine.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(ButtonNine);
		ButtonNine.addActionListener(this);
		
		ButtonEight =new JButton("8");
		ButtonEight.setBounds(190,100,70,70);
		jf.add(ButtonEight);
		ButtonEight.addActionListener(this);
		ButtonEight.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonSeven =new JButton("7");
		ButtonSeven.setBounds(280,100,70,70);
		jf.add(ButtonSeven);
		ButtonSeven.addActionListener(this);
		ButtonSeven.setFont(new Font("Arial", Font.PLAIN, 30));
		
		
		ButtonPlus =new JButton("+");
		ButtonPlus.setBounds(370,100,70,70);
		jf.add(ButtonPlus);
		ButtonPlus.addActionListener(this);
		ButtonPlus.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonSix =new JButton("6");
		ButtonSix.setBounds(100,190,70,70);
		jf.add(ButtonSix);
		ButtonSix.addActionListener(this);
		ButtonSix.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonFive =new JButton("5");
		ButtonFive.setBounds(190,190,70,70);
		jf.add(ButtonFive);
		ButtonFive.addActionListener(this);
		ButtonFive.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonFour =new JButton("4");
		ButtonFour.setBounds(280,190,70,70);
		jf.add(ButtonFour);
		ButtonFour.addActionListener(this);
		ButtonFour.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonMinus =new JButton("-");
		ButtonMinus.setBounds(370,190,70,70);
		jf.add(ButtonMinus);
		ButtonMinus.addActionListener(this);
		ButtonMinus.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonThree =new JButton("3");
		ButtonThree.setBounds(100,280,70,70);
		jf.add(ButtonThree);
		ButtonThree.addActionListener(this);
		ButtonThree.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonTwo =new JButton("2");
		ButtonTwo.setBounds(190,280,70,70);
		jf.add(ButtonTwo);
		ButtonTwo.addActionListener(this);
		ButtonTwo.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonOne =new JButton("1");
		ButtonOne.setBounds(280,280,70,70);
		jf.add(ButtonOne);
		ButtonOne.addActionListener(this);
		ButtonOne.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonMultiply =new JButton("*");
		ButtonMultiply.setBounds(370,280,70,70);
		jf.add(ButtonMultiply);
		ButtonMultiply.addActionListener(this);
		ButtonMultiply.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonZero =new JButton("0");
		ButtonZero.setBounds(190,370,70,70);
		jf.add(ButtonZero);
		ButtonZero.addActionListener(this);
		ButtonZero.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonPoint =new JButton(".");
		ButtonPoint.setBounds(100,370,70,70);
		jf.add(ButtonPoint);
		ButtonPoint.addActionListener(this);
		ButtonPoint.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonEqualTo =new JButton("=");
		ButtonEqualTo.setBounds(280,370,70,70);
		jf.add(ButtonEqualTo);
		ButtonEqualTo.addActionListener(this);
		ButtonEqualTo.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonDivision =new JButton("/");
		ButtonDivision.setBounds(370,370,70,70);
		jf.add(ButtonDivision);
		ButtonDivision.addActionListener(this);
		ButtonDivision.setFont(new Font("Arial", Font.PLAIN, 30));
		
		ButtonClear = new JButton("C");
		ButtonClear.setBounds(100,460,70,70);
		jf.add(ButtonClear);
		ButtonClear.setFont(new Font("Arial", Font.PLAIN, 25));
		ButtonClear.addActionListener(this);
		
	
	}
	
	public static void main(String[] args) {
		
			new Calculator();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==ButtonNine) {
			
			if(isClicked) {
				oldValue=DisplayLabel.getText();
				DisplayLabel.setText("9");
				isClicked=false;
			}
			else {
				DisplayLabel.setText(DisplayLabel.getText()+"9");
			}	
		}
		else if(e.getSource()==ButtonEight) {
			if(isClicked) {
				oldValue=DisplayLabel.getText();
				DisplayLabel.setText("8");
				isClicked=false;
			}
			else {
				DisplayLabel.setText(DisplayLabel.getText()+"8");
			}	
		}
		else if(e.getSource()==ButtonSeven) {
			if(isClicked) {
				oldValue=DisplayLabel.getText();
				DisplayLabel.setText("7");
				isClicked=false;
			}
			else {
				DisplayLabel.setText(DisplayLabel.getText()+"7");
			}	
		}
		else if(e.getSource()==ButtonSix) {
			if(isClicked) {
				oldValue=DisplayLabel.getText();
				DisplayLabel.setText("6");
				isClicked=false;
			}
			else {
				DisplayLabel.setText(DisplayLabel.getText()+"6");
			}	
		}
		else if(e.getSource()==ButtonFive) {
			if(isClicked) {
				oldValue=DisplayLabel.getText();
				DisplayLabel.setText("5");
				isClicked=false;
			}
			else {
				DisplayLabel.setText(DisplayLabel.getText()+"5");
			}	
		}
		else if(e.getSource()==ButtonFour) {
			if(isClicked) {
				oldValue=DisplayLabel.getText();
				DisplayLabel.setText("4");
				isClicked=false;
			}
			else {
				DisplayLabel.setText(DisplayLabel.getText()+"4");
			}	
		}
		else if(e.getSource()==ButtonThree) {
			if(isClicked) {
				oldValue=DisplayLabel.getText();
				DisplayLabel.setText("3");
				isClicked=false;
			}
			else {
				DisplayLabel.setText(DisplayLabel.getText()+"3");
			}	
		}
		else if(e.getSource()==ButtonTwo) {
			if(isClicked) {
				oldValue=DisplayLabel.getText();
				DisplayLabel.setText("2");
				isClicked=false;
			}
			else {
				DisplayLabel.setText(DisplayLabel.getText()+"2");
			}	
		}
		else if(e.getSource()==ButtonOne) {
			if(isClicked) {
				oldValue=DisplayLabel.getText();
				DisplayLabel.setText("1");
				isClicked=false;
			}
			else {
				DisplayLabel.setText(DisplayLabel.getText()+"1");
			}	
		}
		else if(e.getSource()==ButtonZero) {
			if(isClicked) {
				oldValue=DisplayLabel.getText();
				DisplayLabel.setText("0");
				isClicked=false;
			}
			else {
				DisplayLabel.setText(DisplayLabel.getText()+"0");
			}	
		}
		else if(e.getSource()==ButtonPoint) {
			if(isClicked) {
				oldValue=DisplayLabel.getText();
				DisplayLabel.setText(".");
				isClicked=false;
			}
			else {
				DisplayLabel.setText(DisplayLabel.getText()+".");
			}	
		}
		else if(e.getSource()==ButtonClear) {
			DisplayLabel.setText("");
		}
		else if(e.getSource()==ButtonPlus) {			
			isClicked=true;
			operator = "plus";
			
		}
		else if(e.getSource()==ButtonMinus) {
			isClicked = true;
			operator = "minus";
		}
		else if(e.getSource()==ButtonDivision) {
			isClicked=true;
			operator = "div";
		}
		else if(e.getSource()==ButtonMultiply) {
			isClicked=true;
			operator = "mul";
		}
		else if(e.getSource()==ButtonEqualTo) {
			if(operator == "plus") {
				String newValue = DisplayLabel.getText();
				float oldValueF = Float.parseFloat(oldValue);
				float newValueF = Float.parseFloat(newValue);
				
				float result = oldValueF + newValueF;
				DisplayLabel.setText(result+"");
				operator = null;
			}
			else if(operator == "minus") {
				String newValue = DisplayLabel.getText();
				float oldValueF = Float.parseFloat(oldValue);
				float newValueF = Float.parseFloat(newValue);
				
				float result = oldValueF - newValueF;
				DisplayLabel.setText(result+"");
				operator = null;
			}
			else if(operator == "mul") {
				String newValue = DisplayLabel.getText();
				float oldValueF = Float.parseFloat(oldValue);
				float newValueF = Float.parseFloat(newValue);
				
				float result = oldValueF * newValueF;
				DisplayLabel.setText(result+"");
				operator = null;
			}
			else if(operator == "div") {
				String newValue = DisplayLabel.getText();
				float oldValueF = Float.parseFloat(oldValue);
				float newValueF = Float.parseFloat(newValue);
				
				float result = oldValueF / newValueF;
				DisplayLabel.setText(result+"");
				operator = null;
			}
		}
	}
}