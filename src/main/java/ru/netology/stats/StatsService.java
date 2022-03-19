package ru.netology.stats;

public class StatsService {

    public int sumOfAllSales(int[] salesByMonth) {
        int sum = 0;
        for (int i : salesByMonth) {
            sum += i;
        }
        return sum;
    }

    public int averageSalesAmount(int[] salesByMonth) {
        return sumOfAllSales(salesByMonth) / salesByMonth.length;
    }

    public int peakSales(int[] salesByMonth) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : salesByMonth) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= salesByMonth[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int minSales(int[] salesByMonth) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : salesByMonth) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= salesByMonth[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowTheAverage(int[] salesByMonth) {
        int number = 0;
        for (int sale : salesByMonth) {
            if (sale < averageSalesAmount(salesByMonth)) {
                number = number + 1;
            }
        }
        return number;
    }

    public int aboveTheAverage(int[] salesByMonth) {
        int number = 0;
        for (int sale : salesByMonth) {
            if (sale > averageSalesAmount(salesByMonth)) {
                number = number + 1;
            }
        }
        return number;
    }
}
