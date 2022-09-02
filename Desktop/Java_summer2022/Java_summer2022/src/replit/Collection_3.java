package replit;

import java.util.ArrayList;
import java.util.List;

public class Collection_3 {
    /*
    Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.

   ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu

   Beklenen Çıktı:

   Arrayin 1. elemani: beyaz

   Arrayin 3. elemani: sari

     */
    public static void main(String[] args) {

        List<String> arrList = new ArrayList<>();

        arrList.add("beyaz");
        arrList.add("siyah");
        arrList.add("sari");
        arrList.add("kirmizi");
        arrList.add("turuncu");

        System.out.println("Arrayin 1. elemani: " + arrList.get(0));
        System.out.println("Arrayin 2. elemani: " + arrList.get(2));


    }

}

