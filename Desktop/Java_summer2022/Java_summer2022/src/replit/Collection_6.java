package replit;

import java.util.LinkedList;

public class Collection_6 {

    public static void main(String[] args) {
        /*
   Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

  LinkedList elemanları: sari,mavi,mor,yesil,beyaz
  Beklenen Çıktı:
  sari
  mavi
  mor
  yesil
  beyaz

*/

        LinkedList<String> ll1 = new LinkedList();

        ll1.add("sari");
        ll1.add("mavi");
        ll1.add("mor");
        ll1.add("yesil");
        ll1.add("beyaz");

        System.out.println(ll1);

        for (String each : ll1) {

            System.out.println(each);
        }


    }
}
