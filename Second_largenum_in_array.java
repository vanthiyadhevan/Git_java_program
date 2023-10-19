public class Second_largenum_in_array {
    public static void main (String[] args) {
        int[] arr = {7,4,9,8,5};
        int temp = arr[0];
        int second_max = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(temp < arr[i] || temp == arr[i] ) {
                second_max = arr[i];
            }
        }
        System.out.println(second_max);
    }
}