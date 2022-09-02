package replit;

import java.util.LinkedList;
import java.util.ListIterator;

public class Collection_9 {

    public static void main(String[] args) {


        LinkedList<String> ll1=new LinkedList<>();


        ll1.add("sari");
        ll1.add("mavi");
        ll1.add("yesil");
        ll1.add("kirmizi");
        ll1.add("beyaz");
        ll1.add("mor");

        ListIterator it= ll1.listIterator();

        while (it.hasNext()) {

            it.next();

        }
        while (it.hasPrevious()) {
            System.out.println(it.previous()+" ");
        }

    }
}
