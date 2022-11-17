import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<String>();

        sehirler.add("Istanbul");
        sehirler.add("Rize");
        sehirler.add("Sivas");
        sehirler.add("Adana");
        sehirler.add("Manisa");

        sehirler.remove("Istanbul");
        sehirler.remove(1);

        Collections.sort(sehirler);  // Alfabeye göre siraliyor...

        for (String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}