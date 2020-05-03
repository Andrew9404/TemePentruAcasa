public class AirPradatori extends AirAnimal {

    private boolean vaneaza;

    public AirPradatori(String color, int memberNumbers, int flyingHeight, String specimen, boolean vaneaza) {
        this.color = color;
        this.memberNumber = memberNumbers;
        this.flyingHeight = flyingHeight;
        this.specimen = specimen;
        this.vaneaza = vaneaza;

    }


    public boolean getVaneaza() {
        return vaneaza;
    }
    public String bites(){
        return "This animal fly above 50m height";
    }
}
