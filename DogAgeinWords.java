import java.util.Scanner;
	public class DogAgeinWords{

		public static int displayDogAge(String name, int humanYears){
			int dogAge;
			if(humanYears >= 1){
				dogAge = 7 * humanYears;
				System.out.printf("%s is %d years old.%n", name, dogAge);}

			else{dogAge = 0;
				System.out.println("Enter valid input");			
}
			return dogAge;
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
			