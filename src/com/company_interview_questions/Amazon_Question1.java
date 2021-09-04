package com.company_interview_questions;

/**
 * @author prateek.bangre on 15/05/21.
 * @Project TestProject
 */
/*
url: https://leetcode.com/problems/robot-bounded-in-circle/
Robot Bounded In Circle
On an infinite plane, a robot initially stands at (0, 0) and faces north. The robot can receive
one of three instructions:
    "G": go straight 1 unit;
    "L": turn 90 degrees to the left;
    "R": turn 90 degrees to the right.
The robot performs the instructions given in order, and repeats them forever.

Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.

Example 1:
Input: instructions = "GGLLGG"
Output: true
Explanation: The robot moves from (0,0) to (0,2), turns 180 degrees, and then returns to (0,0).
When repeating these instructions, the robot remains in the circle of radius 2 centered at the origin.

Example 2:
Input: instructions = "GG"
Output: false
Explanation: The robot moves north indefinitely.

Example 3:
Input: instructions = "GL"
Output: true
Explanation: The robot moves from (0, 0) -> (0, 1) -> (-1, 1) -> (-1, 0) -> (0, 0) -> ...

Constraints:
1 <= instructions.length <= 100
instructions[i] is 'G', 'L' or, 'R'.
*/
public class Amazon_Question1 {

    static public boolean isRobotBounded(String instructions) {

        int x = 0;
        int y = 0;
        int dir = 0;

        // N = 0, E = 1, S = 2, W = 3
        //        1,0
        //  0,-1        0,1
        //       -1,0
        int[][] moves = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (char direction : instructions.toCharArray()) {
            if (direction == 'G') {
                // move in whichever direction you are currently
                x += moves[dir][0];
                y += moves[dir][1];
            } else if (direction == 'L') {
                // move 1 left same as moving 3 to the right
                // +3 plays better with mod than -1
                dir = (dir + 3) % 4;
            } else {
                // Right == +1
                dir = (dir + 1) % 4;
            }
        }

        // If start and end position is same - CIRCLE
        // If direction is not North - CIRCLE (Because Left or Right will eventually end up in Circle after repetitions)
        return ((x == 0) && (y == 0)) || (dir != 0);
    }

    public static void main(String[] args) {
        String input = "GGLLGG";
        System.out.println(isRobotBounded(input));
    }
}
