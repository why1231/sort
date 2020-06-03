package utils;

import sort.Sort;

public class PrintCostTimeUtils {

    public static long printCostTimeMs(Sort sort) {
        long before = System.currentTimeMillis();
        sort.sort();
        long after = System.currentTimeMillis();
        System.out.println("耗时：" + ((after - before) / 1000) + "秒");
        return (after - before) / 1000;
    }
}
