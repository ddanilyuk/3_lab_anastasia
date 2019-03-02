import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String text = "Hello it is lucky. I am leader. It is successful! Some words without el";
        char your_char = 'l';
        System.out.println("Text: \n" + text);

        String string_with_count;
        String[] arr_words = text.split("[,;:.!?\\s]+");
        String empty = "";
        StringBuffer new_str = new StringBuffer(empty);

        for (String word : arr_words) {

            int count = 0;

            char[] arr_chars = word.toCharArray();
            for (char chars : arr_chars) {
                if (chars == your_char) {
                    count++;
                }
            }

            string_with_count = count + " : " + word;
            new_str.append(string_with_count);
            new_str.append("-");
        }
        System.out.println("Sorted by " + your_char + ":");
        String[] new_str_2 = new_str.toString().split("-");
        Arrays.sort(new_str_2, Collections.reverseOrder());
        for (String word : new_str_2) {
            System.out.print(word + "    ");
        }


    }
}