package day17_NestedForLoop;

public class C01_NestedForLoop {

    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz
        String input = "taka tuka";
        tekrarsizYap(input);
    }

    public static void tekrarsizYap(String input) {
        String benzersizInput = "";
        String islenecekKelime = input.replaceAll("\\W", ""); // taka tuka
        System.out.print(islenecekKelime.substring(0, 1)); // T
        benzersizInput += islenecekKelime.substring(0, 1);  // T
        for (int i = 1; i < islenecekKelime.length(); i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i, i + 1))) {
                System.out.print(", " + islenecekKelime.substring(i, i + 1));
                benzersizInput += islenecekKelime.substring(i, i + 1);
            }
        }
        System.out.println("");
        System.out.println("input: " + input);
        System.out.println("benzersiz input : " + benzersizInput);

    }
}
