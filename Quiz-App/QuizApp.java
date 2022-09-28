package com.nissan.app;

import java.util.Random;
import java.util.Scanner;

import com.nissan.bean.Customer;

public class QuizApp {

	final static int TOTAL_NO_QUESTIONS = 5;
	
	public static void main(String[] args) {
		
		//Available question and answers
		String[][] statesAndCapital = {
				
				{ "Andhra Pradesh", "Hyderabad" }, 
				{ "Arunachal Pradesh", "Itanagar" },
				{ "Assam", "Dispur" }, 
				{ "Bihar", "Patna" }, 
				{ "Chhattisgarh", "Raipur" }, 
				{ "Goa", "Panaji" },
				{ "Gujarat", "Gandhinagar" }, 
				{ "Haryana", "Chandigarh" }, 
				{ "Himachal Pradesh", "Shimla" },
				{ "Jharkhand", "Ranchi" }, 
				{ "Karnataka", "Bangaluru" },
				{ "Kerala", "Trivandrum" },
				{ "Madhya Pradesh", "Bhopal" }, 
				{ "Maharashtra", "Mumbai" }, 
				{ "Manipur", "Imphal" },
				{ "Meghalaya", "Shillong" }, 
				{ "Mizoram", "Aizawl" }, 
				{ "Nagaland", "Kohima" },
				{ "Odisha", "Bhubaneswar" }, 
				{ "Punjab", "Chandigarh" }, 
				{ "Rajasthan", "Jaipur" },
				{ "Sikkim", "Gangtok" }, 
				{ "Tamil Nadu", "Chennai" }, 
				{ "Telangana", "Hyderabad" },
				{ "Tripura", "Agartala" }, 
				{ "Uttar Pradesh", "Lucknow" }, 
				{ "Uttarakhand", "Dehradun" },
				{ "West Bengal", "Kolkata" }
				
		};
		String userName = getUserName();
		System.out.println("Starting your quiz.....");
		startQuiz(statesAndCapital,userName);
	}

	// Method for getting user name
	private static String getUserName() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Name:");
		return input.next();
		
	}

	// Method to start the quiz
	private static void startQuiz(String[][] statesAndCapital, String userName) {
		//for storing no of correct answers 
		int noOfCorrectAnswers=0;
		
		//for storing users answers
		String[] userAnswers = new String[TOTAL_NO_QUESTIONS];
		
		//for string users attempted question numbers
		int[][] attemptedQuestNumbers = new int[TOTAL_NO_QUESTIONS][2];
		
		//loop for selecting random questions from given question
		for (int questionNo = 0; questionNo < TOTAL_NO_QUESTIONS; questionNo++) {
			
			int randomQuestionNo = generateRandQuestionNo(statesAndCapital.length);
			String correctAnswer =  statesAndCapital[randomQuestionNo-1][1];
			
			//checking whether the generated random question is already attempted. 
			if (checkIfAttempted(randomQuestionNo,attemptedQuestNumbers)) {
				questionNo =questionNo-1;
				continue;
				
			}else {
				
				//if not attempted prompting question and reading answers from user 
				
				attemptedQuestNumbers[questionNo][0] = randomQuestionNo;
				String userAnswer = promptQuestAndAns(questionNo,randomQuestionNo-1,statesAndCapital);
				//storing user answer
				userAnswers[questionNo] = userAnswer;
				
				//checking if user entered correct answer.
				if(userAnswer.equals(correctAnswer)){
					
					// 1 indicates this question is answered correctly(score)
					attemptedQuestNumbers[questionNo][1] = 1; 
					noOfCorrectAnswers++;
					
				}else {
					
					//0 indicates this question is answered incorrectly(score)
					attemptedQuestNumbers[questionNo][1] = 0; 
					
				}
			
			}
			
		}
		
		//displaying quiz score report
		System.out.println("\n Displaying Your Quiz Report.....");
		displayQuizReport(statesAndCapital,attemptedQuestNumbers,noOfCorrectAnswers,userAnswers,userName);
	}

	/**
	 * @param attemptedQuestNumbers 
	 * @param statesAndCapital 
	 * @param noOfCorrectAnswers 
	 * @param userAnswers 
	 * @param userName 
	 * 
	 */
	private static void displayQuizReport(String[][] statesAndCapital, int[][] attemptedQuestNumbers, int noOfCorrectAnswers, String[] userAnswers, String userName) {
		// TODO Auto-generated method stub

			// displaying customer details in table form
			System.out.println(
				" --------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%70s",userName+"'s Quiz Report \n");
			System.out.println(
					" --------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%15s %25s %34s %20s %15s \n", "QuestionNo.", "Question", "Correct Answer",
					"Your Answer", "Score");
			System.out.println(
					" --------------------------------------------------------------------------------------------------------------------");
			for (int questionNo = 0; questionNo< TOTAL_NO_QUESTIONS; questionNo++) {

				System.out.printf("%7s %45s %18s %21s %16s \n",questionNo+1,"What is the capital of "+statesAndCapital[attemptedQuestNumbers[questionNo][0]-1][0]+"?",
						statesAndCapital[attemptedQuestNumbers[questionNo][0]-1][1],userAnswers[questionNo],attemptedQuestNumbers[questionNo][1]);
			}
			System.out.println(
					" --------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%70s","Your Total Score"+"(out of "+TOTAL_NO_QUESTIONS+"): "+noOfCorrectAnswers+"\n");
			System.out.println(
					" --------------------------------------------------------------------------------------------------------------------");
		
	}

	private static String promptQuestAndAns(int questionNo, int randomQuestionNo, String[][] statesAndCapital) {
		// TODO Auto-generated method stub
		String userAnswer;
		Scanner input = new Scanner(System.in); 
		String stateName = statesAndCapital[randomQuestionNo][0];
		
		System.out.println("\n Q"+(questionNo+1)+": What is the capital of "+stateName+"?");
		System.out.print(" Enter Answer for Q"+(questionNo+1)+":");
		userAnswer = input.next();
		return userAnswer;
		
		
	}

	private static boolean checkIfAttempted(int randomQuestionNo, int[][] attemptedQuestNumbers) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < attemptedQuestNumbers.length; i++) {
			if(attemptedQuestNumbers[i][0]==randomQuestionNo) {
				return true;
			}
		}
		return false;
	}

	// Method to generate random question from Total Questions available.
	private static int generateRandQuestionNo(int length) {
		Random rand = new Random();
		return (1+rand.nextInt(length));
	}

}

/**
output:

Enter Your Name:safdar
Starting your quiz.....

 Q1: What is the capital of Goa?
 Enter Answer for Q1:Panaji

 Q2: What is the capital of Tamil Nadu?
 Enter Answer for Q2:Chennai

 Q3: What is the capital of Mizoram?
 Enter Answer for Q3:Mizo

 Q4: What is the capital of Manipur?
 Enter Answer for Q4:Imphal

 Q5: What is the capital of Maharashtra?
 Enter Answer for Q5:Bombay

 Displaying Your Quiz Report.....
 --------------------------------------------------------------------------------------------------------------------
                                                safdar's Quiz Report 
 --------------------------------------------------------------------------------------------------------------------
    QuestionNo.                  Question                     Correct Answer          Your Answer           Score 
 --------------------------------------------------------------------------------------------------------------------
      1                   What is the capital of Goa?             Panaji                Panaji                1 
      2            What is the capital of Tamil Nadu?            Chennai               Chennai                1 
      3               What is the capital of Mizoram?             Aizawl                  Mizo                0 
      4               What is the capital of Manipur?             Imphal                Imphal                1 
      5           What is the capital of Maharashtra?             Mumbai                Bombay                0 
 --------------------------------------------------------------------------------------------------------------------
                                        Your Total Score(out of 5): 3
 --------------------------------------------------------------------------------------------------------------------
 */