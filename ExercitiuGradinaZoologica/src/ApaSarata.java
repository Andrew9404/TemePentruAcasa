public class ApaSarata extends AquaticAnimal {

    private String mediuDeViata2;

    public ApaSarata(String color, int memberNumber, int deep, String specimen, String mediuDeViata2) {
        this.color=color;
        this.memberNumber=memberNumber;
        this.deep=deep;
        this.specimen=specimen;
        this.mediuDeViata2=mediuDeViata2;

    }
    public String getMediuDeViata2(){
        return mediuDeViata2;

    }
    public String bites(){
        return "This animal lives under 200m";
    }



}
