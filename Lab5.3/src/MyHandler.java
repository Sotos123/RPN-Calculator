import java.awt.event.*; 
import java.awt.*;

public class MyHandler implements ActionListener {
	Frame frame;
	MyButton b;
	public MyHandler(Frame f, MyButton b){
		frame = f;
		this.b = b;
	}
	public void actionPerformed(ActionEvent e) {
		CalculatorGui.op.addDigit(b.getLabel().charAt(0));
		
	}

}
