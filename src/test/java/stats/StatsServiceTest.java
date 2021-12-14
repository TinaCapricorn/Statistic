package stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void statsSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.StatsSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void StatsAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.StatsAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void StatsMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.StatsMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void StatsMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.StatsMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void StatsMinAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.StatsMinAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void StatsMaxAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.StatsMaxAverage(sales);
        assertEquals(expected, actual);
    }
}