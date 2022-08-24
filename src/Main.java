public class Main {

    public static void main(String[] args) {
        int[] arr = {14, 16, 19, 32, 32, 32, 56, 69, 72};
        int a = result(arr, 32);
        int b = result(arr, 60);
        System.out.println("Ответ, если размер книги 32 - " + a);
        System.out.println("Ответ, если размер книги 60 - " + b);
    }

    public static int result(int[] arr, int book) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;
            if (arr[middle] <= book) {
                left = middle + 1;
            } else {
                right = middle;

            }
            if (arr[right] == book) return 0;
        }
        return arr.length - left;
    }
}
