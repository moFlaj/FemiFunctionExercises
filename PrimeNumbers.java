public class PrimeNumbers{

	public static void displayPrimeNumbers(){
		
		int counter = 0;
		int number = 2;
		int countPrime = 0;

		for(countPrime = countPrime; countPrime < 50; ){
		
			for(int j = 1; j <= number; j++){
			
				if(number % j == 0){
					++counter;}
}
			if(counter == 2){
			++countPrime;
			System.out.printf("%d ", number);}

			else{countPrime = countPrime;}
			++number;
			counter = 0;
			
					
}
			
}

	public static void main(String[] args){

		PrimeNumbers.displayPrimeNumbers();
		System.out.println();
		
		



}}