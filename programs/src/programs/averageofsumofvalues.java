package programs;

//import java.util.Scanner;

public class averageofsumofvalues {
	public static void main(String args[]) {
		int[] arr= {75,58,69,87,59,98,78,58};
		int sum =0;
		
		for (int element:arr) {
			sum +=element;
		}
		System.out.println("the sum of average number is :"+sum/arr.length);
		
		// in different ways asking user to input 
		/*
		 * int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("how much number do you want to make avaerage : ");
		int num=scanner.nextInt();
		for (int i=1;i<=num;i++) {
			System.out.print("Enter the numner " +i+ ": ");
			int num1=scanner.nextInt();
			sum =sum+ num1;
		}
		int avg=sum/num;
		System.out.print("The average of sum of number is : "+avg);
		
		 */
	}

}
