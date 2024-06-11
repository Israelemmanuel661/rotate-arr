package DS.ArrayRotation;

public class LeftRotation {
    public static void main(String[] args) {
        int[] a = {10, 25, 40, 55, 70};
        int d = 7;
        int[] rotatedArray = rotLeft(a, d);



        for (int num : rotatedArray) {
            System.out.print(num + " ");

        }

    }

    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] rotatedArray = new int[n];


        for (int i = 0; i < n; i++) {

            int newIndex = (i + d) % n;
            rotatedArray[i] = a[newIndex];
        }

        return rotatedArray;

    }
}

