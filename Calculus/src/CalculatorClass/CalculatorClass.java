package CalculatorClass;

import java.util.Scanner;


public class CalculatorClass {

	    
	    public static void main(String[] args) {
	        Scanner reader;
	        reader = new Scanner(System.in);
	        double number1, number2, answer;
	        int action;
	        System.out.print("Number 1: ");
	        number1 = reader.nextDouble();
	        System.out.print("Number 2: ");
	        number2 = reader.nextDouble();
	        System.out.print("1 = +  :2 = -  :3 = *  :4 = /  :Choose 1-4:");
	        action = reader.nextInt();
	        switch (action) {
	            case 1:
	                answer = number1 + number2;
	                System.out.println(answer);
	                break;
	            case 2:
	                answer = number1 - number2;
	                System.out.println(answer);
	                break;
	            case 3:
	                answer = number1 * number2;
	                System.out.println(answer);
	                break;
	            case 4:
	                answer = number1 / number2;
	                System.out.println(answer);
	                break;
	            default:
	                break;
	        }
	    }
	}
