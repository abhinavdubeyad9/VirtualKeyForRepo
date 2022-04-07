package VirtualRepo;

import VirtualRepo.MainMenu.MainMenu;

import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;


        while(flag){
            System.out.println("Please select an option :");
            System.out.println("1. View files\n2. Do Operation on file\n3. Exit");
            int option = sc.nextInt();
            MainMenu menu = new MainMenu();
            switch(option){
                case 1:
                    menu.showfiles();
                    break;
                case 2:
                    menu.getOperationMenu();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect Option! Please select from given list");
            }
        }
    }
}
