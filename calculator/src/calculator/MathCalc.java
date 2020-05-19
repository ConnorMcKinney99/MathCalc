package calculator;

import java.util.Scanner;

public class MathCalc {

	public static void main(String[] args) {
		System.out.println(gCalc());

	}
	public static double gCalc() {
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double answer = 0;
		double constant = 0;
		double time = 0;
		double velocity = 0;
		for(int i = 0; i < 2; i++) {
			Scanner num1 = new Scanner(System.in);
			System.out.println("Enter time");
			String t = num1.nextLine();
			time = Double.parseDouble(t);
			if(i == 0) {
				Scanner num3 = new Scanner(System.in);
				System.out.println("Enter constant");
				String c = num3.nextLine();
				constant = Double.parseDouble(c);
				Scanner num2 = new Scanner(System.in);
				System.out.println("Enter velocity");
				String v = num2.nextLine();
				velocity = Double.parseDouble(v);
			}
			answer = velocity*time;
			answer = answer - (constant*(time*time));
			if(i == 0) {
				y1 = answer;
			    x1 = time;}
			if(i==1) {
				y2 = answer;
				x2 = time;
				answer = (y2-y1)/(x2-x1);
			}
			
		}
		return answer;
	}
}