package HackerRankPrograms;

import java.util.Scanner;

public class Program2 {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        
        if(N%2!=0){
            System.out.println("Weird");
        }
        else if(N%2==0){
            
            if(N>=2 && N<=5){
                System.out.println("Not Weird");
                
            }
            else if(N>=6 && N<=20){
            	
                System.out.println("Weird");
                }
            	else {
            		if (N>20){
                        System.out.println("Not Weird");
                    }

            	}
            
        }       
        scanner.close();
    }

}

//Task
//Given an integer, , perform the following conditional actions:
//
//If N is odd, print Weird
//If N is even and in the inclusive range of to 2,5 print Not Weird
//If N is even and in the inclusive range of to 6,20 print Weird
//If N is even and greater than 20, print Not Weird
//
