package Filehandling;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws IOException {
//       code to     create a new file:
        File myfile =new File("file.txt");
//try {
//    myfile.createNewFile();
//}catch (IOException e){
//    System.out.println("I am unable to read this file");
//    e.printStackTrace();
//    code to write a file
    FileWriter writer=new FileWriter("file.txt");
    writer.write("this is the first file of this course");
    writer.close();
//    code to read file
        Scanner sc =new Scanner(myfile);
        while ((sc.hasNextLine())){
            String data =sc.nextLine();
            System.out.println(data);
        }
        sc.close();
//        code to delete a file
        if(myfile.delete()){
            System.out.println("I have delete this file "+myfile.getName());
        }else {
            System.out.println("some error occured ");
        }
//        file handling using byte stream
        FileInputStream inputStream=null;
        FileOutputStream outputStream=null;
        try {
            inputStream=new FileInputStream("input.txt");
            outputStream=new FileOutputStream("output.txt");

        int c;
        while ((c =inputStream.read())!=-1){
            outputStream.write(c);
            }
        }finally{
            if(inputStream!=null){
                inputStream.close();
            }if (outputStream!=null){
                outputStream.close();
            }

        }

}
    }
//}
