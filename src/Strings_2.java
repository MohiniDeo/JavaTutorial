import java.util.*;

public class Strings_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println("Print character at the index position 0");
        System.out.println(sb.charAt(0));

        //set char at index 0
        System.out.println("Set character at the index position 0");
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}
