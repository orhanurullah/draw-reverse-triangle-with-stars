import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        System.out.println("Yıldızlarla Ters Üçgen Çizme Programı");
        int digit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Basamaklı Bir Ters Üçgen İstiyorsunuz : ");
        digit = scanner.nextInt();

        for(int i = digit; i > 0; i--){
            for(int z = 0; z < digit-i; z++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
