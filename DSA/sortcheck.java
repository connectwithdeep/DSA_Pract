public class sortcheck {
    public static void isSorted(int n, int[] a) {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]) {
                System.out.println("Sorted");
                return; 
            }
        }
        System.out.println("Not Sorted");
    }

    public static void main(String[] args) {
        int[] tv = {1, 2, 4, 57, 6, 8};   
        isSorted(tv.length, tv);
    }
}
