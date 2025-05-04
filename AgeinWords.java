import java.util.Scanner;
	public class AgeinWords{

		public static String displayAge(int userAge){
			String ageInWords;

			if(userAge >= 1){
			ageInWords = "Age: " + Integer.toString(userAge) + " " + "years" + " ," + Integer.toString(userAge * 12) + " " + "months" + " ," + Integer.toString((int)userAge * 365) + " " + "days" + " ," + Integer.toString(userAge * (int)(365 * 24 * 60)) + " " + "minutes" + " ," + Integer.toString(userAge * (int)(365 * 24 * 60 * 60)) + " " + "seconds";}

			else{ System.out.println("Enter valid input");
				ageInWords = "";}

			return ageInWords;}

		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter age: ");
			int number = input.nextInt();

			System.out.println(AgeinWords.displayAge(number));
			
}
}