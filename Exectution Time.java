package assignments;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class assignment1 {
	public static void main(String args[]){
	
		int sum = 0, n = 1000, j;
		long startTime = System.nanoTime();
		for(int i = 0; i < n; ++i ){
			for (j = 0; j < n*n; j++)
			sum++;
		}
			
		System.out.println("the total sum is " + sum);
		long endTime = System.nanoTime();
		
		NumberFormat formatter = new DecimalFormat ("#0.00");
		System.out.println("Execution time is " + formatter.format((endTime - startTime)/100000 ));
	}
}
