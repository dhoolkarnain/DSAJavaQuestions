public class J46BinarySearch {
    static int search(int[] a, int key, int l, int h) {
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
        return search(a, key, l, h);
    }

    public static void main(String[] args) {
        int[] a = { -4, -1, 3, 7, 10, 11 };
        int key = 7;

        System.out.println(key + " is present at index " + search(a, key, 0, a.length - 1));
    }
}
