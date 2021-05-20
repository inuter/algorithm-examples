package sort;

/**
 * 冒泡排序实现
 * 时间复杂度 O(N^2)，空间复杂度 O(1)，稳定的
 *
 * @author inuter
 * @since 2021-05-20
 */
public class BubbleSort {

    public int[] sort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {     // 要 len - 1 轮
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {  // 比较相邻两个元素，如果前者大于后者，则交换
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
