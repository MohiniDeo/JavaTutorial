import java.util.*;

public class String_3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //Insert new character in the string
        sb.insert(0, 'S');
        System.out.println(sb);

        //Delete character
        sb.delete(0,1);
        System.out.println(sb);
    }
}
