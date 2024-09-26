/*Assignment 2: Exam Grading System
Write a program that determines whether a student passes an exam based on three subjects. A student passes if the average score is at least 60, and none of the individual scores is below 40.
Requirements:
•    Use logical operators && and || to combine conditions.*/


package Ass26;
import java.util.Scanner;
public class examGrading {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the S1 ,s2 ,s3 marks");
	      int s1 = sc.nextInt();
	      int s2 = sc.nextInt();
	      int s3 = sc.nextInt();
	      float avg = (float)((s1 + s2 + s3) / 3);
	      System.out.println("avg= " + avg);
	      if (avg >= 60.0F && s1 > 40 && s2 > 40 && s3 > 40) {
	         System.out.println("Pass");
	      } else {
	         System.out.println("fail");
	      }

	   }

}
