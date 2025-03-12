package ex_24_Exceptions;

public class Lab221_CustomException {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 123);

       // int result = sbi.add(icici);
       // System.out.println(result);

        Bank jp_Morgan = new Bank ("USD", 101);
        int result2 = sbi.add(jp_Morgan);
        System.out.println(result2);


    }

}
