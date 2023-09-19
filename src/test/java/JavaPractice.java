import java.util.Scanner;

public class JavaPractice {
    public static void main(String[] args) {

        String st = "MoonLander";
       // String rev = null;
        int j = st.length();
        StringBuilder rev = new StringBuilder();

        for (int i = st.length() - 1; i >= 0; i--) {
            rev.append(st.charAt(i));

        }

        System.out.println(rev);


    }
}
