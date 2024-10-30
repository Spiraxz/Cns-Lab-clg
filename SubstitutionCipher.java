import java.util.Scanner;

public class SubstitutionCipher {

    // Define a substitution key for the alphabet
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String SUBSTITUTION_KEY = "qwertyuiopasdfghjklzxcvbnm"; // Example substitution key

    public static String encryptData(String inputStr) {
        inputStr = inputStr.toLowerCase();
        StringBuilder encryptStr = new StringBuilder();

        for (int i = 0; i < inputStr.length(); i++) {
            char currentChar = inputStr.charAt(i);
            int pos = ALPHABET.indexOf(currentChar);
            if (pos != -1) {
                char encryptChar = SUBSTITUTION_KEY.charAt(pos);
                encryptStr.append(encryptChar);
            } else {
                encryptStr.append(currentChar); // Keep non-alphabet characters unchanged
            }
        }
        return encryptStr.toString();
    }

    public static String decryptData(String inputStr) {
        inputStr = inputStr.toLowerCase();
        StringBuilder decryptStr = new StringBuilder();

        for (int i = 0; i < inputStr.length(); i++) {
            char currentChar = inputStr.charAt(i);
            int pos = SUBSTITUTION_KEY.indexOf(currentChar);
            if (pos != -1) {
                char decryptChar = ALPHABET.charAt(pos);
                decryptStr.append(decryptChar);
            } else {
                decryptStr.append(currentChar); // Keep non-alphabet characters unchanged
            }
        }
        return decryptStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string for encryption using Substitution Cipher:");
        String inputStr = sc.nextLine();

        String encryptedData = encryptData(inputStr);
        System.out.println("Encrypted Data --> " + encryptedData);

        String decryptedData = decryptData(encryptedData);
        System.out.println("Decrypted Data --> " + decryptedData);

        sc.close();
    }
}
