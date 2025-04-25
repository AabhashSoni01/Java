public class ArrayQue23 {

    public static void main(String[] args) {
        
        // mutable & immutable strings

        // mutable
        String str1 = "hello";
        System.out.println(str1);

        // immutable
        StringBuilder str2 =  new StringBuilder(10);
        str2.append("hello hiiii byeee");
        System.out.println(str2.length()); // 
        System.out.println(str2.capacity()); // capacity will be updated to (2 * 10 ) + 2 = 22
        System.out.println(str2);
    }
}