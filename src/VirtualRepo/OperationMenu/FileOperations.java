package VirtualRepo.OperationMenu;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public void createFile(String fileName) throws IOException {
        fileName = fileName + ".txt";
        String fileLocation = "D:\\Training\\My JAVA\\Virtual key for Repo\\src\\Repo";
        File file = new File(fileLocation, fileName);
        if (file.createNewFile()) {
            System.out.println("File created.");
        } else {
            System.out.println("File already exists.");
        }
    }

    public void removeFile(String fileName) {
        fileName = fileName + ".txt";
        String fileLocation = "D:\\Training\\My JAVA\\Virtual key for Repo\\src\\Repo";
        File file = new File(fileLocation, fileName);
        if(file.delete()){
            System.out.println("Deleted the file: " + file.getName());
        }else{
            System.out.println("Failed to delete the file! Please check file name or try again");
        }
    }

    public void searchFile(String fileName) {
        fileName = fileName + ".txt";
        String pathName = "D:\\Training\\My JAVA\\Virtual key for Repo\\src\\Repo";
        String[] flist = new File(pathName).list();
        if(flist == null){
            System.out.println("Empty directory");
            return;
        }
        boolean flag = false;
        for (String file : flist) {
            if(fileName.equals(file)){
                flag = true;
               break;
            }
        }
        if(flag){
            System.out.println("file found");
        }else{
            System.out.println("file not found");
        }
    }

}
