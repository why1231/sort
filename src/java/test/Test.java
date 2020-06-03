package test;

import sort.MergeSort;
import utils.PrintCostTimeUtils;

public class Test {
    public static void main(String[] args) {
        int[] tmp = {9, 8, 7, 6, 5, 4, 3, 2, 1, 5};
        int num = 100000000;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * num);
        }
        //冒泡排序算法
//        BubbleSort bubbleSort = new BubbleSort(arr);
//        PrintCostTimeUtils.printCostTimeMs(bubbleSort);

        //选择排序算法
//        SelectSort selectSort = new SelectSort(arr);
//        PrintCostTimeUtils.printCostTimeMs(selectSort);

        //插入排序算法
//        InsertSort insertSort = new InsertSort(arr);
//        PrintCostTimeUtils.printCostTimeMs(insertSort);
//        System.out.println(Arrays.toString(insertSort.sort()));


        //交换式shell排序算法
//        SwapShellSort swapShellSort = new SwapShellSort(arr);
//        PrintCostTimeUtils.printCostTimeMs(swapShellSort);
//        System.out.println(Arrays.toString(swapShellSort.sort()));

        //移位式shell排序算法
//        ShellSort shellSort = new ShellSort(arr);
//        PrintCostTimeUtils.printCostTimeMs(shellSort);
//        System.out.println(Arrays.toString(shellSort.sort()));

        //快速排序算法
//        QuickSort quickSort = new QuickSort(arr);
//        PrintCostTimeUtils.printCostTimeMs(quickSort);
//        System.out.println(Arrays.toString(quickSort.sort()));

        //归并排序算法
        MergeSort mergeSort = new MergeSort(arr);
        PrintCostTimeUtils.printCostTimeMs(mergeSort);
//        System.out.println(Arrays.toString(mergeSort.sort()));
    }


}
