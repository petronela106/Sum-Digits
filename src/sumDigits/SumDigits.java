package sumDigits;

import java.util.Scanner;

//Write a program to sum the digits of given number
//Read an integer from the console
//Sum its digits and print the sum

public class SumDigits {
	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       int n  = scanner.nextInt();
	       int sum = 0;
	       while(n != 0){
	          sum += n % 10;
	          n = n /10;
	       }
	      System.out.println(sum);
	    }
	}