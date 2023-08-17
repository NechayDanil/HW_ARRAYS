package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSale += sales[i];

        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMax(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;

            }
        }
        return monthMaxSale + 1;
    }

    public int monthMin(long[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;

            }
        }
        return monthMinSale + 1;

    }

    public int monthBelAverage(long[] sales) {
        int belowAverage = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                belowAverage++;
            }
        }
        return belowAverage;
    }
    public int monthAboveAverage(long[] sales) {
        int aboveAverage = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

}

