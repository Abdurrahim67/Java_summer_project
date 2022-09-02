package replit;

import java.util.ArrayList;
import java.util.List;

public class Collection_5 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.

        ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu
        Beklenen Çıktı:

        Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
        siyah
        mavi
        kirmizi
        yesil
        mor
        turuncu

         */

        List<String> arrList = new ArrayList<>();

        arrList.add("siyah");
        arrList.add("mavi");
        arrList.add("kirmizi");
        arrList.add("mor");
        arrList.add("turuncu");

        System.out.println("orijinal array listesi: " + arrList);

        for (String each : arrList) {

            System.out.println(each);

        }

    }
}
