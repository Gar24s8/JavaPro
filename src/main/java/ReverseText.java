public class ReverseText {
    public static void main(String[] args) {
        String input = "Reverse";
        char[] strArray = input.toCharArray();
        int length = strArray.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = strArray[i];
            strArray[i] = strArray[length - i - 1];
            strArray[length - i - 1] = temp;
        }
        String reverseString = new String(strArray);
        System.out.println(input);
        System.out.println(reverseString);
    }
}
