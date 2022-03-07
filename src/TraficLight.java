/* На вход в метод поступает цвет светофора в виде строки: например, "жёлтый". Метод должен вернуть инструкцию для автомобиля — тоже в виде строки:
"зелёный" — вернуть строку "можно ехать",
"жёлтый" или "красный" — вернуть строку "стой",
цвет другой — значит, что-то пошло не так. Нужно вернуть строку "перезапросить датчики".
 */
public class TraficLight {
    public static String processTrafficLightSignal(String color) {

    if (color == "зелёный") {
        System.out.println("можно ехать");// напиши код здесь
    }
    else if(color =="жёлтый"|| color=="красный"){
        System.out.println("стой");
    }
    return"перезапросить датчики";
} public static void main(String[] args){
        processTrafficLightSignal ("зелёный");

}
}
