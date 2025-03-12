package ex_25_Genrics;

public class Lab225 {
    public static void main(String[] args) {
        temp(23, 45);
        temp("Pramod", "Dutta");
        temp(true, false);

    }

    public static <T> T temp(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return  null;
    }
}

// T Can be any data type