package sort.shell;

import sort.Sort;

public class SwapShellSort implements Sort {
    private int[] arr;
    private int len;

    public SwapShellSort(int[] arr) {
        System.out.println("交换shell排序算法");
        this.arr = arr;
        this.len = arr.length;
    }

    @Override
    public int[] sort() {
        return swapShellSort();
    }

    private int[] swapShellSort() {
        int tmp = 0;
        for (int gap = len / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < len; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        tmp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = tmp;
                    }
                }
            }
        }
        return arr;
    }
}
