/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author User
 */

//problem Link: https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true

public class BigIntegerJava {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);
        BigInteger sum = big1.add(big2);
        BigInteger product = big1.multiply(big2);
        System.out.println(sum);
        System.out.println(product);
    }
    
}
