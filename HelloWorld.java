import java.awt.*;
public class HelloWorld {
	public static void main(String args[])
	{
		Frame f=new Frame();
		
		f.setLayout(new BorderLayout());
		f.setSize(300,300);
		f.setVisible(true);
		Button b1=new Button("E");
		Button b2=new Button("W");
		Button b3=new Button("S");
		Button b4=new Button("N");
		Button b5=new Button("C");
		f.add(b1,BorderLayout.EAST);
		f.add(b2,BorderLayout.WEST);
		f.add(b3,BorderLayout.SOUTH);
		f.add(b4,BorderLayout.NORTH);
		f.add(b5,BorderLayout.CENTER);
		
		
		
}
}
