/**
 * @author Daniel Lebedev - dalebedev 
 * CIS 175 - Spring 2024
 * Jan 9, 2024
 */
import java.util.ArrayList;
import java.util.Scanner;

class GradeBook {
	private String testName;
	private ArrayList<Integer> testScores;
	
	public GradeBook() {
	}
	
	public GradeBook(String testName, ArrayList<Integer> testScores) {
		this.testName = testName;
		this.testScores = testScores;
	}
	
	public String getTestName() {
		return testName;
	}
	
	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	public ArrayList<Integer> getTestScores() {
		return testScores;
	}
	
	public void setTestScores(ArrayList<Integer> testScores) {
		this.testScores = testScores;
	}
	
	public char setLetterGrade(int score) {
		
		if (score >= 90) {
			return 'A';
		}
		else if (score >= 80) {
			return 'B';
		}
		else if (score >= 70) {
			return 'C';
		}
		else if (score >= 60) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
	
	public void printGrades() {
		System.out.println("Score --- Grade");
		for (int score : testScores) {
			System.out.println(" " + score + " ------- " + setLetterGrade(score));
		}
	}
}

public class GradeCalculatorDL {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the test name: ");
		String testName = scanner.nextLine();
		
		System.out.print("How many scores would you like to input? ");
		int numScores = scanner.nextInt();
		
		ArrayList<Integer> testScores = new ArrayList<Integer>();
		GradeBook gradeBook = new GradeBook(testName, testScores);
		
		for (int i = 0; i < numScores; i++) {
			System.out.print("Please enter your score: ");
			int score = scanner.nextInt();
			testScores.add(score);
		}
		
		System.out.println("\nPrinting grades for: " + testName + ":");
		gradeBook.printGrades();
		
		scanner.close();
		
	}
	
}
