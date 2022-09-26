
import java.util.Scanner;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Runner {

	public static void main(String[] args) {
		
		LoginFrame frame = new LoginFrame();
		frame.setTitle("WELCOME TO OUR SYSTEM");
		frame.setVisible(true);
		frame.setBounds(10,10,400,500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setResizable(false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n        GRADEPOINT CALCULATION\n    ==============================");
		System.out.println("\nEnter percentage of your marks (less than 100):");
	      
	      double average = sc.nextDouble();
	      if(average>=80){
	          System.out.println("Your Grade is A+ and gardepoint is 4.0");
	      }
	      else if(average>=75 && average<80){
	         
	         System.out.println("Your Grade is A and gradepoint is 3.75");
	      }
	      else if(average>=70 && average<75){
	        
	         System.out.println("Your Grade is A- and gradepoint is 3.50");
	         
	      }
	      else if(average>=65 && average<70){
		         
		         System.out.println("Your Grade is B+ and gradepoint is 3.25");
		         
	      }
	      else if(average>=60 && average<65){
		        
		         System.out.println("Your Grade is B and gradepoint is 3.00");
		         
          }
	      else if(average>=55 && average<60){
		        
		         System.out.println("Your Grade is B- and gradepoint is 2.75");
		         
		  }
	      else if(average>=50 && average<55){
		         
		         System.out.println("Your Grade is C+ and gradepoint is 2.50");
		          }
	      else if(average<50) {
	    	  System.out.println("Failed");
	    	   }
	      else
	    	  System.out.println("Invalid average");


		double sum=0;
		double creditHour=0;
		double ave_cgpa=0;
		
		
		int answer = JOptionPane.showConfirmDialog(null, "Do you want to calculate your CGPA?","OPTION",JOptionPane.YES_NO_OPTION);
		
		if (answer == JOptionPane.YES_OPTION) {
		
		
		System.out.println("\n          CGPA CALCULATION\n     ===========================");
		System.out.println("\nEnter the number of semester:");
		
		
		double semester = sc.nextDouble();
	    
		if(semester%1==0) {
		for(int i=1;i<=semester;i++) {
		
		System.out.println("Enter how many subject u have for "+i+" semester:");
		
		
		double a = sc.nextDouble();
		
		if(a%1==0) {
		
		for(int j=0;j<a;j++) {
			
			System.out.println("Please enter correct credit hour and gradePoint:");
			
			double credit= sc.nextDouble();
			double gradepoint = sc.nextDouble();
			sum = sum+(credit*gradepoint);
			creditHour = creditHour + credit;
			
		}
		double cgpa = sum/creditHour;
		System.out.println("After your "+i+" semester your average cgpa is: "+cgpa);
		ave_cgpa = ave_cgpa+cgpa;
		}
		
		else {
			ErrorMessageForInvalidSubject e = new ErrorMessageForInvalidSubject();
			e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			e.setSize(500,300);
			e.setVisible(true);
			break;
		
		}
		}
			
		ave_cgpa = ave_cgpa/semester;
		
		JOptionPane.showMessageDialog(null,"Your overall CGPA is "+ave_cgpa);
		Ending  e = new Ending();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setSize(500,300);
		e.setVisible(true);

		}
	
		
		else {
			ErrorMassageForInvalidSemester e = new ErrorMassageForInvalidSemester();
			e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			e.setSize(500,300);
			e.setVisible(true);

		}
		sc.close();	
		
	} 
		else if(answer == JOptionPane.NO_OPTION) {
			Ending  e = new Ending();
			e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			e.setSize(500,300);
			e.setVisible(true);

			
		}
		

}
}