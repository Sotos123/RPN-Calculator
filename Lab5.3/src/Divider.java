
public class Divider {
	static void operate(){
		if (Calc.st.size() >= 2){
			Double temp = new Double(Calc.st.pop());
			Calc.st.push(Calc.st.pop() / temp);
		}else
			CalculatorGui.display.setText("Not enough operands.");
	}
}
