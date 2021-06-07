import java.util.Scanner;

public class TestIfConditions {

	public static void main(String[] args) {
		
		int no1,no2,no3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No1:");
		no1=sc.nextInt();//used for reading int value from console

		
		System.out.println("Enter No2:");
		no2=sc.nextInt();
		
		if(no1>no2)
			System.out.println("Max="+no1);
		else
			System.out.println("Max="+no2);
			
		System.out.println("------------------------");	
			
			
		if(no1>no2)
			System.out.println("Max="+no1);
		else if(no2>no1)
			System.out.println("Max="+no2);
		else
			System.out.println("no1==no2");
			
			
			
		//ternery oprator
		int max=(no1>no2)?no1:no2;
		System.out.println("Max=="+max);
		
		
			
			
	}

}
