package Assignments;

public class Assignment6_ReplaceOddBy0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9876;int count=0;
		int newNum=0;
		while(num>0)
		{
			count++;
			int lastDigit=num%10;
			if(count==2)
				newNum=lastDigit*10+newNum;
			else if(count==4)
				newNum=lastDigit*1000+newNum;
			num=num/10;
		}
		System.out.println(newNum);
	}

}
