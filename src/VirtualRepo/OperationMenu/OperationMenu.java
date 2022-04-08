package VirtualRepo.OperationMenu;

import java.io.IOException;
import java.util.Scanner;


public class OperationMenu implements OperationMenuOptions {
    Scanner input = new Scanner(System.in);
    FileOperations FileOp = new FileOperations();
    @Override
    public void addFile(){
        System.out.print("Enter the desired name of your file: ");
        String fileName = input.nextLine();
        try {
            FileOp.createFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteFile() {
        System.out.print("Enter the file name you want to delete: ");
        String fileName = input.nextLine();
        FileOp.removeFile(fileName);
    }

    @Override
    public void searchFile() {
        System.out.print("Enter the file name you want to search: ");
        String fileName = input.nextLine();
        FileOp.searchFile(fileName);
    }

}
