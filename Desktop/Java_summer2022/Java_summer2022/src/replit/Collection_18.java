package replit;

import java.util.PriorityQueue;

public class Collection_18 {
    /*
    Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.

priority queue elemanları: sari,yesil,mavi,kirmizi

Beklenen Çıktı:

Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]


     */
    public static void main(String[] args) {


        PriorityQueue<String> pqlist = new PriorityQueue<>();

        pqlist.add("sari");
        pqlist.add("yesil");
        pqlist.add("mavi");
        pqlist.add("kirmizi");

        System.out.println(pqlist);


    }
}
