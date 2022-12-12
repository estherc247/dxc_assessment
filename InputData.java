public class InputData {
    private String plainText;
    private String encodedString;
    private String ofsValue; 
    
    //default
    public InputData(){}
    
    //update based on user input 
    public void encoderData(String plainText, String ofsValue){
        this.plainText = plainText;
        this.ofsValue = ofsValue;
    }
    
    public void decoderData(String encodedString) {
    	this.encodedString = encodedString;
    }
    
    //Call updated values 
    public String getPT(){return plainText;}
    public String getOffset(){return ofsValue;}
    public String getES(){return encodedString;}
    
}
