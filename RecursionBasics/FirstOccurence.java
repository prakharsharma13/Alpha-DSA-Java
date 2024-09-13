package RecursionBasics;

public class FirstOccurence {
    public static int firstOccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 5, 8 };
        System.out.println(firstOccur(arr, 5, 0));
    }
}
