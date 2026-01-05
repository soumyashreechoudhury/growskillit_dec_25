package Assignments;

public class Assignment5_FactorsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print("The factors are :");
				System.out.println(i);
			}
		}
	}

}
