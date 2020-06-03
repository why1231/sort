package sort;

/**
 * 选择排序法的核心思想是：
 * 1.假定一个最小值
 * 2.依次比较数组中的值，找到最小值的下标。
 * 3.通过下标交换假定和真正最小值
 */
public class SelectSort implements Sort {

    private int[] arr;
    private int len;

    public SelectSort(int[] arr) {
        System.out.println("选择排序算法");
        this.arr = arr;
        this.len = arr.length;
    }

    @Override
    public int[] sort() {
        return selectSort();
    }

    private int[] selectSort() {
        int tmp = 0;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i; j < len - 1; j++) {
                if (arr[j + 1] < min) {
                    minIndex = j + 1;
                    min = arr[j + 1];
                }
            }
            if (min != arr[i]) {
                tmp = min;
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
        return arr;
    }
}
