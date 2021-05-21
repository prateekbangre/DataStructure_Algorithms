package com.random.question;

import java.util.Comparator;

/**
 * @author prateek.bangre on 04/05/21.
 * @Project TestProject
 */
//url: https://www.youtube.com/watch?v=SzzSwvQfKyk&list=PLOuZYwbmgZWXvkghUyMLdI90IwxbNCiWK&index=18
public class Sort_Object_Array_With_Comparator implements Comparator<Sort_Object_Array_With_Comparator.Player> {

    /* x.compareTo(y);
        negative value: if x < y, (x should appear first)
        zero: if x == y
        positive value: if x > y, (x should appear second)
    */
    // here we want to sort on the bases of score but if score is same then sort with name wise
    @Override
    public int compare(Player p1, Player p2) {

        if (p1.score == p2.score) {
            return p1.name.compareTo(p2.name);
        }

        return p2.score - p1.score;
    }

    class Player {
        String name;
        int score;
    }
}


