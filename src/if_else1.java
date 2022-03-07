import java.util.Scanner; // подключаем сканер
public class if_else1 {
    public static void main(String[] args){
        System.out.println("Введите число 1");
        Scanner inputFigure = new Scanner(System.in);
        int x = inputFigure.nextInt();
        if(x==1){
            System.out.println("Вы ввели число 1");
        } else{
            System.out.println("Вы ввели другое число");
        }
    }
}
