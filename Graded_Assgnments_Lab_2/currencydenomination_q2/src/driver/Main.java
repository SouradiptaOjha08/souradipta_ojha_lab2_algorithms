package driver;
import java.util.*;

import service.crrencyDenomnation.currencyDenominations;

public class Main {


			public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of currency denominations ");
				int size=sc.nextInt();
				System.out.println("Enter the currency denominations value ");
				int []currency=new int[size];
				int x;
				for(int i=0;i<size;i++)
				{	x=sc.nextInt();
				while(x<=0)
				{	
					System.out.println("Notes of denomination 0 is not allowed");
					x=sc.nextInt();
				}
				currency[i]=x;
				}
				currencyDenominations.sort(currency,0,size-1);
				System.out.println("Enter the amount you want to pay ");
				int amount=sc.nextInt();
				if(amount<=0)
					System.out.println("this is not a valid denomination");
				else
					currencyDenominations.paymentApproach(currency,amount);
				sc.close();
			}

		
	
}
