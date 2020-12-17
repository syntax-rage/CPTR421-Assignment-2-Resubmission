/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
import java.util.Scanner;


class RectanglePattern {
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the length of Rectangle:");
	   double length = scanner.nextDouble();
	   System.out.println("Enter the width of Rectangle:");
	   double width = scanner.nextDouble();
	   //area = length*width;
	   double area = length*width;
           double perimeter = length+width*2;
	   System.out.println("Area of Rectangle is:"+area);
           System.out.println("Perimeter of Rectangle is:"+perimeter);
   }