/// задание с яндекса
    public class Yandex_1 {
        public static void printSpeedingTicket(int speedLimit, int currentSpeed) {
            int overspeed = currentSpeed - speedLimit;
            if(overspeed >= 20 && overspeed < 40) {
                System.out.println("Может прийти штраф: 500 рублей!");
            }
            else if(overspeed >=40  && overspeed < 60) {
                System.out.println("Может прийти штраф: 1000 рублей!");
            }
            else if(overspeed >=60  && overspeed < 80){
                System.out.println("Может прийти штраф: 2500 рублей!");
            }else if (overspeed >= 80)
                System.out.println("Может прийти штраф: 5000 рублей!");
        }

        public static void main(String[] args) {

            printSpeedingTicket (50,100);
            printSpeedingTicket(55,90);
        }
    }



