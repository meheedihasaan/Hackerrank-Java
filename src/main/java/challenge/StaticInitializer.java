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

//Problem Link: https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true

public class StaticInitializer {
    
    static Scanner sc = new Scanner(System.in);
    static int b = 0;
    static int h = 0;
    static{
        b = sc.nextInt();
        h = sc.nextInt();
    }
    
    public static void main(String[] args) throws Exception {
        if(b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            int area = b*h;
            System.out.println(area);
        }
    }
    
}
