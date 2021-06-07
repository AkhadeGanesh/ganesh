import java.util.Scanner;
public class TestScanfProg {

	public static void main(String[] args) {
		
		int no1,no2,no3;
		//read data from console
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No1:");
		no1=sc.nextInt();//used for reading int value from console

		
		System.out.println("Enter No2:");
		no2=sc.nextInt();
		no3=no1+no2;
		
		System.out.println("Add="+no3);
		
		// rollno,name,address,age,totalMarks
		
		int rollno,marks,age;
		String name,address;
		
		System.out.println("RollNO:");
		rollno=sc.nextInt();
		
		System.out.println("Name:");
		name=sc.next();//reading string
		
		System.out.println("Address:");
		address=sc.next();
		
		System.out.println("Total Marks:");
		marks=sc.nextInt();//reading string
		
		System.out.println("----------------");
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Marks:"+marks);
				
	}

}
