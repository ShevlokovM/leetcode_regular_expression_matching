/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.regularexpressionmatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author 111
 */
public class RegExMatching 
{
    public boolean isMatch(String s, String p) 
    {
        try
        {
            Pattern pt = Pattern.compile(p);
            Matcher m = pt.matcher(s);
            while(m.find()) 
            {
                int i = m.start();
                int b = m.end();
                String strr = m.group();
                if(m.group().equals(s)) 
                    return true;
            }
        }
        catch(PatternSyntaxException pse)
        {
            System.err.println("Wrong reg ex: " + pse.getMessage());
            System.err.println("Description: " + pse.getDescription());
            System.err.println("Position: " + pse.getIndex());
            System.err.println("Wrong pattern: " + pse.getPattern());
            return false;
        }
        return false;
    }
}
