import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {

		int[] arr = new int[5];// int arr[5]

//		arr[0]=11;
//		arr[1]=12;
//		arr[2]=13;
//		arr[3]=14;
//		arr[4]=15;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<5;i++)
		{
		arr[i]=sc.nextInt();
		}
		System.out.println("------------------");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("----Enter Element:");
		int no=sc.nextInt();
		
		
		for(int i=0;i<5;i++)
		{
			if(arr[i]==no)
			{
			System.out.println("Present:at  "+i);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
