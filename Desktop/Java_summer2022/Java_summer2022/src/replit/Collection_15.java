package replit;

import java.util.TreeSet;

public class Collection_15 {

    /*

    Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe


Beklenen Çıktı:

Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]

ilk elemen: kirmizi

son eleman: yesil
     */

    public static void main(String[] args) {

        TreeSet<String> treeList=new TreeSet<>();

        treeList.add("sari");
        treeList.add("mavi");
        treeList.add("yesil");
        treeList.add("kirmizi");
        treeList.add("turuncu");
        treeList.add("pembe");


        String ilkEleman;
        String sonEleman;

        System.out.println(treeList);
        System.out.println(ilkEleman = treeList.first());
        System.out.println(sonEleman = treeList.last());


    }
}
