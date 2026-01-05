package Assignments;

public class Assignment6_SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6776;
		int sum=0;
		while(num>0)
		{
			int num1=num%10;
			sum=sum+num1;
			num=num/10;
		}
		System.out.println("The sum of digits:" + sum);
	}

}
