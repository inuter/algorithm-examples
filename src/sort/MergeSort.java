package sort;

/**
 * 归并排序实现
 * 时间复杂度 O(NlogN)，空间复杂度 O(N)，稳定
 * 基本思想是先使子序列有序，然后再合并有序的子序列
 *
 * @author inuter
 * @since 2021-05-20
 */
public class MergeSort {

    public void sort(int[] array, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) >> 1;  // (left + right) / 2
        sort(array, left, mid);
        sort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    /**
     * 合并操作
     * @param array 待排序数组
     * @param left 左边界 (inclusive)
     * @param mid  中点
     * @param right 右边界 (inclusive)
     */
    private void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            temp[k++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }
        System.arraycopy(temp, 0, array, left, temp.length);
    }
}
