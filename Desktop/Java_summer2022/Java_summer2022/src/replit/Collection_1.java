package replit;

import java.util.ArrayList;
import java.util.List;

public class Collection_1 {


    public static void main(String[] args) {


        List<String> arrList = new ArrayList<>();

        arrList.add("siyah");
        arrList.add("sari");
        arrList.add("mavi");
        arrList.add("turuncu");

        for (String each : arrList) {
            System.out.println(each);

        }
    }


}

