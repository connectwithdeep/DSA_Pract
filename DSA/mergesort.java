import java.util.*;

public class mergesort {
    public static void merge(int[] arr, int l, int mid, int r) {
        List<Integer> ls = new ArrayList<>();
        int left = l;
        int right = mid + 1;
        while (left <= mid && right <= r) {
            if (arr[left] <= arr[right]) {
                ls.add(arr[left]);
                left++;
            } else {
                ls.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            ls.add(arr[left]);
            left++;
        }
        while (right <= r) {
            ls.add(arr[right]);
            right++;
        }
        for (int i = l; i <= r; i++) {
            arr[i] = ls.get(i - l);
        }
    }

    public static void merge_sort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;
        merge_sort(arr, l, mid);
        merge_sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        System.out.print("Enter size of array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        merge_sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
