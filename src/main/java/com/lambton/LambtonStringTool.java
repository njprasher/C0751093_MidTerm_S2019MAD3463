package com.lambton;

public class LambtonStringTool
{

    static public String reverse(String s)
    {

        String reversedString = "";

        for (int i = s.length()-1; i >= 0; i--)
        {
            reversedString = reversedString+s.charAt(i);
        }

        return(reversedString);

    }

    static public int binaryToDecimal(String s)
        {
            int n=0;

            for (int i =s.length()-1; i >=0; i--)
            {
                int b = s.charAt(i);
                int j = i+1;
                if(b=='0'||b=='1')
                {
                    n = (int) (n + b*(Math.pow(2, j)));
                }
                else {
                    System.out.println("Number is not Binary");
                    break;
                }
            }

            return(n);
        }
        

}
