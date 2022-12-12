import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncoderDecoderService {

    String ofsValue = "";

    //Initialise variables 
    static ArrayList<Character> refTable = new ArrayList<>(Arrays.asList('A', 'B', 'C','D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 'O', 'P', 'Q','R', 'S', 'T', 'U','V', 'W', 'X','Y', 'Z', '0', '1', '2', '3', '4','5', '6', '7', '8','9', '(', ')','*', '+', ',', '-', '.', '/'));

    //Split into words to handle sentences.
    static ArrayList<String> multipleWords(String originalText){
        String[] wordList = originalText.split(" ");
        return new ArrayList<>(Arrays.asList(wordList));
    }

    public static Integer handleOffset(Integer newIndex){
        int updIndex = 0;
        if(newIndex > 44){
            updIndex = newIndex - 44;
        }
        else if(newIndex < 0){
            updIndex = newIndex + 44;
        }
        else{
            updIndex = newIndex;
        }
        return updIndex;
    }

    //Encoder method
    public String encode(String plainText){
        ArrayList<String> textList = multipleWords(plainText);
        String encodedString = "";
        String encodeValue = ofsValue;
        encodedString += encodeValue;

        for (String text: textList){
            for (int i = 0; i < text.length(); i++) {
                if(refTable.contains(text.charAt(i))){
                    int charIndex = refTable.indexOf(text.charAt(i));
                    int newIndex = charIndex - refTable.indexOf(encodeValue.charAt(0));
                    int updIndex = handleOffset(newIndex);
                    encodedString += refTable.get(updIndex);
                }
                else{
                    encodedString += text.charAt(i);
                }
            }
            encodedString += " ";
        }
        return encodedString;
    }

    //Decoder method
    public String decode(String encodedText){
        ArrayList<String> textList = multipleWords(encodedText);
        String decodedString = "";
        char decodeValue = textList.get(0).charAt(0);
    
        for (String text: textList){
            for (int i = 0; i < text.length(); i++) {
                if(refTable.contains(text.charAt(i))){
                    int charIndex = refTable.indexOf(text.charAt(i));
                    int newIndex = charIndex + refTable.indexOf(decodeValue);
                    int updIndex = handleOffset(newIndex);
                    decodedString += refTable.get(updIndex);
                }
                else{
                    decodedString += text.charAt(i);
                }
            }
            decodedString += " ";
        }
        return decodedString.substring(1);
    }
    
}
