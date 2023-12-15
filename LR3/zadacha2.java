import java.util.Scanner;
public class zadacha2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите день недели(английская раскладка, нижний регистр) ");
        String day = id.nextLine();

        WeekDay.IfMethod(day);
        WeekDay.SwitchMethod(day);
    }

    static class WeekDay {

       static void IfMethod(String d) {
            String day = d;
            System.out.println("\nверсия программы на основе вложенных условных операторов");
            int dayN = 0;
            if (day.equals("monday")) {
                dayN = 1;
            } else if (day.equals("tuesday")) {
                dayN = 2;
            } else if (day.equals("wednesday")) {
                dayN = 3;
            } else if (day.equals("thursday")) {
                dayN = 4;
            } else if (day.equals("friday")) {
                dayN = 5;
            } else if (day.equals("saturday")) {
                dayN = 6;
            } else if (day.equals("sunday")) {
                dayN = 7;
            } else {
                System.out.println(day + " некорректное значение дня недели");
            }
            if (dayN != 0) {
                System.out.printf("%s это %s-й день недели\n", day, dayN);
            }
            return;
        }

        static void SwitchMethod(String d) {
            System.out.println("\nверсия программы на основе оператора выбора switch");
            String day = d;
            switch (day) {
                case "monday":
                    System.out.println(day + " это 1-ый день недели");
                    break;
                case "tuesday":
                    System.out.println(day + " это 2-ой день недели");
                    break;
                case "wednesday":
                    System.out.println(day + " это 3-ий день недели");
                    break;
                case "thursday":
                    System.out.println(day + " это 4-ый день недели");
                    break;
                case "friday":
                    System.out.println(day + " это 5-ый день недели");
                    break;
                case "saturday":
                    System.out.println(day + " это 6-ой день недели");
                    break;
                case "sunday":
                    System.out.println(day + " это 7-ой день недели");
                    break;
                default:
                    System.out.println(day + " некорректное значение дня недели");
                    break;
            }
        }

    }
}