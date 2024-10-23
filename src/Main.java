import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Если в месяце четыре недели массив monthlyExpenses[4] не заполняем или указываем значение -1,\nесли месяц не полный элементы текущей недели не заполняем или указываем -1 ");
        System.out.println("-------------Задание 1-------------");
        int[] WeeklyExpenses = new int[5];
        Arrays.fill(WeeklyExpenses, -1);
        WeeklyExpenses[0] = 20_000;
        WeeklyExpenses[1] = 33_034;
        WeeklyExpenses[2] = 1;
       WeeklyExpenses[3] = 10_115;
         WeeklyExpenses[4] = 10_115;
        for (byte week = 0; week < WeeklyExpenses.length; week++) {
            if (WeeklyExpenses[week] != -1) {
                System.out.println("Затраты за " + (week + 1) + " неделю равны " + WeeklyExpenses[week]);
            }
        }
        byte emptyWeeks = 0;
        int monthlyAmount = 0;
        for (int element : WeeklyExpenses) {
            if (element != -1) {
                monthlyAmount += element;
            } else {
                emptyWeeks++;
            }
        }
        if (emptyWeeks == 5) {
            System.out.println("Таблица за месяц не заполнена");
        } else {
            System.out.println("Сумма трат за месяц составила " + monthlyAmount + " рублей");
        }
        System.out.println("\n-------------Задание 2-------------");
        int minimumAmount = 2_147_483_000;
        emptyWeeks = 0;
        for (int element : WeeklyExpenses) {
            if (element != -1 && element <= minimumAmount) {
                minimumAmount = element;
            } else {
                emptyWeeks++;
            }
        }
        if (emptyWeeks == 5) {
            System.out.println("Таблица за месяц не заполнена");
        } else {
            System.out.println("Минимальная сумма трат в месяце за неделю составила: " + minimumAmount + "руб.");
            int maximumAmount=minimumAmount;
            for (int element : WeeklyExpenses) {
                if (element != -1 && element >= maximumAmount) {
                    maximumAmount = element;
                }
            }
            System.out.println("Максимальная сумма трат в месяце за неделю составила: "+maximumAmount + "руб.");
        }
        System.out.println("\n-------------Задание 3-------------");
        int numberWeeks = 0;
        monthlyAmount = 0;
        for (int numberElement = 0; numberElement < WeeklyExpenses.length; numberElement++) {
            if (WeeklyExpenses[numberElement] != -1) {
                monthlyAmount += WeeklyExpenses[numberElement];
                numberWeeks = numberElement + 1;
            } else {
                break;
            }
        }
        if (numberWeeks == 0) {
            System.out.println(" Таблица данного месяца не заполнена");
        } else {
            float averageAmount=(float)monthlyAmount / numberWeeks;
            System.out.printf("%s%.2f%s%d\n","Средняя сумма трат за месяц составила ",averageAmount," рублей, количество прошедших недель месяца равно: ",numberWeeks);
        }
        System.out.println("\n-------------Задание 4-------------");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int element= reverseFullName.length-1;element>=0;element--){
            System.out.print(reverseFullName[element]);
        }
        System.out.print("\n");
    }
}