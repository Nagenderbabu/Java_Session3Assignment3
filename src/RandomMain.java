import java.util.*;


public class RandomMain {
          	
	   

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create object of Random class
          Random r=new Random();
          
          // creating object of Random Number
		  RandomNumber rn=new RandomNumber();
		  
		  // Scanner object to accept input from user
		  Scanner sc =new Scanner(System.in);
		  
		  System.out.println("enter the number:");
		  
		  // assigning input to input variable 
		  rn.input=sc.nextInt();
		  
		  // passing input to random class method to get random variable between 0 and input
		   rn.value=r.nextInt(rn.input);
		//prints the random variable
		System.out.println(rn.value);
		   
	}

	
	

}
