package Class_Lectures.File_Management;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
public class File_Handling_Write {
    public static void main(String[] args) {
        try{
            FileWriter Writer = new FileWriter("RadheKrishna.txt");
            OutputStreamWriter writer;
            Writer.write("RadhaGovind Bolo... RadhaRaman Bolo...");
            Writer.close();
            System.out.println("Successfully Written.");
        }
        catch(IOException e){
            System.out.println("An ERROR has occured.");
        }
    }
}

/*
OUTPUT

Successfully Written.    -------------->  (Automatically a file with given name will be created with imported text.)
*/