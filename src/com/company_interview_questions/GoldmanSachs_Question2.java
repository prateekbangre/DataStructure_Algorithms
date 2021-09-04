package com.company_interview_questions;

/**
 * @author prateek.bangre on 19/08/21.
 * @Project DataStructure_Algorithms
 */
//https://leetcode.com/discuss/interview-question/334671/goldman-sacks-july-2019-hackerrank-2
public class GoldmanSachs_Question2 {

    public static String EncryptMessage(String msg, String key) {
        if(msg.length() == 0 || key.length() == 0)
            return "-1";

        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while(i<msg.length() && j<key.length()){
            if(Character.isDigit(key.charAt(i))){
                char ch = msg.charAt(i);
                int repeat = key.charAt(j) - '0';
                for(int k=0; k<repeat; ++k)
                    result.append(ch);

                i++;
                j++;
            }else{
                return "-1";
            }
        }
        if(i != msg.length()){
            result.append(msg.substring(i));
        }
        return result.toString();
    }

    public static String DecryptMessage(String msg, String key) {
        if(msg.length() == 0 || key.length() == 0)
            return "-1";

        try{
            StringBuilder result = new StringBuilder();
            int i = 0, j = 0;

            while(j<key.length() && i<msg.length()){
                char ch = msg.charAt(i);
                result.append(ch);
                i = i + key.charAt(j) - '0';
                j++;
            }
            result.append(msg.substring(i));
            return result.toString();
        }catch(Exception e){
            return "-1";
        }
    }

    public static void main(String[] args) {
        System.out.println(EncryptMessage("Opened", "abc"));
        System.out.println(DecryptMessage("Opp", "1234"));
        System.out.println(DecryptMessage("Open", "123"));
    }
}
