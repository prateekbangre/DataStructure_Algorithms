package com.algodaily.graphs;

import java.util.HashSet;
import java.util.Set;

/**
 * @author prateek.bangre on 16/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/find-deletion-distance/java
public class Find_Deletion_Distance {

    private int deletionDistance(String str1, String str2) {

        Set<Character> temp = new HashSet<>();
        int commonChar = 0;
        for (char ch : str1.toCharArray()) {
            temp.add(ch);
        }

        for (char ch: str2.toCharArray()) {
            if (temp.contains(ch))
                commonChar++;
        }
        return str1.length() + str2.length() -commonChar*2;
    }

    // remove or comment if running tests (we run our own main)
    public static void main(String[] args) {
        Find_Deletion_Distance obj = new Find_Deletion_Distance();
        System.out.println(obj.deletionDistance("algo", "daily"));
    }
}
