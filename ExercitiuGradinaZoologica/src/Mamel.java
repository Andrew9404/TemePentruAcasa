public class Mamel extends TerestrialAnimal {

    private int maximumBreeding;

    public Mamel(String color, int memberNumber, String move, boolean hunt, int maximumBreeding, String specimen) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.move = move;
        this.hunt = hunt;
        this.maximumBreeding = maximumBreeding;
        this.specimen = specimen;


    }

    public int getMaximumBreeding() {
        return maximumBreeding;
    }

    public String bites() {
        return "This animal bites on land if you attack his child";
    }


}
