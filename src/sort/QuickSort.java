package sort;

/**
 * 快速排序实现
 * 时间复杂度 O(NlogN)，空间复杂度 O(1)，不稳定
 * 如 1 3 0 5 3，选最后一个元素为 pivot，第一轮后变为 1 0 3 5 3，其中 3 已经变换了位置
 *
 * @author inuter
 * @since 2021-05-20
 */
public class QuickSort {

    public void sort(int[] array, int begin, int end) {
        if (begin >= end) return;
        int pivot = partition(array, begin, end);
        sort(array, begin, pivot - 1);
        sort(array, pivot + 1, end);
    }

    /**
     * 设定一个分界值，通过该分界值将数组分成左右两部分，
     * 小于分界值的元素集中到数组的左边，大于或等于分界值的数据集中到数组右边。
     *
     * @param array 待排序数组
     * @param begin 起始下标 (inclusive)
     * @param end   结束下标 (inclusive)
     * @return pivot 的位置
     */
    private int partition(int[] array, int begin, int end) {
        // pivot: 分界值
        int pivot = array[end];
        int i = begin;
        for (int j = begin; j < end; j++) {
            if (array[j] < pivot) {
                swap(array, i , j);
                i++;
            }
        }
        swap(array, i, end);
        return i;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
