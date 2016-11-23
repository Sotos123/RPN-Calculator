import java.util.Stack;

public class Calc {
	static Stack<Double> st;
	
	public static void main(String[] args){
		
		st = new Stack<Double>();
		st.push(0.0);
		Operand op = new Operand();
		
		CalculatorGui calcgui = new CalculatorGui(op);
		
		//char test = '\u232b';
		//System.out.println(test);
		//Double test;
		System.out.println(st.peek().intValue());
		
	}
}
