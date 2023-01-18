public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        return getSymmetricNumber(x) == x;
    }

    public int getSymmetricNumber(int initialNumber) {
        int symmetricNumber = 0;
        while (initialNumber > 0) {
            int i = initialNumber % 10;
            symmetricNumber = symmetricNumber * 10 + i;
            initialNumber /= 10;
        }
        return symmetricNumber;
    }
}
