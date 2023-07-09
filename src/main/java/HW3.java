import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        ArrayList<Integer> Listnumber = new ArrayList<>();
        for (int i = 0; i<10; i++){
            Listnumber.add(new Random().nextInt(50));
        }
        System.out.println("List random numbers: " + Listnumber);
        ArrayList<Integer> Listnumbercopy = new ArrayList<>();
        Listnumbercopy.addAll(Listnumber);
        System.out.println(Listnumbercopy);
        Iterator<Integer> change = Listnumber.iterator();
        while (change.hasNext()){
            int number = change.next();
            if (number % 2 == 0){
                change.remove();
            }
        }
        System.out.println("-".repeat(40));
        System.out.println("List delete numbers: " + Listnumber);
        System.out.println("-".repeat(40));
        System.out.println("Max number = " + Collections.max(Listnumber));
        System.out.println("Min number = " + Collections.min(Listnumber));
        System.out.println("-".repeat(30));

        int summa = 0;
        for (int i = 0; i<10; i++){
            summa += Listnumbercopy.get(i);
        }
        int midle = summa / Listnumbercopy.size();
        System.out.println("Midle number = " + midle);
    }
}


