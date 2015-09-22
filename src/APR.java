import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class APR {

	public static void main(String[] args){
	Scanner input= new Scanner(System.in);
		
		System.out.print("Initial Tuition Costs:");
		double tuition_start=input.nextDouble();
		
		System.out.print("Percent increaser per year:");
		double percent_increase=input.nextDouble();
		
		System.out.print("Fixed loan APR:");
		double APR= input.nextDouble();
		
		System.out.print("How many years to pay off?:");
		double schedule=input.nextDouble();
	    input.close();
		
		
	    double total_cost = tuition_start;
	    double tuition=tuition_start;
		
	    /** I am pretty sure i am setting up the for loop up properly but it will not execute.
	    */
		for(int years=0; years<=2 ;years+=1 ){
			
			tuition=tuition*(1+percent_increase);
			total_cost+=tuition;
			System.out.print(total_cost + "\n");}
		/**This section provides the monthly payments
		 */
		
		double PMT;
		
		double r_2=((APR)/12);
		double n_2=(schedule*12);
		double p_2=0;
		double f_2=total_cost;
		boolean t_2=false;
		
		PMT=FinanceLib.pmt(r_2, n_2, p_2, f_2, t_2);
		
		System.out.print(PMT);
		
		
		
		}
		
		
		}
		
		
		
