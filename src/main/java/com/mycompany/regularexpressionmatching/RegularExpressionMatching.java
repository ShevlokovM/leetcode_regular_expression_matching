/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.regularexpressionmatching;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 *
 * @author 111
 */
public class RegularExpressionMatching {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        RegExMatching regExMatching = new RegExMatching();
        
        System.out.println("Input string: ");
        String str = scanner.next();
        
        System.out.println("Input pattern: ");
        String ptr = scanner.next();
        
        if(regExMatching.isMatch(str, ptr))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
