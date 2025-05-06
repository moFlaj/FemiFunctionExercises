import java.util.Scanner;
	public class DogAgeinWords{

		public static String displayDogAge(String name, int humanYears){
			String dogName = name;
			int dogAge;
			String result;
			if(humanYears >= 1){
				dogAge = 7 * humanYears;
				result = dogName + " " + "is" + " " + Integer.toString(dogAge) + " " + "years old.";}
				
			else{	result = "";
				System.out.println("Enter valid input");			
}
			return result;
}

		
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter dog name: ");
			String name = input.next();
			System.out.println("Enter human age in years: ");
			int humanYears = input.nextInt();

			DogAgeinWords.displayDogAge(name,humanYears);
}
}			
			
