package replit;

import java.util.ArrayList;
import java.util.List;

public class Collection_2 {

    public static void main(String[] args) {
/*
Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.

Array List:  siyah,mavi,kirmizi,beyaz

en başa: **pembe**

mavi-kirmizi arasına **yesil**  renk eklenecek.

```
Beklenen Çıktı:
```

```
[pembe,siyah,mavi,yesil,kirmizi,beyaz]

 */

        List<String> arrList=new ArrayList<>();

        arrList.add("siyah");
        arrList.add("mavi");
        arrList.add("kirmizi");
        arrList.add("beyaz");

        System.out.println(arrList);

        arrList.add(0,"pembe");
        arrList.add(2,"yesil");

        System.out.println(arrList);



    }
}
