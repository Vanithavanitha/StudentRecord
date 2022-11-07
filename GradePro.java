import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char NA;
		Scanner scanner=new Scanner(System.in);
		NA=scanner.next().charAt(0);
		switch(NA)
		{
		case 'E':
		{
			System.out.println("Excellent");
			break;
		}
		case 'V':
		{
			System.out.println("Very Good");
			break;
		}
		case 'G':
		{
			System.out.println("Good");
			break;
		}
		case 'A':
		{
			System.out.println("Average");
			break;
		}
		default:
		{
			System.out.println("please enter the grade option");
			break;
		}
		}
}
}
