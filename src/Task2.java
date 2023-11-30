public class Task2 {
    public static void main(String[] args) {

        String string = "Hello, World!";
        System.out.println(string);

        String newString = "";
        char [] chars = string.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            newString = newString.concat(String.valueOf(chars[i]));
        }
        System.out.println(newString);
    }
}