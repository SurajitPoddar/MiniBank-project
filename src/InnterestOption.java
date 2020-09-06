import java.util.Scanner;
import java.sql.*;
class InnterestOption {

	 		void SavingsInterestCalculation() {
			
			double principle = 0, time = 0, simple_interest;
		    double rate_of_interest = 5;
		    
		    Scanner scan = new Scanner(System.in);
		    
		    try {
		    System.out.print("Enter your principle amount."+"\nRs. ");
		    principle = scan.nextFloat();
		    principle = Math.abs(principle);
		    }	catch(Exception e) {
		    	
		    	System.out.println("Invalid input.\nTry again.");
		    	InnterestOption obj2 = new InnterestOption();
		    	obj2.InnterstOption();
		    }
		    
		    try {
		    System.out.print("Enter the time period in year for savings: ");
		    time = scan.nextFloat();
		    time = Math.abs(time);		    
		    }	catch(Exception e) {
		    	
		    	 System.out.println("Invalid input.\nTry again.");
		    	 InnterestOption obj3 = new InnterestOption();
			     obj3.InnterstOption();
		    }
		 
		    simple_interest=(principle*rate_of_interest*time)/100;                         //Simple Interest = (P*R*T)/100
			System.out.println("\nSimple interest is Rs. "+simple_interest);
			System.out.print("Your total money would be Rs. "+(simple_interest+principle)+"\n\nThank you visit again.\n#BeSafe and have fun!!!");
		}
				   
			void FixedDepositCalculation() {
			
			double principle = 0, time = 0;
		    double rate_of_interest = 10, n=12;
		    
		    Scanner scan = new Scanner(System.in);
		    
		    try {
		    	System.out.print("\n\nEnter your principle money for fixed deposit: "+"\nRs.");
				principle=scan.nextFloat();
				principle=Math.abs(principle);
		    }	catch(Exception e) {
		    	
		    	System.out.println("Invalid input.\nTry again.");
		    	InnterestOption obj4 = new InnterestOption();
		    	obj4.InnterstOption();
		    }
		    
		    try {
		    	System.out.print("Enter the time period for fixed deposit in year: ");
				time=scan.nextFloat();
				time=Math.abs(time);
		    }	catch(Exception e1) {
		    	
		    	System.out.println("Invalid input.\nTry again.");
		    	InnterestOption obj5 = new InnterestOption();
		    	obj5.InnterstOption();
		    }
		    
		    double amount=(principle*Math.pow(1+(rate_of_interest=0.1/n), n*time));     //double rate=0.1;
			double compound_interest=amount-principle;
			
			System.out.println("Compound interest is Rs. "+compound_interest);
			System.out.println("Your total fixed deposid amount would be Rs. "+amount);
	}
		
		
		
			public  void InnterstOption() {
					
			int option = 0;
			for(; ;) {
			Scanner scan = new Scanner(System.in);
				
		    System.out.println("\nChoose any option to proceed.\n\n");
		    System.out.println("1. Calculate interest on Savings account.\n2. Calculate interest on Fixed deposit account.\n3. Exit.");
		    
		    try {
		    System.out.print("Your option: ");
		    option=(int) scan.nextFloat();
		    option=Math.abs(option);
		    }	catch(Exception e) {
		    	
		    	System.out.println("\nProvide correct input to proceed.\nPut correct iniger value.");
		    } 
			
			switch(option) {
				case 1:
					SavingsInterestCalculation();
					break;
					
				case 2:
					FixedDepositCalculation();
					break;
					
				case 3:
					System.out.println("Proceeding to exit.");
					System.exit(0);	
					break;
				
				default:
					try {
						System.out.println("Try any number to proceed again.");
						InnterestOption obj6 = new InnterestOption();
				    	obj6.InnterstOption();
					}	catch (Exception e3) {
						
						System.out.println("Try any number to proceed again.");
						InnterestOption obj7 = new InnterestOption();
				    	obj7.InnterstOption();
					}
					break;					
			}
				
		}
     }
}