import java.util.Arrays;
import java.math.BigDecimal;
public class SquaresInAscendingOrder{

	public static String arrayInAscendingOrder(double[] numbers){
		String result = "";
		try{
			if(numbers.length > 0){
				for(int index = 0; index < numbers.length; index++){
					BigDecimal convert = new BigDecimal("" + numbers[index]).multiply(new BigDecimal("" + numbers[index]));
					numbers[index] = convert.doubleValue();
}
				for(int index = 0; index < numbers.length; index++){

					for(int count = 0; count < numbers.length; count++){

						if(numbers[index] < numbers[count]){
							BigDecimal convert = new BigDecimal("" + numbers[index]).add(new BigDecimal("" + numbers[count])); 
							numbers[index] = convert.doubleValue();
							convert = new BigDecimal("" + numbers[index]).subtract(new BigDecimal("" + numbers[count])); 
							numbers[count] = convert.doubleValue();;
							convert = new BigDecimal("" + numbers[index]).subtract(new BigDecimal("" + numbers[count])); 
							numbers[index] = numbers[index] - numbers[count];
					
}
 
}

}
			result = Arrays.toString(numbers);
}			

			else{ throw new IllegalArgumentException("Array of length 0 cannot be evaluated.");
}
			}	

		catch(IllegalArgumentException e){

			result = e.getMessage();
}

		return result;		
}

	public static void main(String[] args){

		double[] numbers = {2,9,7,6};
		System.out.println(arrayInAscendingOrder(numbers));
}
}