import java.awt.*;



public class CalculatorGui extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static TextField display;
	public static Operand op;
	
	public CalculatorGui(Operand op){
		
		CalculatorGui.op = op;
		
		
		Font font;
		/*String special;			svhsta ola
		special = ("\u232b");
		//font = new Font("TimesRoman", Font.BOLD, 16);
		//font = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts()[22];
		try{
			//String decodedPath = URLDecoder.decode("C:\\Windows\\Fonts\\Segoe UI.ttf");
			font = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Windows\\Fonts\\ariali.ttf"));
			special = ("\u232b");
			System.out.println("FONT OPENED: " + font.getName());
		}catch(Exception ex){
			font = new Font("TimesRoman", Font.PLAIN, 16);
			special = "Backspace";
			System.out.println("WARNING: FONT NOT FOUND");
		}
		
		font = font.deriveFont(18.0f);
		
		
		/*font = font.deriveFont(Font.BOLD);
		Font[] temp = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
		for(int i = 0; i<Array.getLength(temp); i++)
			System.out.println(temp[i].getFontName()+ "  " + i);
		*/
		
		font = new Font("TimesRoman",Font.ITALIC, 18);
		
		this.setTitle("My RPN Calculator");
		this.setLayout(null);
		this.setLocation(50,100);
		this.setSize(300, 400);
		this.setFont(font);
		this.setBackground(Color.BLUE);
		this.setVisible(true);
		this.setResizable(true);
		this.toFront();
		
		this.addWindowListener(new CloseWindowAndExit()); 
		
		//this.add(button0);
		//button0.addActionListener(new MyHandler(this, button0));  O Listener uparxei mesa ston constructor tou MyButton pia.
		//this.add(button1);										Afou dexetai kai to frame san metavlhth mporoume na glitwsoume to .add(button) kathe fora.
		//button1.addActionListener(new MyHandler(this, button1));
		
		
		MyButton button0 = new MyButton(this, 30, 290, "0");	
		/*MyButton button1 = new MyButton(this, 64, 232, "2");	
		MyButton button2 = new MyButton(this, 64, 232, "3");	
		MyButton button3 = new MyButton(this, 64, 232, "4");	
		MyButton button4 = new MyButton(this, 64, 232, "5");	
		MyButton button5 = new MyButton(this, 64, 232, "6");	
		MyButton button6 = new MyButton(this, 64, 232, "7");	apo katw ginetai me for
		MyButton button7 = new MyButton(this, 64, 232, "8");	
		MyButton button8 = new MyButton(this, 64, 232, "9");
		
		*/
		
		for(int i = 0; i<9; i++){
			MyButton digitbuttons = new MyButton(this, 30 + 50*(i%3), 200 - 45 * ((i)/3 - 1), Integer.toString(i + 1));

		}
		
		MyButton enter = new MyButton(this, 80, 290, 90, 35, "Enter");
		MyButton add = new MyButton(this, 180, 155, 40, 35, "+");
		MyButton sub = new MyButton(this, 230, 155, 40, 35, "-");
		MyButton mult = new MyButton(this, 180, 200, 40, 35, "*");
		MyButton div = new MyButton(this, 230, 200, 40, 35, "/");
		MyButton equals = new MyButton(this, 180, 245, 90, 80, "=");
		
		
		MyButton clearline = new MyButton(this, 30, 110, 40, 35, "CE");
		MyButton clearall = new MyButton(this, 80, 110, 40, 35, " C ");
		MyButton backspace = new MyButton(this, 180, 110, 90, 35, "Backspace");
		
		
		display = new TextField();
		display.setEditable(false);
		display.setBounds(30, 55, 220, 30);
		this.add(display);
		
	}
	
	
	
	
		
}
