import java.util.Scanner; // импорт сканнера
public class ScanString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = sc.nextLine();
        System.out.println("Вы ввели: " + phrase1);
    }
}