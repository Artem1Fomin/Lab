package lab14;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
    class StringChecker {
        public static void main(String[] args) {
            String pattern = "abcdefghijklmnopqrstuv18340";
            String[] testStrings = {
                    "abcdefghijklmnopqrstuv18340",
                    "abcdefghijklmnoasdfasdpqrstuv18340.",
                    "xyzabcdefghijklmnopqrstuv18340",
                    "abcdefghijklmnopqrstuv183401"
            };

            for (String testString : testStrings) {
                if (checkString(testString, pattern)) {
                    System.out.println(testString + " совпал.");
                } else {
                    System.out.println(testString + " не совпал.");
                }
            }
        }

        public static boolean checkString(String input, String pattern) {
            Pattern regexPattern = Pattern.compile("^" + pattern + "$");
            Matcher matcher = regexPattern.matcher(input);
            return matcher.matches();
        }
    }

