package sort.shell;

import sort.Sort;

public class ShellSort implements Sort {
    private int[] arr;
    private int len;

    public ShellSort(int[] arr) {
        this.arr = arr;
        this.len = arr.length;
    }

    @Override
    public int[] sort() {
        return shellSort();
    }

    private int[] shellSort() {
        for (int gap = len / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < len; i++) {
                int j = i;
                int tmp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && tmp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
