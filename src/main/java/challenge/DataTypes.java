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

//Problem Link: https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true

public class DataTypes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            long a = sc.nextLong();
            try {
                System.out.println(a+" can be fitted in:");
                if(a >= -128 && a <= 127){
                    System.out.println("* byte");
                }
                if(a >= -32768 && a <= 32737){
                    System.out.println("* short");
                }
                if(a >= -2147483648 && a <= 2147483647){
                    System.out.println("* int");
                }
                if(a >= -9223372036854775808L && a <= 9223372036854775807L){
                    System.out.println("* long");
                }
            }
            catch(Exception e) {
                System.out.println(a+" can't be fitted anywhere.");
            }
        }
    }
    
}
