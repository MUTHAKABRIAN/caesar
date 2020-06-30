import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main (String[]args){
        Console myConsole = System.console();
        Scanner myScanner = new Scanner(System.in);
        boolean runProgram = true;

        while(runProgram){
            System.out.println("welcome to Caesar Cipher");
            System.out.println ("Would you like encrypt or decrypt a statement");
            String userAnswer= myConsole.readLine();

            if (userAnswer.equals("encrypt")){
                System.out.println("Please enter a statement that you would like to encrypt: ");
                String statement = myConsole.readLine();

                System.out.println("Please enter an encryption key:");
                int key= myScanner.nextInt();

            }
        }
    }
}
