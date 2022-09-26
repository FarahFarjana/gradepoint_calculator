
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ending extends JFrame{
private JLabel item1;
	
	public Ending() {
		super("Message");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("Thank You For Using Our System");
		item1.setToolTipText("🙂");
		add(item1);
		
	}

}