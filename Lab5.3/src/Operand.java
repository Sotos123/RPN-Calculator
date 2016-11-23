
public class Operand implements OperandInt {
	String str = new String();;
	
	public void addDigit(char newdig){
		
		str = str + newdig;	
		CalculatorGui.display.setText(str);
	}
	
	public void deleteLastDigit(){
		if(!str.isEmpty())
			str = str.substring(0, str.length() - 1);	
		CalculatorGui.display.setText(str);
	}

	public void complete(){
		Calc.st.push(Double.valueOf(str));
		str = "";
	}
		
	public void reset(){
		Calc.st.clear();
		Calc.st.push(0.0);
		str = "";
		CalculatorGui.display.setText(str);
	}
	
	public void del(){
		str = "";
		CalculatorGui.display.setText(str);
	}
	
	public void ret(){
		Double temp = new Double(Calc.st.peek());
		
		if(temp.intValue() == temp)
			CalculatorGui.display.setText(String.valueOf(temp.intValue()));
		else 
			CalculatorGui.display.setText(Double.toString(temp));
		
	}
}
