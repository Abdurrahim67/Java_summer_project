package day37_overridding;

public class FSupra extends EToyota {
    @Override
    void yakit(){
        System.out.println("Supra benzin kullanir");
    }
    @Override
    void motor() {
        /*
          @Override notasyonu Javaya bir gorev verir
          Java, bu notasyonla birbirine bagli olan iki method'u
          surekli kontrol eder
          Eger parent class'daki overridden method'u silerseniz
          CTE verir

          @Override notasyonunu kullanmak mecbruri degildir, Eger Overridding method silinirse, kodun CTE vermesini istersek
          @Override notasyonu kullanmaliyiz
         */
    }
}
