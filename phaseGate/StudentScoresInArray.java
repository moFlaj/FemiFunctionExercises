import java.math.BigDecimal;
import java.util.Arrays;
public class StudentScoresInArray{

	public static double totalStudentScore(double[] scoresStudent){
		double total = 0;
		BigDecimal convert = new BigDecimal("" + total);
		int counter = 0;
		for(double score : scoresStudent){
			convert = new BigDecimal("" + convert).add(new BigDecimal("" + score));
}
		total = convert.doubleValue();
		return total;	
}

	public static int studentScoreCount(double[] scoresStudent){
		int counter = 0;
		for(int index = 0; index < scoresStudent.length; index++){
			counter += 1;
}
		return counter;
}

	public static void getAverageScoreOfEachStudent(double[][] scores){
		double studentTotalScore = 0;
		double studentNumberOfScores = 0;
		String totalStrings = "";
		for(int index = 0; index < scores.length; index++){
			studentTotalScore = StudentScoresInArray.totalStudentScore(scores[index]);
			if(index <= scores.length - 2)totalStrings = totalStrings  + "" + studentTotalScore + ",";
			else if(index == scores.length - 1)totalStrings = totalStrings  + studentTotalScore;
}
		
		String[] studentsTotalArray = totalStrings.split(",");
		System.out.println(Arrays.toString(studentsTotalArray));

		double average = 0;
		for(int index = 0; index < scores.length; index++){
			studentTotalScore = StudentScoresInArray.totalStudentScore(scores[index]);
			studentNumberOfScores = StudentScoresInArray.studentScoreCount(scores[index]);
			BigDecimal averageConvert = new BigDecimal("" + studentTotalScore).divide(new BigDecimal("" + studentNumberOfScores));
			
}
}


	public static void main(String[] args){
		double[][] scores = {{3,5,6}, {6,5,7}, {6,8.12,3.13}};
		getAverageScoreOfEachStudent(scores);
}
}
		
		
