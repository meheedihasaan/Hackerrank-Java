/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */

//Problem Link: https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true

public class JavaLoops {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int i = 1; i <= 10; i++){
            System.out.println(N+" x "+i+" = "+(N*i));
        }

        bufferedReader.close();
    }
    
}
