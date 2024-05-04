class RecursionEx{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = arraySum(array, array.length - 1);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int arraySum(int[] array, int index) {
        if (index < 0) {
            return 0;
        }
        return array[index] + arraySum(array, index - 1);
    }
}

