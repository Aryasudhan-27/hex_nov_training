public class Bubsort {
    public static void main(String[] args) {
        int[] a = {42, 17, 35, 8, 36};
        int n = a.length;
        for (int p = 1; p < n; p++) {
            boolean swap = false;

            for (int i = 0; i < n - p; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swap = true;
                }
            }
            System.out.println("Pass " + p + ": " + Arrays.toString(a));

            if (!swap) {
                break;
            }
        }
    }
}
