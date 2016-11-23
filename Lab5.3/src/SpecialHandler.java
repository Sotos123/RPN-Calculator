import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.*; 

public class SpecialHandler implements ActionListener {
	Frame frame;
	MyButton b;
	public SpecialHandler(Frame f, MyButton b){
		frame = f;
		this.b = b;
	}
	public void actionPerformed(ActionEvent e) {
		char temp = b.getLabel().charAt(0);
		switch(temp){
		case 'E':
			CalculatorGui.op.complete();
			System.out.println(Calc.st.peek());
			break;
		case '+':
			Adder.operate();
			break;
		case '-':
			Subtractor.operate();
			break;
		case '*':
			Multiplier.operate();
			break;
		case '/':
			Divider.operate();
			break;
		case '=':
			CalculatorGui.op.ret();
			break;
		case ' ':
			CalculatorGui.op.reset();;
			break;
		case 'C':
			CalculatorGui.op.del();
			break;
		case 'B':
			CalculatorGui.op.deleteLastDigit();
			break;
		}
		
	}

}
