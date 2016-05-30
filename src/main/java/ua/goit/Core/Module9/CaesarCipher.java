package ua.goit.Core.Module9;

/**
 * class CaesarCipher
 *
 * Caesar cipher for string.
 *
 * Created by coura on 12.03.2016.
 */

public class CaesarCipher {

    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private static String upperCaseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String numbers = "0123456789";
    private static String alphabetRus = "абгвдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static String upperCaseAlphabetRus = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public static String encode(String text, int key){
        StringBuilder encodedContent = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if ((symbol >= 'a') && (symbol <= 'z')){
                int index = alphabet.indexOf(symbol);
                encodedContent.append(alphabet.charAt((index + key)%alphabet.length()));
            } else if ((symbol >= 'A') && (symbol <= 'Z')) {
                int index = upperCaseAlphabet.indexOf(symbol);
                encodedContent.append(upperCaseAlphabet.charAt((index + key)%upperCaseAlphabet.length()));
            } else if ((symbol >= 'а') && (symbol <= 'я')){
                int index = alphabetRus.indexOf(symbol);
                encodedContent.append(alphabetRus.charAt((index + key)%alphabetRus.length()));
            } else if ((symbol >= 'А') && (symbol <= 'Я')) {
                int index = upperCaseAlphabetRus.indexOf(symbol);
                encodedContent.append(upperCaseAlphabetRus.charAt((index + key)%upperCaseAlphabetRus.length()));
            } else if ((symbol >= '0') && (symbol <= '9')){
                int index = numbers.indexOf(symbol);
                encodedContent.append(numbers.charAt((index + key)%numbers.length()));
            } else {
                encodedContent.append(symbol);
            }
        }
        return encodedContent.toString();
    }

    public static String decode(String text, int key){
        StringBuilder decodedContent = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if ((symbol >= 'a') && (symbol <= 'z')){
                int index = alphabet.indexOf(symbol);
                decodedContent.append(alphabet.charAt((((index - key)%alphabet.length())
                        + alphabet.length())%alphabet.length()));
            } else if ((symbol >= 'A') && (symbol <= 'Z')) {
                int index = upperCaseAlphabet.indexOf(symbol);
                decodedContent.append(upperCaseAlphabet.charAt((((index - key)%upperCaseAlphabet.length())
                        + upperCaseAlphabet.length())%upperCaseAlphabet.length()));
            } else if ((symbol >= 'а') && (symbol <= 'я')){ //
                int index = alphabetRus.indexOf(symbol);
                decodedContent.append(alphabetRus.charAt((((index - key)%alphabetRus.length())
                        + alphabetRus.length())%alphabetRus.length()));
            } else if ((symbol >= 'А') && (symbol <= 'Я')) {
                int index = upperCaseAlphabetRus.indexOf(symbol);
                decodedContent.append(upperCaseAlphabetRus.charAt((((index - key)%upperCaseAlphabetRus.length())
                        + upperCaseAlphabetRus.length())%upperCaseAlphabetRus.length()));
            } else if ((symbol >= '0') && (symbol <= '9')){
                int index = numbers.indexOf(symbol);
                decodedContent.append(numbers.charAt((((index - key)%numbers.length())
                        + numbers.length())%numbers.length()));
            } else {
                decodedContent.append(symbol);
            }
        }
        return decodedContent.toString();
    }
}
