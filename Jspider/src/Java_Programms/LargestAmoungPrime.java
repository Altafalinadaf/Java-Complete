package Java_Programms;

public class LargestAmoungPrime {
	public static void main(String[] args) {
		int count=0;
		int largest=Integer.MIN_VALUE;
		int sum=0;
		
		for(int i=1;i<=1000;i++) {
			count=0;
			sum=i;
			for(int j=1;j<=sum;j++) {
				if(sum%j==0) {
					count++;
				}
			}
			if(count==2) {
				if(largest<sum) {
					largest=sum;
					
					//sum=0;
					
				}
				
			}		
		}
		System.out.println("the largest amoung given number is : "+largest);
		
	
	}

}
