public class AirNepradatori extends AirAnimal{

    private boolean vaneaza2;

    public AirNepradatori(String color, int memberNumbers, int flyingHeight, String specimen, boolean vaneaza2){
        this.color=color;
        this.memberNumber=memberNumbers;
        this.flyingHeight=flyingHeight;
        this.specimen=specimen;
        this.vaneaza2=vaneaza2;
    }

    public boolean getVaneaza2(){
        return vaneaza2;
    }
    public String bites(){
        return "This animal fly at maximum 50m height";
    }
}
