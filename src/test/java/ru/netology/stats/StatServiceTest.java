package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    void shouldCalculateAllSales() {
        StatService service = new StatService();
        float actual = service.calculateAllSales(sales);
        float expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void souldCalculateAverageSum() {
        StatService service = new StatService();
        float actual = service.calculateAverageSum(sales);
        float expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthWithMaxSales() {
        StatService service = new StatService();
        int actual = service.monthWithMaxSales(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthWithMinSales() {
        StatService service = new StatService();
        int actual = service.monthWithMinSales(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthCountWithUnderAverageSales() {
        StatService service = new StatService();
        int actual = service.monthCountWithUnderAverageSales(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void monthCountWithOverAverageSales() {
        StatService service = new StatService();
        int actual = service.monthCountWithOverAverageSales(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}