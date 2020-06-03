package sort;

public class QuickSort implements Sort {
    private int[] arr;
    private int len;


    public QuickSort(int[] arr) {
        System.out.println("快速排序法");
        this.arr = arr;
        this.len = arr.length;
    }

    @Override
    public int[] sort() {
        int left = 0;
        int right = len - 1;
        quickSort(left, right);
        return arr;
    }

    public void quickSort(int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(begin, end);
            quickSort(begin, partitionIndex - 1);
            quickSort(partitionIndex + 1, end);
        }
    }

    private int partition(int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
