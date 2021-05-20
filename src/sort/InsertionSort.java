package sort;

/**
 * 插入排序实现
 * 时间复杂度 O(N^2)，空间复杂度 O(1)，稳定的
 * 基本思想是将一个记录插入到已经排好序的有序序列中
 *
 * @author inuter
 * @since 2021-05-20
 */
public class InsertionSort {

    public int[] sort(int[] array) {
        int len = array.length;
        for (int i = 1; i < len; i++) {
            int j = i - 1;
            int current = array[i];     // array[0 ... i-1] 已经有序
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }
}
