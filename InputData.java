public class InputData {
    private String plainText;
    private String encodedString;
    private String ofsValue; 

    public InputData(){}

    public InputData(String plainText, String encodedString, String ofsValue){
        this.plainText = plainText;
        this.encodedString = encodedString;
        this.ofsValue = ofsValue;
    }
    public void setPT(String plainText){this.plainText = plainText;}
    public void setES(String encodedString){this.encodedString = encodedString;}
    public void setOffset(String ofsValue){this.ofsValue = ofsValue;}

    public String getPT(){return plainText;}
    public String getES(){return encodedString;}
    public String getOffset(){return ofsValue;}
    
}
