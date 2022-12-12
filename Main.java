import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
    	
    	String ofsValue = "";
    	String plainText = "";
    	String encodedString = "";
    	int choice  = 1;
    	
        EncoderDecoderService EDService = new EncoderDecoderService();
        InputData newData =  new InputData();
        
        Scanner userChoice = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);
        
        while(choice != 3) {
        	System.out.println("\n--------MENU-------- ");
        	System.out.println("1. Encoder ");
            System.out.println("2. Decoder ");
            System.out.println("3. Exit ");
            System.out.println("Select an option: ");
            
            choice = userChoice.nextInt();
           
            if(choice == 1) {
            	System.out.print("String to Encode: ");
                plainText = userInput.nextLine().toUpperCase();
                
                System.out.println("Offset Value from table: ");
                ofsValue = userInput.nextLine().toUpperCase();
                
                newData.encoderData(plainText, ofsValue);
                
                EDService.ofsValue = newData.getOffset();
                
                System.out.println("Encoded String: ");
                System.out.println(EDService.encode(newData.getPT()));
                
            }else if(choice == 2) {
            	System.out.println("String to Decode: ");
                encodedString = userInput.nextLine().toUpperCase();
                
                newData.decoderData(encodedString);
                
                System.out.println("Decoded String: ");
                System.out.println(EDService.decode(newData.getES()));
            }else if(choice !=3){
            	System.out.println("Please enter a valid number (1/2/3).");
            }
        	
        }
        
        userInput.close();
        userChoice.close();
        System.exit(0);

    }

    
}
