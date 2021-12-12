package java_stream_api;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author prateek.bangre on 09/10/21.
 * @Project DataStructure_Algorithms
 */
/*
 Generate Fibonacci series using stream java 8 feature
 0 1 1 2 3 5 8 13
 input will be the index and you have to print Fibonacci series till the index
 ex: i/p: 3 -> o/p: 2
*/
public class Fibonacci_Series_Using_Stream {
    public static void main(String[] args) {
        int input = 3;
        int[] output = Stream.iterate(new int[]{0, 1}, no -> new int[]{no[1], no[0]+no[1]})
                .limit(input)
                .map(no -> no[0])
                .mapToInt(Integer::new)
                .toArray();

        System.out.println(Arrays.toString(output));
    }
}
