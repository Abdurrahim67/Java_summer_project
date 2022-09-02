package replit;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_12 {

    /*
    Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.

HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
     */
    public static void main(String[] args) {

        Set<String> setList = new HashSet<>();

        setList.add("sari");
        setList.add("mavi");
        setList.add("yesil");
        setList.add("turuncu");
        setList.add("kirmizi");

        Set<String> setList1 = new TreeSet<>();

        for (String each : setList
        ) {
            setList1.add(each);


        }
        System.out.println(setList1);

        for (String each : setList1
        ) {
            System.out.println(each);
        }
    }
}
