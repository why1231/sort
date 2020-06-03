package sort;

public class BubbleSort implements Sort {
    private int[] arr;
    private int len;

    public BubbleSort(int[] arr) {
        System.out.println("冒泡排序算法");
        this.arr = arr;
        this.len = arr.length;
    }

    @Override
    public int[] sort() {
        return bubbleSort();
    }

    private int[] bubbleSort() {
        int tmp;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
