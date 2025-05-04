import java.util.Scanner;

	public class SumOfFourDigitNumber{

		public static int completeSumOfNumber(int number){
			String str = Integer.toString(number);
			int sum = 0;
			int digit;
			if(number >= 1000 && number <= 9999){
			for(int count = 1; count <= str.length(); count++){
				digit = number % 10;
				number = number/10;
				sum+=digit;}
				System.out.printf("Sum is %d.%n", sum);}

			else{System.out.println("Enter valid input");
				sum = 0;}

			return sum;} 

		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter four digit number; ");
			int number = input.nextInt();
			SumOfFourDigitNumber.completeSumOfNumber(number);
}
} 
			