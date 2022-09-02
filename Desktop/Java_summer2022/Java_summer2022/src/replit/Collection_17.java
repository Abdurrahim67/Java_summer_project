package replit;

import java.util.Set;
import java.util.TreeSet;

public class Collection_17 {
    /*
    Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.

1. TreeSet: mavi,yesil,kirmizi,sari

2. TreeSet: yesil,mavi,pembe,turuncu

Beklenen Çıktı:

1. TreeSet: [kirmizi,mavi,sari,yesil]

2. TreeSet: [mavi,pembe,turuncu,yesil

Karsilastirma Sonucu:

no

yes

no

yes

     */

    public static void main(String[] args) {


        Set<String> treeList1 = new TreeSet<>();

        treeList1.add("mavi");
        treeList1.add("yesil");
        treeList1.add("kirmizi");
        treeList1.add("sari");

        System.out.println(treeList1);


        Set<String> treeList2 = new TreeSet<>();

        treeList2.add("yesil");
        treeList2.add("mavi");
        treeList2.add("pembe");
        treeList2.add("turuncu");

        System.out.println(treeList2);

        for (String each: treeList1
             ) {
            if(treeList2.contains(each)) {
                System.out.println("yes");

            }else System.out.println("no");
        }


    }


}
