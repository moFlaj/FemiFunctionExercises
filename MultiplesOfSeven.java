public class MultiplesOfSeven{

	public static void findMultiplesOf7Not5(){
		for(int number = 2001; number < 3200; number++){
			if(number % 7 == 0 && number % 5 != 0){
				System.out.printf("%d, ",number);}
}
	
}

	public static void main(String[] args){
		MultiplesOfSeven.findMultiplesOf7Not5();
}
}
		