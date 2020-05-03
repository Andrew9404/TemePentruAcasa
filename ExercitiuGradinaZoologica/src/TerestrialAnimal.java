public class TerestrialAnimal extends Animal {

    protected String move;
    protected boolean hunt;



    public TerestrialAnimal(String color,int memberNumber,String move,boolean hunt,String specimen){
        //atribuim valorile din parametri atributelor
        this.color=color;
        this.memberNumber=memberNumber;
        this.move=move;
        this.hunt=hunt;
        this.specimen=specimen;


    }
    public TerestrialAnimal(){

    }
    public String getMove(){
        return move;
    }
    public boolean getHunt(){
        return hunt;
    }
    public String bites(){
        return "THis animal bites on land";

    }




}
