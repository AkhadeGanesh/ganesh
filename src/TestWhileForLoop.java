
public class TestWhileForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=1;
		while(no<=10)
		{
		System.out.println(no);
//		if(no==5)
//			break;
		no=no+1;
		}
		System.out.println("----do While----");
		
		//no=1;
		do {
			
		System.out.println(no);	
		no=no+1;
		}while(no<=10);
		
		
		
		
		
		
		
		

	System.out.println("-----------for---------");
	
	for(int i=1;i<=20;i++)
	{
		if(i%2==0)
		{
		System.out.println(i);
		}
		
	}
	
System.out.println("-----------for---------");
	
	for(int i=1;i<=20;i++)
	{
		
		if(i==5)
			continue;
		System.out.println(i);
		
			//break;
	}
	
	
	
	
	
	
	
		
	}

}
