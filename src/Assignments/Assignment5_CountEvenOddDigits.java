package Assignments;

public class Assignment5_CountEvenOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2487964;
		int ecount=0;
		int ocount=0;
		while(num>0)
		{
			int digit=num%10;
			if(digit%2==0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
			num=num/10;
		}
		System.out.println("Even number count: "+ecount);
		System.out.println("Odd number count: "+ocount);
	}

}
