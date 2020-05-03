public class ApaDulce extends AquaticAnimal{

    private String mediuDeViata;

    public ApaDulce(String color,int memberNumber,int deep,String specimen,String mediuDeViata){
        this.color=color;
        this.memberNumber=memberNumber;
        this.deep=deep;
        this.specimen=specimen;
        this.mediuDeViata=mediuDeViata;

    }
    public String getMediuDeViata(){
        return mediuDeViata;
    }
    public String bites(){
        return "This animal lives at maximum 200m";

    }
}
