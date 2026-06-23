
import java.io.*;



public class fileReader {
    public static void main(String[]args){
        try{
        FileWriter fs = new FileWriter("core-java-practice/gcr-codebase/practice/log.txt",true);
        fs.write("New Entry");

        FileReader fr = new FileReader("core-java-practice/gcr-codebase/practice/data.txt"); 
        int ch;
        while ((ch = fr.read()) != -1) {             // read() returns -1 at EOF
            System.out.print((char)ch);
            }
       fr.close();
       fs.close();
        }
        catch(Exception error){
            System.out.println(error);
        }
    }
}
