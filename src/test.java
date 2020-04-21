import com.sun.tools.javac.util.Convert;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author prateek.bangre on 12/03/20.
 * @Project DataStructure_Algorithms
 */
public class test {

    public static void main(String[] args) throws ParseException {
        String input = "Mon Mar 16 2020 12:45:12 GMT+0530 (India Standard Time)";

        DateFormat inputFormat = new SimpleDateFormat(
                "E MMM dd yyyy HH:mm:ss 'GMT'z");
        Date date = inputFormat.parse(input);
        System.out.println(date);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date));
    }

}
