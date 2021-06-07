
public class TestOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		System.out.println("a="+a);
		System.out.println("a++="+(a++));
		System.out.println(a);
		System.out.println("++a="+(++a));
		System.out.println(a);
		System.out.println(-a);
		
		
		
		System.out.println("----logical operator---");
		
		int no1=20,no2=90,no3=10;
		
//		if(no1>no2)
//		{
//			if(no1>no3)
//			{
//				
//			}
//		}
		if(no1>no2 && no1>no3)
		{
			System.out.println("Max="+no1);
		}
		else if(no2>no1 && no2>no3)
		{
			System.out.println("Max="+no2);
		}
		else
		{
			System.out.println("Max="+no3);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
