
public class Main {
    public static void main(String[] args) {
        final String secretKey = "ihatesecrets:(";

        String originalString = "Credit Card Number: 001455600";
        String encryptedString = AES.encrypt(originalString, secretKey);
        String decryptedString = AES.decrypt(encryptedString, secretKey);

        System.out.println(originalString);
        System.out.println(encryptedString);
        System.out.println(decryptedString);
    }
}
