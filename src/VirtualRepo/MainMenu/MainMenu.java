package VirtualRepo.MainMenu;

import VirtualRepo.OperationMenu.OperationMenu;

import java.io.File;
import java.util.Scanner;

public class MainMenu implements MainMenuOptions {

    @Override
    public void getOperationMenu() {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please Select an option:");
            System.out.println("1. Add file\n2. Delete File\n3. Search file\n4. Go back to main menu");
            int option = sc.nextInt();
            OperationMenu op = new OperationMenu();

            switch(option){
                case 1:
                    op.addFile();
                    break;
                case 2:
                    op.deleteFile();
                    break;
                case 3:
                    op.searchFile();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Incorrect Option! Please select from given list");

            }
        }
    }

    @Override
    public void showfiles() {

        String pathName = "D:\\Training\\My JAVA\\Virtual key for Repo\\src\\repo";

        File[] files = new File(pathName).listFiles();

        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
