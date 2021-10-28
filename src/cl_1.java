public class cl_1 {
    public static void main(String[] args) {
        System.out.println(doThree(5, 2));
    }
        static boolean doThree(int a, int b) {
            int sum = a + b;
            if (sum > 10 && sum < 20) return true;
            else return false;
        }

}
