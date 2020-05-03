public class ErbivorAnimal extends  TerestrialAnimal{

    private boolean eatPlants;

    public ErbivorAnimal(String color,int memberNumber,String move,boolean hunt,boolean eatPlants,String specimen){
        this.color=color;
        this.memberNumber=memberNumber;
        this.move=move;
        this.hunt=hunt;
        this.eatPlants=eatPlants;
        this.specimen=specimen;


    }
    public boolean getEatPlants(){
        return eatPlants;
    }
    public String bites(){
        return "This animal doesn't bite";
    }


}
