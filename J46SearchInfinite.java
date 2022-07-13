public class J46SearchInfinite {
    static int binarySearch(int[] a, int key, int l, int h) {
        if (l > h)
            return -1;
        int mid = (l + h) / 2;
        if (a[mid] == key) {
            return mid;
        }
        if (key > a[mid])
            l = mid + 1;
        if (key < a[mid])
            h = mid - 1;
        return binarySearch(a, key, l, h);
    }

    static int searchInfinite(int a[], int key) {
        int low = 0;
        int high = 1;
        while (a[high] < key) {
            low = high;
            high = 2 * high;
        }
        return binarySearch(a, key, low, high);
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        int key = 67;
        searchInfinite(a, key);
    }
}
