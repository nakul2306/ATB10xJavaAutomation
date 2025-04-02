package Programs;

public class ReversString {
    public static void main(String[] args) {
        String s = "Java";
        for (int i =s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));
        }
    }
}

//
// public class ReversString {
//    public static void main(String[] args) {
//        String s = "Java";
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        System.out.println(sb)
//
//    }
//}