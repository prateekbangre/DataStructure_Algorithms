package com.algodaily.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * @author prateek.bangre on 16/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/find-duplicate-words/java
public class Find_Duplicate_Words {

    public static String[] findDuplicates(String input) {
        // fill in
        // with solution
        input = input.toLowerCase(Locale.ROOT);
        if (input == null || input.isEmpty())
            return new String[] {};

        Set<String> result = new HashSet<>();
        Set<String> temp = new HashSet<>();
        for (String value:input.split(" ")) {
            if (!temp.add(value))
                result.add(value);
        }

        return Arrays.copyOf(result.toArray(), result.size(), String[].class);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDuplicates("The dog is the best")));
        System.out.println(Arrays.toString(findDuplicates("Happy thanksgiving, I am so full")));
    }
}
