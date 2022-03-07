import java.util.Scanner; // импорт сканера
public class Scan {
    public static void main(String args[]) {
        System.out.println("Введите число от 1 до 10:");
        Scanner scan=new Scanner(System.in);
        int number = scan.nextInt();
        System.out.print("Вы ввели число " +number);
    }
}