package core_java_training;

import java.util.Scanner;

public class Loops {
	
	
	public static void main(String[] args) {
//		int [] arrInt=new int[5];
//		Scanner myObj = new Scanner(System.in);  
//	    System.out.println("Enter the index:");
//	    int i = myObj.nextInt();  
//	    System.out.println("is: " + i);
//		for( i=0;i<arrInt.length;i++)
//		{
//			System.out.println(i+"-"+arrInt[i]);
//		}
//		
//		int num=2;
//		if(num==2)
//		{
//			System.out.println("number is 2");
//		} else if(num%2==0)
//		{
//			System.out.println("Evnen number..");
//		}
//		else 
//		{
//			System.out.println("Odd number..");
//		}
//		
//		System.out.println("Switch...");
//		
//		switch (num)
//		{
//		case 1:
//			System.out.println(" number is 1.");
//			break;
//		case 2:
//			System.out.println(" number is 2.");
//			break;
//		default:
//			if(num==2)
//			{
//				System.out.println("number is 2");
//			} else if(num%2==0)
//			{
//				System.out.println("Evnen number..");
//			}
//			else 
//			{
//				System.out.println("Odd number..");
////			}
//			
//		}
		
		Loops obj=new Loops();
		String str=obj.decisionMaking(3,"Hello");
		System.out.println(str);
		
		
	}

	public  String decisionMaking(int num,String str)
	{
		String output="";
		System.out.println(str);
		System.out.println(num==2?true:false);
		switch (num)
		{
		case 1:
			output=" number is 1.";
			break;
		case 2:
			output=" number is 2.";
			break;
		default:
			if(num==2)
			{
				output="number is 2";
			} else if(num%2==0)
			{
				output="Evnen number..";
			}
			else 
			{
				output="Odd number..";
			}
			
		}
		return output;
	}
}
