public class ExceptionHandling3 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        try {
            System.out.println(array[6]);
        } catch (Exception e) {
            System.out.println("Exception occured : " + e);
        }
        System.out.println("End of program !!");
    }
}
