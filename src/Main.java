import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kg, boy;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu(Metre Cinsinden Giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kg = input.nextDouble();
        double index = (kg / (boy * boy));
        System.out.print("Vücut Kitle İndeksiniz " + index);
    }
}