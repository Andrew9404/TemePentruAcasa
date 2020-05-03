public class Animal {

    protected String color;
    protected int memberNumber;
    protected String specimen;


    //am initializat
    public Animal(String color, int memberNumber,String specimen) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.specimen=specimen;
    }

    public Animal() {
    }

    public String getColor() {
        return color;
    }

    public int getMemberNumber() {
        return memberNumber;
    }
public String getSpecimen(){
        return specimen;
}
    public String bites(){
        return "This animal biets: ";
    }


}
