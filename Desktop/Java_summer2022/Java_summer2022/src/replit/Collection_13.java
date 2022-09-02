package replit;

import java.util.Set;
import java.util.TreeSet;

public class Collection_13 {
    public static void main(String[] args) {

        /*
        Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.

TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah
         */


        Set<String>treeList=new TreeSet<>();

        treeList.add("yesil");
        treeList.add("mavi");
        treeList.add("kirmizi");
        treeList.add("sari");
        treeList.add("beyaz");
        treeList.add("siyah");


        System.out.println(treeList);

        for (String each:treeList
             ) {
            System.out.println(each);

        }

    }
}
