import java.util.*;

public class main {
	public static void main(String[] args) {
		while (true) {
			System.out.println("enter selection \n");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			switch (s) {
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					break;
				case 7:
					System.out.println("Sunday");
					break;
				case 8:
					System.out.println("goodbye");
					System.exit(0);
					break;
				default:
					System.out.println("error try again \n");
					break;
			}

		}
	}

}
