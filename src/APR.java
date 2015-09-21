import java.util.Scanner;

public class APR {

	public static void main(String[] args){
	Scanner input= new Scanner(System.in);
		
		System.out.print("Initial Tuition Costs:");
		double tuition_start=input.nextDouble();
		
		System.out.print("Percent increaser per year:");
		double percent_increase=input.nextDouble();
		
		System.out.print("Fixed loan APR");
		double APR= input.nextDouble();
		
		System.out.print("How many years to pay off?:");
		double schedule=input.nextDouble();
	    input.close();
		
		
	    double sum = tuition_start;
		
	    /** I am pretty sure i am setting up the for loop up properly but it will not execute.
	    */
		for(int years=0; (years==4);years+=1 ){
			sum+=(tuition_start*(1+percent_increase));
			System.out.print(sum);}
		
		
		
		}
		
		
		}
		
		
		
