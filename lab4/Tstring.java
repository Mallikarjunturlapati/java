import java.util.Scanner;

public class MainStringSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Input the target substring
        System.out.print("Enter the sub-string to be searched in the given string: ");
        String targetSubstring = scanner.nextLine();

        // Find the index of the first occurrence of the target substring
        int index = mainString.indexOf(targetSubstring);

        if (index != -1) {
            // Check if there are characters before the target substring
            String before = "";
            if (index > 0) {
                before = mainString.substring(index - 1, index);
            }

            // Check if there are characters after the target substring
            String after = "";
            if (index + targetSubstring.length() < mainString.length()) {
                after = mainString.substring(index + targetSubstring.length(), index + targetSubstring.length() + 1);
            }

            System.out.println("The characters just before and after of the given sub-string's first occurrence is: " + before + after);
        } else {
            System.out.println("The given sub-string does not occur in the main string");
        }

        scanner.close();
    }
}

