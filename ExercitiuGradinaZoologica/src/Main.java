public class Main {
    public static void main(String[] args) {
        //Vream sa creem 2 mamifere, 2 ierbifore, 2 carnive, 3 animale tereste, 2 animale

        //Creem 2 animale

        Animal animal1=new Animal("black",2,"maimuta");
        Animal animal2=new Animal("red",4,"tigru");

        //Creem 3 animale terestre

        TerestrialAnimal animalTerestru1=new TerestrialAnimal("verde",0,"taras",true ,"snake");
        TerestrialAnimal animalTerestru2=new TerestrialAnimal("grey",4,"merge incet",false,"elefant");
        TerestrialAnimal animalTerestru3=new TerestrialAnimal("black",4,"alearga",true,"pantera");

        //Creem 2 animale carnivore

        CarnivoreAnimal animalCarnivor1=new CarnivoreAnimal("grey",4,"alearga",true,true,"wolf");
        CarnivoreAnimal animalCarnivor2=new CarnivoreAnimal("yellow",4,"alearga",true,true,"leu");

        //Creem 2 animale ierbivore

        ErbivorAnimal animalErbivor1=new ErbivorAnimal("orange",4,"alearga",false,true,"caprioara");
        ErbivorAnimal animalErbivor2=new ErbivorAnimal("maro",4,"merge incet",false,true,"arici");

        //Creem 2 mamifere

        Mamel animalMamifer1=new Mamel("alba",4,"alearga",false,4,"zebra");
        Mamel animalMamifer2=new Mamel("maro",4,"alearga",false,1,"cal");

        //Vrem sa vedem specia mamifer 2
        System.out.println("Specia mamiferului 2 este: "+animalMamifer2.getSpecimen());

        //Vrem sa vedem numarul de membre animal carnivor 1
        System.out.println("Numarul de membre carnivor 1: "+animalCarnivor1.getMemberNumber());

        //Vrem sa vedem culoare animalului terestu 3
        System.out.println("Culoarea animalului terestru 3: "+animalTerestru3.getColor());

        //Vrem sa vedem numarul de membre mamifer 1
        System.out.println("Numarul de membre mamifer 1: "+animalMamifer1.getColor());

        //Vrem sa vedem specimenul carnivor 1
        System.out.println("Specimenul carnivorului 1: "+animalCarnivor1.getColor());

        //Vrem sa vedem numarul de membre erbivor 2
        System.out.println("Numarul de membre erbivor 2: "+animalErbivor1.getColor());




    }

}
