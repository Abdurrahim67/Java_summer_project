package replit;

import java.util.ArrayList;
import java.util.List;

public class Collection_4 {
    public static void main(String[] args) {

        /*

  Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
Array Elemanları: sari,yesil,mavi,pembe
**mavi rengini turuncu ile değiştirelim.**

```Beklene Çıktı:
`  [sari,yesil,mavi,pembe]
```[sari,yesil,turuncu,pembe]
         */


        List<String> arrList = new ArrayList<>();

        arrList.add("sari");
        arrList.add("yesil");
        arrList.add("mavi");
        arrList.add("pembe");


        System.out.println(arrList);
        arrList.set(2, "turuncu");
        System.out.println(arrList);


    }
}
