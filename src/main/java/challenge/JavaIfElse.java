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

//Problem Link: https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true

public class JavaIfElse {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N%2 == 1){
            System.out.println("Weird");
        }
        else{
            if(N >= 2 && N <= 5){
                System.out.println("Not Weird");
            }
            else if(N >= 6 && N <= 20){
                System.out.println("Weird");
            }
            else if(N >= 20){
                System.out.println("Not Weird");
            }
        }
        

        scanner.close();
    }
    
}
