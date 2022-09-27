import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) throws IOException {
        String PATH="/Users/thanushkumarreddykondreddy/Desktop/work python";
        Lockedimpl lm=new Lockedimpl();
        System.out.println("-----------------------------Welcome-----------------------------");
        System.out.println("Name: Kondreddy Thanush Kumar Reddy");
        System.out.println("App Name: LOCKEDME");

        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("\nchoose below options for appropriate action");
            System.out.println("1)Print the files in ascending order.");
            System.out.println("2)More file operation");
            System.out.println("3)Exit");
            System.out.print("Enter your option: ");
            char op=sc.next().charAt(0);
            switch (op) {
                case '1' -> lm.filesInAscendingOrder(PATH);
                case '2' -> {
                    System.out.println("\na)Add a file");
                    System.out.println("b)Delete a file");
                    System.out.println("c)Search a file");
                    System.out.println("d)Back to main");
                    System.out.print("Enter your option: ");
                    char ch = sc.next().charAt(0);
                    switch (ch) {
                        case 'a':
                            System.out.print("Enter the name of file: ");
                            String fn=sc.next();
                            lm.addFile(fn, PATH);
                            break;
                        case 'b':
                            System.out.print("Enter the name of file: ");
                            fn=sc.next();
                            lm.deleteFile(fn, PATH);
                            break;
                        case 'c':
                            System.out.print("Enter the name of file: ");
                            fn=sc.next();
                            lm.searchFile(fn, PATH);
                            break;
                        case 'd':
                            break;
                        default:
                            System.out.println("**Please enter a valid option**");
                    }
                }
                case '3' -> exit(0);
                default -> System.out.println("**Please enter a valid option**");
            }
        }

    }
}