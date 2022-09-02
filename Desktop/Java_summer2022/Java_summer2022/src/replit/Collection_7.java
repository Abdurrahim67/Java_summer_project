package replit;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection_7 {
    public static void main(String[] args) {
/*
bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

1. elemandan itibaren yazdıralım.

 Beklenen Çıktı:

beyaz
mavi
yesil
turuncu

 */
        LinkedList<String> ll1 = new LinkedList();

        ll1.add("sari");
        ll1.add("beyaz");
        ll1.add("mavi");
        ll1.add("yesil");
        ll1.add("turuncu");

        System.out.println(ll1);

        Iterator i1 = ll1.listIterator();

        while (i1.hasNext()) {
            System.out.println(i1.next());

        }


    }
}
