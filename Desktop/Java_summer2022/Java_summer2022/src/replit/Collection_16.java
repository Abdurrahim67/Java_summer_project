package replit;

import java.util.Set;
import java.util.TreeSet;

public class Collection_16 {
    /*
    Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.

    TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe

    Beklenen Çıktı:

    Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]

    Tree eleman sayısı: 5

    */

    public static void main(String[] args) {

        Set<String> treeList=new TreeSet<>();

        treeList.add("yesil");
        treeList.add("sari");
        treeList.add("mavi");
        treeList.add("kirmizi");
        treeList.add("pembe");



        System.out.println(treeList);

        System.out.println("Eleman sayisi: "+treeList.size());


    }


}
