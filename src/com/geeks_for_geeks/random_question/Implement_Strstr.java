package com.geeks_for_geeks.random_question;

import java.util.Scanner;

/**
 * @author prateek.bangre on 14/08/20.
 * @Project GeeksForGeeks
 */
//URL: https://practice.geeksforgeeks.org/problems/implement-strstr/1
class Implement_Strstr
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            String line = sc.nextLine();
            String str = line.split(" ")[0];
            String target = line.split(" ")[1];

            System.out.println(strstr(str,target));

            t--;
        }
    }

    private static int strstr(String str, String target) {

        int result = -1;
        int targetLength = target.length();

//        GeeksForGeeks   For
//        abcabcabcd abcd
        for (int j=0; j<str.length(); ++j){

            if (str.charAt(j) == target.charAt(0) && j+targetLength <= str.length()){
                String s = str.substring(j, j+targetLength);
                if (s.equals(target)){
                    result = j;
                    break;
                }
            }
        }
        return result;
    }
}
