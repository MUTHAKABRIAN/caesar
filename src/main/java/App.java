
import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String userAnswer ="" ;
        String userChoice = "";
        boolean runProgram = true;


        while(true){
            System.out.println("welcome to Caesar Cipher");
            System.out.println ("Would you like encrypt or decrypt a statement");
            userChoice= myScanner.nextLine();

            if (userChoice.equals("encrypt")){
                System.out.println("Please enter a statement that you would like to encrypt: ");
                String statement = myScanner.nextLine();

                System.out.println("Please enter an encryption key:");
                int key= myScanner.nextInt();

                CaesarCipher userEncryption = new CaesarCipher(statement,key);
                String encryption = userEncryption.isActuallyEncrypted(statement,key);
                System.out.println("The encrypted statement is:\n"+encryption);

            }else if (userChoice.equals("decrypt")) {
                System.out.println("Please enter a statement to decrypt:");
                String statementDecrypt = myScanner.nextLine();

                System.out.println("please enter an decryption key");
                int keyDecrypt =myScanner.nextInt();
                CaesarCipher userDecryption = new CaesarCipher(statementDecrypt, keyDecrypt);
                String decryption = userDecryption.toDecrypt(statementDecrypt, keyDecrypt);

                System.out.println("The decrypted statement is:\n"+decryption);
            }else if(userChoice.equals("exit")){
                runProgram= false;
            }
        }
    }
}
