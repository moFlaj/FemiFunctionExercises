import java.util.Scanner;
public class FindMultiple{

		public static double findMultiple(int number){
			double multiple = number * 5;
			return multiple;
}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.println(FindMultiple.findMultiple(number));

		


}}