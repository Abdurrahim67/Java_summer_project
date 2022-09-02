package replit;

import java.util.LinkedList;

public class Collection_8 {

    public static void main(String[] args) {

        /*
Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

Beklenen Çıktı:

Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]

Listenin ilk elemani: sari

listenin son elemani: beyaz

         */
        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("sari");
        ll1.add("mavi");
        ll1.add("turuncu");
        ll1.add("siyah");
        ll1.add("yesil");
        ll1.add("beyaz");

        System.out.println("Orijinal list elemanlari: " + ll1);

        System.out.println("ilk eleman: "+ll1.getFirst());
        System.out.println("son eleman: "+ll1.getLast());



    }


}



