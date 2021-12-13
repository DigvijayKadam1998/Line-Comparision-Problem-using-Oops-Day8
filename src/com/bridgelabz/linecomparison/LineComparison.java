package com.bridgelabz.linecomparison;

import java.util.Scanner;
public class LineComparison {
    public static void lengthOfLine() {
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter x1 co-ordinate of line: ");
	int x1 = sc.nextInt();
	System.out.println("Enter y1 co-ordinate of line: ");
	int y1 = sc.nextInt();
	System.out.println("Enter x2 co-ordinate of line: ");
	int x2 = sc.nextInt();
	System.out.println("Enter y2 co-ordinate of  line: ");
	int y2 = sc.nextInt();
	        
	double length_of_Firstline = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	System.out.println("length of Line1: " + length_of_Firstline);
    }
    public static void main(String[] args) {
	lengthOfLine();
    }
}
