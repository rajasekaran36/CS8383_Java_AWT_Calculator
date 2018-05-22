import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Numpan extends Panel implements ActionListener{
	Button n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,point,equal;
	Button plus,minus,multiply, divide;
	TextField display;
	String op1,op2;
	int op_flag;
	public Numpan(TextField display) {
		this.display = display;
		setLayout(new GridLayout(0,4));
		
		n0 = new Button("0");
		n0.setActionCommand("zero");
		n0.addActionListener(this);
		n1 = new Button("1");
		
		n2 = new Button("2");
		n3 = new Button("3");
		n4 = new Button("4");
		n5 = new Button("5");
		n6 = new Button("6");
		n7 = new Button("7");
		n8 = new Button("8");
		n9 = new Button("9");
		point = new Button(".");
		equal = new Button("=");
		plus = new Button("+");
		minus = new Button("-");
		multiply = new Button("x");
		divide = new Button("/");
		add(n1);
		add(n2);
		add(n3);
		add(plus);
		add(n4);
		add(n5);
		add(n6);
		add(minus);
		add(n7);
		add(n8);
		add(n9);
		add(multiply);
		add(point);
		add(n0);
		add(equal);
		add(divide);
		n1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String data = display.getText().toString();
		switch(e.getActionCommand()){
		case "zero":
			display.setText(data+"0");
			break;
		case "one":
		}
	}
}

class Calculator extends Frame implements WindowListener{
	TextField display;
	public Calculator() {
		display = new TextField();
		display.setFont(new Font("Times New Roman", Font.BOLD, 20));
		setLayout(new BorderLayout());
		add(new Numpan(display),BorderLayout.CENTER);
		add(display,BorderLayout.NORTH);
		setVisible(true);
		setSize(300,300);
		addWindowListener(this);
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		new Calculator();
	}

}
