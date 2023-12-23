public class Main {
    public static void main(String[] args) {

        //Task 1

        int deposit = 15_000;
        int total = 2_459_000;
        int sum = 0;
        int month = 1;
        while (true) {
            sum = sum + sum / 100;
            sum = sum + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            month++;
            if (sum >= total) {
                break;
            }
        }

        //Task 2

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Task 3

        int totalPopulation = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int startYear = 2023;
        for (int year = startYear; year <= startYear + 10; year++){
            totalPopulation = totalPopulation + totalPopulation * birthRate / 1000 - totalPopulation * mortalityRate / 1000;
            System.out.println("Год " + year + " , численность населения составляет " + totalPopulation);
        }

        //Task 4

        total = 12_000_000;
        sum = 15_000;
        month = 1;
        double percent = 0.07;
        while (true) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            sum = (int) (sum + sum * percent);
            month++;
           if (sum >= total) {
                break;
           }
        }

        //Task 5

        sum = 15_000;
        month = 1;
        while (sum < total) {
            sum = (int) (sum + sum * percent);
            if (month % 6 == 0) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
            month++;
        }

        //Task 6

        sum = 15_000;
        month = 1;
        int months = 12 * 9;
        while (month <= months) {
            sum = (int) (sum + sum * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
            month++;
        }

        //Task 7

        int firstFryday =  5;
        for (int day = firstFryday; day < 31; day = day + 7){
            System.out.println("Сегодня пятница,"+day+"-е число. Необходимо подготовить отчет");
        }





    }

}