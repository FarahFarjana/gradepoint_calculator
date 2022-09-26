
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;



public class ErrorMessageForInvalidSubject extends JFrame{
	private JLabel item1;
	
	  public ErrorMessageForInvalidSubject() {
		super("ERROR");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("ERROR in number of subject,wrong cgpa has been calculated");
		item1.setToolTipText("Fraction error");
		add(item1);
		
	
	

	  }
}