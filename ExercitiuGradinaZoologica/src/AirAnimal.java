public class AirAnimal extends Animal {


    protected int flyingHeight;

    public AirAnimal(String color, int memberNumber, int flyingHeight, String specimen) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.flyingHeight = flyingHeight;
        this.specimen = specimen;


    }
    public AirAnimal(){

    }

    public int getFlyingHeight() {
        return flyingHeight;
    }


}
