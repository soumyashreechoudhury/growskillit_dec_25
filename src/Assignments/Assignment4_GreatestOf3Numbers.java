package Assignments;

public class Assignment4_GreatestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=67556;int num2=123;int num3=5671;
		if(num1>num2 && num1>num3)
			System.out.println("The greatest number is :" + num1);
		else if(num2>num3 && num2>num1)
			System.out.println("The greatest number is :" + num2);
		else
			System.out.println("The greatest number is :" + num3);
	}

}