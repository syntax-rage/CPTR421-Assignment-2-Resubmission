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

class TrianglePattern {
   public static void main(String args[]) {   
      Scanner scanner = new Scanner(System.in);

      System.out.println("Please enter the width of the triangle:");
      double base = scanner.nextDouble();

      System.out.println("Please enter the height of the triangle:");
      double height = scanner.nextDouble();

      System.out.println("Please enter the first side of the triangle");
      double side1 = scanner.nextDouble();
      
      System.out.println("Please enter the second side of the triangle");
      double side2 = scanner.nextDouble();
      
      //Area = (width*height)/2
      double area = (base* height)/2;
      System.out.println("The area of triangle is: " + area);
      
      double perimeter = side1+side2+base;
      System.out.println("The perimeter of triangle is: " + perimeter);
   }
}