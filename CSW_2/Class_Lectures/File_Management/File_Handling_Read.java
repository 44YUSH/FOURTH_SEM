package Class_Lectures.File_Management;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class File_Handling_Read {
    public static void main(String[] args) {
        try{
            File f=new File("/workspaces/FOURTH_SEM/CSW_2/Class_Lectures/File_Management/RadheRadhe.txt");
            Scanner Reader=new Scanner(f);
            while (Reader.hasNextLine()) {
                String data=Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("An ERROR has occured.");
        }
    }
}

/*
OUTPUT

Govinda    --------------->  (We have to create a ".txt" file and put its name and path in required space.)
bolo
Hari
Gopal
Bolo
*/
