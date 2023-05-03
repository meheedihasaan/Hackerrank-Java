/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge;

import java.util.Scanner;

/**
 *
 * @author User
 */

//Problem Link: https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true

public class OutputFormat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d/n", s1, x);
        }
        System.out.println("================================");
    }
    
}
