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


class SquarePattern {
   public static void main (String[] args)
   {
       System.out.println("Please enter one side of the square:");
       Scanner scanner = new Scanner(System.in);
       //Storing variables
       double side = scanner.nextDouble();
       //A = side*side
       double area = side*side; 
       double perimeter = side+side*2;
       System.out.println("The Area of the Square is:"+area);
       System.out.println("The Perimeter of the Square is:"+perimeter);
   }
}