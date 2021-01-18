package net.codejava;
//import java.util.*;
import java.util.Scanner;

public class patternPrinting {

	public static void main(String[] args) {
		int i,j,num,k;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of lines you want in the pattern? :- ");
			num=sc.nextInt();
		
		for(i=1;i<=num;i++)
		{	
			for(j=1;j<num-i;j++)
			{	
				System.out.print("");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(" * ");
			}
			System.out.println("  ");
		}
		
		Scanner sc2=new Scanner(System.in);
		int m,n,choice;
		System.out.println("Do you want the reverse of the pattern? (1/0)");
		choice=sc2.nextInt();
		if(choice==1)
		{ System.out.println("----------Reverse of the pattern----------");
			for(m=num;m>=1;--m)
			{
				for(n=1;n<=m;++n)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
		}
		else
			System.exit(0);
		
	}

}
// for each 'for loop' we consider O(n). so for all the nested 'for loops' combined,
// Time Complexity would be ~  O(n^2)
// Space complx depends on writing, compiler or the machine
// Integer takes 4 bytes. we have 7 integer var in program so 4*7 bytes needed.
// we can clearly see that compiler taking constant size i.e  ~ O(1)



