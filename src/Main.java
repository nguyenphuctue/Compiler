import IO.FileManagement;
import LexicalScanner.Lexer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import LexicalScanner.Lexer;

public class Main {

    public static void main(String[] args){
        String fileInput = "input/test3.vc";
        String source = FileManagement.ReadFile(fileInput);
        Lexer l = new Lexer(source);
        String output = l.printTokens();
        System.out.println(output);

        String fileOutput = "output/result.vctok";
        File f = new File(fileOutput);
        if(f.exists() && !f.isDirectory()) {
            FileManagement.DeleteFile(fileOutput);
        }
        FileManagement.CreateFile(fileOutput);
        FileManagement.WriteFile(fileOutput, output);
    }
}
