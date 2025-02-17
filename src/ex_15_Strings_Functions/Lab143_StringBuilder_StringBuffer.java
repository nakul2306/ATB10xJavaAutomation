package ex_15_Strings_Functions;

public class Lab143_StringBuilder_StringBuffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


        StringBuilder sb= new StringBuilder("Pramod");
        sb.append("Sharma");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        sb.append("Test");
        System.out.println(sb);

    }
}
