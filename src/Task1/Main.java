package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Input full name of file: ");
            String inputFile = scanner.nextLine();

            if (inputFile.contains(".txt")) {
                TXTHandler fileHandler = new TXTHandler();
                fileHandler.open(inputFile);
                fileHandler.change(inputFile);
                fileHandler.create();
                return;
            }

            if (inputFile.contains(".doc")) {
                DOCHandler fileHandler = new DOCHandler();
                fileHandler.open(inputFile);
                fileHandler.change(inputFile);
                fileHandler.create();
                return;
            }

            if (inputFile.contains(".xml")) {
                XMLHandler fileHandler = new XMLHandler();
                fileHandler.open(inputFile);
                fileHandler.change(inputFile);
                fileHandler.create();
                return;
            }

            System.out.println("!!!Enter correct file name and his extend!!!");
        }
    }
}
