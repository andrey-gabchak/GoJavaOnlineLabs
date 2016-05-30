package ua.goit.Core.Module10;

import java.io.*;

import static ua.goit.Core.Module9.CaesarCipher.decode;
import static ua.goit.Core.Module9.CaesarCipher.encode;


/**
 * Created by coura on 02.04.2016.
 *
 * Implement load / save text messages to a file with advanced encryption / decryption.
 * To provide for the processing of a variety of I / O errors.
 */


public class IOFile {

    private static String encodeFileName = "\\main.java.ua.goit.Core.Module10\\encode.txt";
    private static String decodeFileName = "\\main.java.ua.goit.Core.Module10\\decode.txt";

    public static void main(String[] args) throws IOException {

        System.out.println("Type the text:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String someText = reader.readLine();

        System.out.println("Type a key for the encoding:");
        BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
        int key = Integer.parseInt(keyReader.readLine());

        String encodeText = encode(someText, key);

        StringBuilder encodeStringBuilder = new StringBuilder();
        encodeStringBuilder.append(someText)
                .append("\n")
                .append(encodeText);

        String fullText = encodeStringBuilder.toString();

        writer(encodeFileName, fullText);
        writer(decodeFileName, decode(encodeText, key));

        reader(encodeFileName);
        reader(decodeFileName);
    }


    public static void writer(String fileName, String text){
        File file = new File(fileName);

        try {
            if (!file.exists())
                file.createNewFile();
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String reader(String fileName) throws FileNotFoundException {

        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }

        StringBuilder stringBuilder = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String s;
                while ((s = reader.readLine()) != null){
                    stringBuilder.append(s)
                            .append("\n");
                }
            } finally {
                reader.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }
}
