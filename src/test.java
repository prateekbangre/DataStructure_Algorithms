import java.util.HashMap;
import java.util.Map;

/**
 * @author prateek.bangre on 23/08/21.
 * @Project DataStructure_Algorithms
 */
public class test {
    public static <A,B> Map<A, B> makeMap(A[] keys, B[] values) {

//        if (keys.length != values.length){
//	    throw  new Exception("not equal length");
//        }

        Map<A, B> result = new HashMap<>();
        for (int i=0; i<keys.length ; ++i ){
            result.put(keys[i], values[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(makeMap(new String[]{"one", "two", "three", "four", "five"}, new Integer[]{1, 2, 3, 4, 5}));
    }
}
