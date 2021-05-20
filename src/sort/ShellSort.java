package sort;

/**
 * 希尔排序 - 对插入排序的改进，但没有快速排序快
 * 时间复杂度 O(n^(1.3—2))，最坏情况为 O(n^2)，最好情况为 O(n)，空间复杂度 O(1), 不稳定
 *
 * @author inuter
 * @since 2021-05-20
 */
public class ShellSort {

    public void sort(int[] array) {
        int len = array.length;
        for (int gap = len / 2; gap > 0; gap /= 2) {
            // 对于 array[0...gap-1] 来说，它们都是个分组的第一个元素，所以可以直接从 gap 处开始
            for (int i = gap; i < len; i++) {
                int temp = array[i];
                int j;
                // 此处有点类似插入排序，array[... j-gap, j]，将最小值插入目标位置
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }
}
