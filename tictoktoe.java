import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener{
	Button b[] = new Button[9];
	Label win;
	int x = 100;
	int y = 100;
	int w = 100;
	int h = 100;
	FDemo()
	{
		setTitle("Tictoktoe Game");
		Font f = new Font("Ariel",Font.BOLD,25);
		setFont(f);
		setLayout(null);
		int k = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[k] = new Button();
				b[k].setSize(w,h);
				b[k].setLocation(x,y);
				add(b[k]);
				b[k].addActionListener(this);
				k++;
				x+=100;
				
			}
			x=100;
			y+=100;
		}
		
	}
	int c =0;
	public void actionPerformed(ActionEvent e)
	{
		Button b1= (Button)e.getSource();
		c++;
		if(c%2==0)
		{
			b1.setLabel("o");
		}
		else
		{
			b1.setLabel("x");
		}
		b1.removeActionListener(this);
		if(
		   (b[0].getLabel()=="o"&&b[1].getLabel()=="o"&&b[2].getLabel()=="o")||
		   (b[3].getLabel()=="o"&&b[4].getLabel()=="o"&&b[5].getLabel()=="o")||
		   (b[6].getLabel()=="o"&&b[7].getLabel()=="o"&&b[8].getLabel()=="o")||
		   (b[0].getLabel()=="o"&&b[3].getLabel()=="o"&&b[6].getLabel()=="o")||
		   (b[1].getLabel()=="o"&&b[4].getLabel()=="o"&&b[7].getLabel()=="o")||
		   (b[2].getLabel()=="o"&&b[5].getLabel()=="o"&&b[8].getLabel()=="o")||
		   (b[0].getLabel()=="o"&&b[4].getLabel()=="o"&&b[8].getLabel()=="o")||
		   (b[2].getLabel()=="o"&&b[4].getLabel()=="o"&&b[6].getLabel()=="o")
		   )
		   {
			   win = new Label("0 is a winner");
			   win.setSize(200,50);
			   win.setLocation(200,400);
			   add(win);
			   //c=10;
		   }
		else if(
			(b[0].getLabel()=="x"&&b[1].getLabel()=="x"&&b[2].getLabel()=="x")||
		   (b[3].getLabel()=="x"&&b[4].getLabel()=="x"&&b[5].getLabel()=="x")||
		   (b[6].getLabel()=="x"&&b[7].getLabel()=="x"&&b[8].getLabel()=="x")||
		   (b[0].getLabel()=="x"&&b[3].getLabel()=="x"&&b[6].getLabel()=="x")||
		   (b[1].getLabel()=="x"&&b[4].getLabel()=="x"&&b[7].getLabel()=="x")||
		   (b[2].getLabel()=="x"&&b[5].getLabel()=="x"&&b[8].getLabel()=="x")||
		   (b[0].getLabel()=="x"&&b[4].getLabel()=="x"&&b[8].getLabel()=="x")||
		   (b[2].getLabel()=="x"&&b[4].getLabel()=="x"&&b[6].getLabel()=="x")
		)
		{
			win = new Label("x is a winner");
			   win.setSize(200,50);
			   win.setLocation(200,400);
			   add(win);
			   //c=10;
		}
	}
}
class tictoktoe
{
	public static void main(String[] ayush)
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(600,600);
		f.setLocation(100,200);
		
	}
}
