import java.util.Scanner;

public class LeapYear{

	public static boolean isLeapYear(int year){
		boolean isLeapYear = true;
			if(year % 4 == 0){
				if(year % 100 != 0 && year % 400 == 0)isLeapYear = true;
}

			else {isLeapYear = false;}	
		return isLeapYear;			
}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.println(LeapYear.isLeapYear(year));
}
}