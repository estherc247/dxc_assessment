import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;


public class Main {

    public static void main(String[] args){

        EncoderDecoderService EDService = new EncoderDecoderService();

        Scanner userInput = new Scanner(System.in);
        System.out.print("\n String to Encode: ");
        String plainText = userInput.nextLine();

        System.out.println("\n String to Decode: ");
        String encodedString = userInput.nextLine();

        System.out.println("\n Offset Value from table: ");
        String ofsValue = userInput.nextLine();

        InputData newData =  new InputData(plainText, encodedString, ofsValue);

        userInput.close();
        EDService.ofsValue = newData.getOffset();

        System.out.println("\nEncoded String: ");
        System.out.println(EDService.encode(newData.getPT()));

        System.out.println("\nDecoded String: ");
        System.out.println(EDService.decode(newData.getES()));

    }

    
}