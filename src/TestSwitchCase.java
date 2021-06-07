import java.util.Scanner;

public class TestSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----Math Operations----");
		int no1, no2, no3;
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter No1:");
		no1 = sc.nextInt();// used for reading int value from console

		System.out.println("Enter No2:");
		no2 = sc.nextInt();

		System.out.println("1:Add");
		System.out.println("2:Subs");
		System.out.println("3:Div");
		System.out.println("4:Multi");
		System.out.println("5:Exit");

		boolean flag = true;

		while (flag != false) {
			   System.out.println("Enter Choice:");
			   choice = sc.nextInt();
			   
			switch (choice) {
			case 1:
				no3 = no1 + no2;
				System.out.println("Add=" + no3);
				break;
			case 2:
				no3 = no1 - no2;
				System.out.println("Subs" + no3);
				break;
			case 3:
				no3 = no1 / no2;
				System.out.println("Div=" + no3);
				break;
			case 4:
				no3 = no1 * no2;
				System.out.println("Multi=" + no3);
				break;
			case 5:
				flag = false;
				break;
			}
		}

	}

}
