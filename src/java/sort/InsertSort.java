package sort;

public class InsertSort implements Sort {
    private int[] arr;
    private int len;

    public InsertSort(int[] arr) {
        System.out.println("插入排序算法");
        this.arr = arr;
        this.len = arr.length;
    }

    @Override
    public int[] sort() {
        return insertSort();
    }

    private int[] insertSort() {
        for (int i = 1; i < len; i++) {
            int insertValue = arr[i];
            int preIndex = i - 1;
            while (preIndex >= 0 && insertValue < arr[preIndex]) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = insertValue;
        }
        return arr;
    }

}
