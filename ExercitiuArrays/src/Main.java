import com.sun.source.tree.Scope;

public class Main {

    public static void main(String[] args) {

//exercitiu

        //sa se creeze un vector ce contine toti anii secolului 16
        //sa se creeze cate o metoda separata pentru urmatoarele cerinte
        //sa se afiseze fiecare an din vecotr
        //sa se afiseze doar anii bisecti
        //sa se calculeze suma anilor bisecti
        //sa se afiseze musajul "Final de deceniu" pentru fiecare final de deceniu
        //sa se calculeze suma anilor divizibili cu 23


        int an = 1501;
        int anFin = 1600;
        int arrayAni[] = new int[1600];


        //am adaugat anii in vectori
        while (an <= anFin) {
            arrayAni[an - 1] = an;
            an++;
        }
        afiseazaAnii(arrayAni);
        System.out.println("De aici afisam anii bisecti");
        afiseazaBisecti(arrayAni);
    }
    //creem metoda  (daca doar afisam nu returneaza nimic si folosim void)
    public static void afiseazaAnii ( int[] parametru){
        for (int cursor = 1500; cursor < parametru.length; cursor++)
            System.out.println(parametru[cursor]);
    }
    //afisam ani bisecti
    public static void afiseazaBisecti ( int[] parametru1){
        for(int cursor = 1500;cursor< parametru1.length; cursor++)
        if(parametru1[cursor]%4==0){
            System.out.println(parametru1[cursor]);
        }
    }
}
