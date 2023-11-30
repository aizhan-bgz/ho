import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        String string = "Одиннадцать";
        char [] chars = string.toCharArray();

        boolean isDone = true;

        while (isDone) {
            isDone = false;

            for (int i = 0; i < chars.length; i++) {
                int a = i;
                for(int j = a; j < chars.length; j++){
                    if(chars[j] == chars[a]) {
                        string = string.replace(String.valueOf(chars[a]), "");
                        isDone = true;
                    }
                }
            }
            System.out.println(string);
        }


    }
}
