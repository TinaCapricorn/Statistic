package stats;

public class StatsService {
    public int StatsSum(int[] sales){
        int sum = 0;
        for(int sale : sales){
            sum += sale;
        }
        return sum;
    }

    public int StatsAverage(int[] sales){
        return StatsSum(sales) / sales.length;
    }

    public int StatsMaxSales(int[] sales){
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int StatsMinSales(int[] sales){
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int StatsMinAverage(int[] sales){
        int months = 0;
        for (int sale : sales){
            if (sale < StatsAverage(sales)){
                months = months +1;
            }
        }
        return months;
    }

    public int StatsMaxAverage(int[] sales){
        int months = 0;
        for (int sale : sales){
            if (sale > StatsAverage(sales)){
                months = months +1;
            }
        }
        return months;
    }
}
