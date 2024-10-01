import java.util.Arrays;

public class L786_KthSamallestPrimeFraction {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double left = 0, right = 1, mid;
        int[] res = new int[2];

        while (left <= right) {
            mid = left + (right - left) / 2;
            int j = 1, total = 0, num = 0, den = 0;
            double maxFrac = 0;
            for (int i = 0; i < n; ++i) {
                while (j < n && arr[i] > arr[j] * mid) {
                    ++j;
                }

                total += n - j;

                if (j < n && maxFrac < arr[i] * 1.0 / arr[j]) {
                    maxFrac = arr[i] * 1.0 / arr[j];
                    num = i;
                    den = j;
                }
            }

            if (total == k) {
                res[0] = arr[num];
                res[1] = arr[den];
                break;
            }

            if (total > k) {
                right = mid;
            } else {
                left = mid;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        L786_KthSamallestPrimeFraction test = new L786_KthSamallestPrimeFraction();

        int[] arr1 = {1, 2, 3, 5};
        int k1 = 3;
        int[] result1 = test.kthSmallestPrimeFraction(arr1, k1);
        System.out.println(Arrays.toString(result1));  // Expected output: [2, 5]

        int[] arr2 = {1, 7, 13, 19};
        int k2 = 2;
        int[] result2 = test.kthSmallestPrimeFraction(arr2, k2);
        System.out.println(Arrays.toString(result2));  // Expected output: [7, 19]

        int[] arr3 = {1, 7};
        int k3 = 1;
        int[] result3 = test.kthSmallestPrimeFraction(arr3, k3);
        System.out.println(Arrays.toString(result3)); // Expected output might depend on method specific behavior
    }
}
