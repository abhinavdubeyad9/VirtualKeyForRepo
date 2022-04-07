package VirtualRepo.OperationMenu;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public void createFile(String fileName) throws IOException {
        fileName = fileName + ".txt";
        String fileLocation = "D:\\Training\\My JAVA\\Virtual key for Repo\\src\\repo";
        File file = new File(fileLocation, fileName);
        if (file.createNewFile()) {
            System.out.println("File created.");
        } else {
            System.out.println("File already exists.");
        }
    }

    public void removeFile(String fileName) {
        fileName = fileName + ".txt";
        String fileLocation = "D:\\Training\\My JAVA\\Virtual key for Repo\\src\\repo";
        File file = new File(fileLocation, fileName);
        if(file.delete()){
            System.out.println("Deleted the file: " + file.getName());
        }else{
            System.out.println("Failed to delte the file! Please check file name or try again");
        }
    }
}
