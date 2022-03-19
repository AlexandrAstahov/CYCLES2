package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSumOfAllSales() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumOfAllSales(salesByMonth);
        assertEquals(expected, actual);

    }

    @Test
    void shouldAverageSalesAmount() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSalesAmount(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldPeakSales() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.peakSales(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldBelowTheAverage() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowTheAverage(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAboveTheAverage() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveTheAverage(salesByMonth);
        assertEquals(expected, actual);
    }
}