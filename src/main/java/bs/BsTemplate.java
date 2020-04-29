package bs;

public class BsTemplate {

    /**
     * mid 被分在右边的情况 [left, mid - 1] 与 [mid, right]
     *
     * @param left
     * @param right
     * @param target
     * @param arr
     * @return
     */
    public int binarySearchC1(int left, int right, int target, int[] arr) {
        while (left < right) {
            // 此时需要向上取整
            int mid = left + (right - left + 1) / 2;
            if (arr[mid] < target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        if (arr[left] == target) {
            return left;
        }
        return -1;
    }

    /**
     * mid被分在左边的情况 [left, mid] 与 [mid + 1, right]
     *
     * @param left
     * @param right
     * @param target
     * @param arr
     * @return
     */
    public int binarySearchC2(int left, int right, int target, int[] arr) {
        while (left < right) {
            // 向下取整
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (arr[left] == target) {
            return left;
        }
        return -1;
    }
}
