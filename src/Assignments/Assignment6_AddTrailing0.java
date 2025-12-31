package Assignments;

public class Assignment6_AddTrailing0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=45;
		int originalNumber=num;
		int countDigit=0;
		int result=0;
		while(num>0)
		{
			countDigit++;
			num=num/10;
		}
		if(countDigit==1)
		{
			result=originalNumber*10;
		}
		else if(countDigit==2)
		{
			result=originalNumber*100;
		}
		else
		{
			result=originalNumber;
		}
		System.out.println(result);
	}

}
