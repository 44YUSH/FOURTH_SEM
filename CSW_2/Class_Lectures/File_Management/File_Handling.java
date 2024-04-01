package Class_Lectures.File_Management;

import java.io.File;
import java.io.IOException;

public class File_Handling {
    public static void main(String[] args) {
        try{
            File obj=new File("myfile.txt");
            if(obj.createNewFile()){
                System.out.println("File created : "+obj.getName());
            }
            else{
                System.out.println("File already exists : ");
            }
        }
        catch(IOException e){
            System.out.println("An ERROR has occured.");
        }
    }
}

/*
OUTPUT

File created : myfile.txt    ----------------->   (And also a ".TXT" file will be created in the library.)
*/