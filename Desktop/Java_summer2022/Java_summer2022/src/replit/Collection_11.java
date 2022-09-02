package replit;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_11 {

    /*

    HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
    HashSet List: sari,mavi,kirmizi,yesil,mor


Beklenen Çıktı:

TreeSet elements:
kirmizi
mavi
mor
sari
yesil
     */

    public static void main(String[] args) {

        Set<String> setList = new HashSet<>();

        setList.add("sari");
        setList.add("mavi");
        setList.add("kirmizi");
        setList.add("yesil");
        setList.add("mor");

        System.out.println(setList);
        Set<String> setList1 = new TreeSet<>();

        for (String each : setList
        ) {
            setList1.add(each);

        }

        System.out.println(setList1);
    }


}
