package sort;

/**
 * 选择排序实现
 * 时间复杂度 O(N^2)，空间复杂度 O(1)，不稳定
 *
 * 稳定性分析：
 *     假设现有数组 [5 8 5 2 9]，在第一轮比较时，第 1 个 5 会和 2 进行交换，破坏了稳定性
 *
 * @author inuter
 * @since 2021-05-20
 */
public class SelectionSort {

    /**
     * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
     * 然后再从剩余未排序元素中继续寻找最小（大）元素，放到已排序序列的末尾。
     * 以此类推，直到所有元素均排序完毕.
     *
     * @param array 乱序数组
     * @return 升序数组
     */
    public int[] sort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            int minIndex = i;
            for (int j = i; j < len; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
}
