package TASK_2;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
	
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the marks obtained in Maths");
		double m1 = scn.nextDouble();
		System.out.println("Enter the marks obtained in Biology");
		double m2 = scn.nextDouble();
		System.out.println("Enter the marks obtained in Physics");
		double m3 = scn.nextDouble();
		System.out.println("Enter the marks obtained in Chemistry");
		double m4 = scn.nextDouble();
		System.out.println("Enter the marks obtained in English");
		double m5 = scn.nextDouble();
		
		double totalmarks = m1+m2+m3+m4+m5;
		
		double averagepercentage = (totalmarks/500)*100;
	
		System.out.println("Total Marks obtained:" +totalmarks);
		System.out.println("Total Average Percentage obtained:" +averagepercentage);
		
		if(averagepercentage>90.0) {
			System.out.println("You achieved Grade A");
		}
		else if(averagepercentage<=90.0 && averagepercentage>=80.0) {
			System.out.println("You achieved Grade B");
		}
		else if(averagepercentage<=80.0 && averagepercentage>=70.0) {
			System.out.println("You achieved Grade C");
		}
		else if(averagepercentage<=70.0 && averagepercentage>=60.0) {
			System.out.println("You achieved Grade D");
		}
		else {
			System.out.println("You are fail!");
		}
		
		
		
	}

}
