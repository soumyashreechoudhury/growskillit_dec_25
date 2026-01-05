package Assignments;

public class Assignment4_GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=65;
		if(marks>=90 && marks<=100)
		{
			System.out.println("The grade is A");
		}
		else if(marks>=75 && marks<=89)
		{
			System.out.println("The grade is B");
		}
		else if(marks>=50 && marks<=74)
		{
			System.out.println("The grade is C");
		}
		else
		{
			System.out.println("The grade is Fail");
		}
	}

}
