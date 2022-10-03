import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String reversedString = "";

        for(int i = str.length()-1; i >= 0; i--)
        {
            reversedString = reversedString + str.charAt(i);
        }

        System.out.println("The reversed string is: " + str);
        System.out.println(reversedString);
    }
}