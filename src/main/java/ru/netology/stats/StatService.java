package ru.netology.stats;

public class StatService {
    public float calculateAllSales(int[] sales) {
        float result = 0;
        for (int sale : sales) {
            result += sale;
        }
        return result;
    }
    public float calculateAverageSum(int[] sales) {
        int countMonth = sales.length;
        float result = calculateAllSales(sales) / countMonth;
        return result;
    }
    public int monthWithMaxSales (int[] sales) {
        int result = 1;
        int monthNumber = 1;
        int maxSale = sales[0];
        for (int sale : sales) {
            if (sale >= maxSale) {
                maxSale = sale;
                result = monthNumber;
            }
            monthNumber++;
        }
        return result;
    }
    public int monthWithMinSales (int[] sales) {
        int result = 1;
        int monthNumber = 1;
        int minSale = sales[0];
        for (int sale : sales) {
            if (sale <= minSale) {
                minSale = sale;
                result = monthNumber;
            }
            monthNumber++;
        }
        return result;
    }
    public int monthCountWithUnderAverageSales (int[] sales) {
        float averageSales = calculateAverageSum(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                monthCount++;
            }
        }
       return monthCount;
    }
    public int monthCountWithOverAverageSales (int[] sales) {
        float averageSales = calculateAverageSum(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                monthCount++;
            }
        }
        return monthCount;
    }

}
