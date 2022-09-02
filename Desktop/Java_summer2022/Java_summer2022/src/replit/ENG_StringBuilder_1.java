package replit;

public class ENG_StringBuilder_1 {

    public static void main(String[] args) {

     /*   Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder
        and checks if sentence is palindrome or not (without case sensitivity)
         Eg : input : I love Java Output: "Reversed sentence : avaJ evol I . It is not a palindrome"
      */


        String str = "I love Java";
        StringBuilder sb = new StringBuilder(str.toLowerCase());

        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

    }


}
  /*

  Scanner scan=new Scanner(System.in);
        System.out.print("String giriniz: ");
        String str=scan.nextLine();
        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.substring(i,i+1);
        }if(str.equalsIgnoreCase(tersStr)){
            System.out.println("Palnidrom'dur");
        }else {
            System.out.println("Palindrome degildir");
        }
   */