import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi=0;
        int toplam=0;


        do {
            System.out.print( "Lütfen Bir sayı giriniz: ");
            sayi=input.nextInt();
            if(sayi % 2== 0 || sayi % 4 == 0){
                toplam+=sayi;
                System.out.print("Çift sayı ve 4'e tam bölünebilen sayıların toplamı: "+ toplam+"\n") ;

            }else{
                System.out.println("Tek sayı girdiniz. ");
                break;
            }

        }while (sayi>0);
        System.out.println("Çift sayı ve 4'e tam bölünebilen sayılar Toplam: " + toplam + "\n");
    }
}