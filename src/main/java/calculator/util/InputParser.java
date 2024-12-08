package calculator.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JToolBar.Separator;

public class InputParser {
    public static final String DEFAULT_SEPARATOR = ",|:";
    public static String activeSeparator;

    public static String handleCustomer(String input){
        Matcher matcher = Pattern.compile("//(.)\\\\n(.)").matcher(input);
        if(matcher.find()){
            String customSeparator = matcher.group(1);
            activeSeparator = DEFAULT_SEPARATOR + "|" + customSeparator;
            input = matcher.group(2);

        }
        return input;
    }
    public static String[] parseInput(String input){
        return input.split(activeSeparator);
    }
}
