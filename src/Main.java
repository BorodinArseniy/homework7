public class Main {
    public static void main(String[] args) {
        //task1
        int month = 0;
        int money = 0;
        int moneyAMonth = 15_000;
        while (money < 2_459_000) {
            money += moneyAMonth;
            month += 1;
        }

        System.out.printf("Месяц " + month + ", сумма накоплений равна %d рублей \n", money);

        //task2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task3
        int currentPopulation = 12_000_000;
        int birthRateAYear = currentPopulation / 1000 * 17;
        int deathRateAYear = currentPopulation / 1000 * 8;
        int year = 0;
        while (year < 10) {
            currentPopulation = currentPopulation + birthRateAYear - deathRateAYear;
            year++;
            System.out.printf("Год %d, численность населения составляет %d\n", year, currentPopulation);
        }

        //task4
       /* double deposit = 15000;
        int month2 = 0;
        while(deposit<12_000_000) {
            deposit = deposit + 0.07*deposit;
            month2++;
            //System.out.printf("Месяц " + month2 + ", сумма накоплений равна %.0f рублей \n", deposit);
            //task5
            if(month2%6==0) {
                System.out.printf("Месяц " + month2 + ", сумма накоплений равна %.0f рублей \n", deposit);
            }
        } */

        //task6
        double vasilyDeposit = 15000;
        int month3 = 0;
        while (month3 < 9 * 12) {
            vasilyDeposit = vasilyDeposit + vasilyDeposit * 0.07;
            month3++;
            if (month3 % 6 == 0) {
                System.out.printf("Месяц " + month3 + ", сумма накоплений равна %.0f рублей \n", vasilyDeposit);
            }

        }

        //task7
        int firstFridayOfTheMonth = 4;
        while (firstFridayOfTheMonth<31) {
            firstFridayOfTheMonth+=7;
            System.out.println("Сегодня пятница, "+ firstFridayOfTheMonth+"-е число. Необходимо подготовить отчет");
            if((31 - firstFridayOfTheMonth)<7) {
                break;
            }
        }


        //task8
        int currentYear = 2022;
        int first = currentYear - 200;
        for(int j = 0; ;j+=79){
            if(j>=first) {
                System.out.println(j);
                if(j>currentYear){
                    break;
                }
            }
        }




        //task 9
        for (int j = 0; j < 10; j++) {
            System.out.println("2 * " + (j + 1) + " = " + 2 * (j + 1));
        }


    }
}