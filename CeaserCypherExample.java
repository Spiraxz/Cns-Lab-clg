import java.util.Scanner;

public class CeaserCypherExample
{
    public static final String ALPHABET="abcdefghijklmnopqrstuvwxyz";
    public static String encryptData(String inputStr, int shiftKey) {
        inputStr=inputStr.toLowerCase();
        String encryptStr = "";

        for (int i = 0; i < inputStr.length(); i++) {
            int pos = ALPHABET.indexOf(inputStr.charAt(i));
            int encryptPos =(shiftKey+ pos)%26;
            char encryptchar= ALPHABET.charAt(encryptPos);
            encryptStr +=encryptchar;
        }
        return encryptStr;
    }

    public static String decryptData(String inputStr, int shiftKey) {
        inputStr=inputStr.toLowerCase();
        String decryptStr = "";

        for (int i = 0; i < inputStr.length(); i++) {
            int pos = ALPHABET.indexOf(inputStr.charAt(i));
            int decryptPos =(pos -shiftKey)%26;
            if(decryptPos<0){
                decryptPos=ALPHABET.length()+decryptPos;
            }
            char decryptchar= ALPHABET.charAt(decryptPos);
            decryptStr +=decryptchar;
        }
        return decryptStr;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string to encrypt using ceaser cypher");

        String inputStr=sc.nextLine();
        System.out.println("Enter a value by which each character in the plainttext message gets shifted");
        int shiftKey=Integer.valueOf(sc.nextLine());
        System.out.println("Encrypted data -> "+encryptData(inputStr, shiftKey));
        System.out.println("Decrypted data -> "+decryptData(encryptData(inputStr, shiftKey), shiftKey));

        sc.close();
    }
    
}  