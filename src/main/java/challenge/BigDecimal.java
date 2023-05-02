/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author User
 */

//Problem Link: https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true

public class BigDecimal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigDecimal big1 = new BigDecimal(a);
        BigDecimal big2 = new BigDecimal(b);
        BigDecimal sum = big1.add(big2);
        BigDecimal product = big1.multiply(big2);
        System.out.println(sum);
        System.out.println(product);
    }
    
}
