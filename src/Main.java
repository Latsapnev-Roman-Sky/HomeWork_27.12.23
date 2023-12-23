public class Main {
    public static void main(String[] args) {

        //Task 1

        int deposit = 15_000;
        int total = 2_459_000;
        int sum = 0;
        int month = 1;
        while (true){
            sum = sum + sum/100;
            sum = sum + deposit;
            System.out.println("Месяц "+month+", сумма накоплений равна "+sum+" рублей");
            month++;
            if (sum >= total){
                break;
            }
        }

        //Task 2

        int i = 1;
        while (i <= 10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        for (i = 10; i > 0; i--){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}