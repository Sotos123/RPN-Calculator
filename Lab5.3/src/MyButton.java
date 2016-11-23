import java.awt.*;

public class MyButton extends Button {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
		public MyButton(Frame f,int x, int y, String s){
			
			this.setBounds(new Rectangle(x , y, 40, 35));
			this.setBackground(Color.yellow);
			this.setLabel(s);
			this.addActionListener(new MyHandler(f, this));
			f.add(this);
		}
		
		public MyButton(Frame f,int x, int y,int width, int height, String s){
			this.setFont(f.getFont());
			this.setBounds(new Rectangle(x , y, width, height));
			this.setBackground(Color.yellow);
			this.setLabel(s);
			this.addActionListener(new SpecialHandler(f, this));
			f.add(this);
		}
}