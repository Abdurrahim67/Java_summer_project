package replit;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection_14 {
    /*

    Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.

TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi


Beklenen Çıktı:

Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]

Tersten Siralanisi:
yesil
turuncu
sari
mavi
kirmizi

 */

    public static void main(String[] args) {

        Set<String> treeList=new TreeSet<>();

        treeList.add("yesil");
        treeList.add("sari");
        treeList.add("mavi");
        treeList.add("turuncu");
        treeList.add("kirmizi");



        System.out.println(treeList);

        Iterator x= ((TreeSet<String>) treeList).descendingIterator();



        while (x.hasNext()){

            System.out.println(x.next());
        }






    }
}
