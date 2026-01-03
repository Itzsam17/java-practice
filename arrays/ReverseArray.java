public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
// start points to the first index
// end points to the last index
// swap elements until both pointers meet
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
