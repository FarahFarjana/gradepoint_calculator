
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ErrorMassageForInvalidSemester extends JFrame{
      private JLabel item1;
	
	  public ErrorMassageForInvalidSemester() {
		super("ERROR");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("ERROR! please enter valid semester number");
		item1.setToolTipText("Fraction error");
		add(item1);
		
	}

}
