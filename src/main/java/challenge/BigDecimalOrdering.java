/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BigDecimalOrdering {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n+2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        
//        Arrays.sort(s, 0, n, (String s1, String s2)->{
//            BigDecimal big1 = new BigDecimal(s1);
//            BigDecimal big2 = new BigDecimal(s2);
//            return big2.compareTo(big1);
//        });
        
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal big1 = new BigDecimal(s1);
                BigDecimal big2 = new BigDecimal(s2);
                return big2.compareTo(big1);
            }
        };
        
        Arrays.sort(s, 0, n, customComparator);
        
        for(int i = 0; i < n; i++){
            System.out.println(s[i]);
        }
    }
    
}
