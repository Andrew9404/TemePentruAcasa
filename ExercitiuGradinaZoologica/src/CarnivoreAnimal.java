public class CarnivoreAnimal extends  TerestrialAnimal{

    private boolean eatMeat;

    public CarnivoreAnimal(String color,int memberNumber,String move,boolean hunt,boolean eatMeat,String specimen){
        this.color=color;
        this.memberNumber=memberNumber;
        this.move=move;
        this.hunt=hunt;
        this.eatMeat=eatMeat;
        this.specimen=specimen;
    }
    public boolean getEatMeat(){
        return eatMeat;

    }


}
