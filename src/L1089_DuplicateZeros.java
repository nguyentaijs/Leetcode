public class L1089_DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                insertAt(arr, 0, i);
                i++;
            }
        }
    }

    private void insertAt(int[] arr, int insertValue, int insertIndex) {
        for(int i = arr.length - 2; i >= insertIndex; i--) {
            arr[i+1] = arr[i];
        }
    }
}
