import java.util.Scanner; // импорт сканера
public class Scan3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите две фразы :" );
        String phrase1 = sc.nextLine();
        String phrase2 = sc.nextLine();
        System.out.println(  phrase1 + "  " + phrase2 );
    }
}
