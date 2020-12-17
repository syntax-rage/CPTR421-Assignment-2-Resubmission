/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 * 
 */

import java.util.Scanner;


 class CirclePattern {

        double pi = Math.PI;
        double Inra = 0;

        System.out.println("Please Enter the Radius of the Circle .");

        Scanner Input = new Scanner(System.in);

        Inra = Input.nextDouble();

        double rs = Math.pow(Inra,2) ;

        double prs = pi * rs;

        System.out.println("The radius of the Circle is " + Inra + ".");
        System.out.println("The area of the Circle is " + prs + "." );


    }
