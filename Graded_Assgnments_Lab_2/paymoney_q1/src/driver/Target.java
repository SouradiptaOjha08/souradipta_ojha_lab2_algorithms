package driver;

import java.util.Scanner;

public class Target {

	public static void targetIsAchieved(int []transactions,int numOfTargets) {

		Scanner sc=new Scanner(System.in);
		while(numOfTargets>0)
		{
			System.out.println("Enter the value of target ");
			int target=sc.nextInt();
			int sum=0;
			int j=0;
			int flag=0;
			for(int i:transactions)
			{	j+=1;
			sum+=i;
			if(sum>=target)
			{	
				System.out.println("Target achieved after "+j+" transactions ");
				flag=1;
				break;
			}
			}
			if(flag==0)
				System.out.println(" Given target is not achieved ");
			numOfTargets--;
		}
		sc.close();
	}

}
