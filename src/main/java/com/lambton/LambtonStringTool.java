package com.lambton;

public class LambtonStringTool
{

    static public String reverse(String s)
    {

        String reversedString = "";

        for (int i = s.length()-1; i>=0; i--)
        {
            reversedString = reversedString+s.charAt(i);
        }

        return(reversedString);

    }



}
