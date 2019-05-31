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
            int n = 0;


            for (int i =s.length()-1; i >=0; i--)
            {
                int b = (int)(s.charAt(i));
                int j = i+1;
                if(b == 0 || b == 1)
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

    static public String initials(String s)
    {
        String tempS ;
        return null;

    }

    static public char mostFrequent(String s)
    {
        int maxCount = 0;
        char maxChar = '\0';
        for (int i = s.length()-1; i >= 0; i--) {
            int count = -1;
            char c = s.charAt(i);

            for (int j = s.length() - 1; j >= 0; j--) {
                if (c == s.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = c;

            }
        }
        return(maxChar);

    }

    public String replaceSubString(String s1, String s2, String s3)
    {
        String replacedString = "";
        if(s1.contains(s2))
        {
            replacedString = s1.replaceAll(s2, s3);
        }
        else System.out.println("It doesn't have the substring");

        return(replacedString);
    }




}
