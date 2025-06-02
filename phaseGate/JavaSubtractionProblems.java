import java.time.LocalTime;
import java.util.Scanner;
public class JavaSubtractionProblems{
	public static void main(String[] args){
int firstNumber;
int secondNumber;
int noOfTries = 0;
int runProgram = 0;
int totalScore = 0;
int startSeconds = 0;
int endSeconds = 0;
LocalTime today = LocalTime.now();
Scanner input = new Scanner(System.in);

while(runProgram < 10){
	firstNumber = (int)(Math.random() * 101);
	secondNumber = (int)(Math.random() * 101);
	if(firstNumber > secondNumber){
		runProgram+=1;
		if(runProgram == 1){
			startSeconds = today.getSecond();
}
		while(true){
			System.out.printf("What will be the result of this operation: %d - %d.%n", firstNumber, secondNumber);
			System.out.print("Answer: ");
			int answer = input.nextInt();
			if(answer != (firstNumber - secondNumber)){
				noOfTries++;
				
				if(noOfTries == 2){
					noOfTries = 0;
					break;
}
			
				else{
					System.out.println("Wrong answer. You have one more try for this question.");	
					continue;}				
}
			else if(answer == (firstNumber - secondNumber)){
				totalScore+=1;
				break;
}
			

}
}
	else{continue;}
}

LocalTime after = LocalTime.now();
endSeconds = after.getSecond();
if(endSeconds < startSeconds){
	endSeconds = 60 + endSeconds;
}
System.out.printf("Your total score is %d.", totalScore);
System.out.printf("It took %d seconds to complete this exercise.%n", endSeconds - startSeconds);
}
}
