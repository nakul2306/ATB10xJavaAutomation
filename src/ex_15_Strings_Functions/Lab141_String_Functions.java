package ex_15_Strings_Functions;

import java.sql.SQLOutput;

public class Lab141_String_Functions {
    public static void main(String[] args) {
        String name ="Sonal";
        System.out.println(name.length());

        //1.CharAt()
        System.out.println(name.charAt(3));
       // System.out.println(name.charAt(10)); //StringIndexOutOfBoundsException

        //2.concat()
        System.out.println(name.concat("patel"));

        //3. contains()
        System.out.println(name.contains("nal"));
        System.out.println(name.contains("du"));

        //4.equals()
        System.out.println(name.equals("Sonal"));

        //5.equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));

        //6.indexOf
        System.out.println(name.indexOf("o"));

        //replace()
        System.out.println(name.replace('n', 'N'));

        //split()

        String name4 = "pramod&live.com&123";
        String[] split= name4.split("&");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //10.subSsring()
        System.out.println(name.substring(1,3));

        //11.toLowerCase
        System.out.println(name.toLowerCase());

        //12.toUpperCase
        System.out.println(name.toUpperCase());

        //13.startsWith

        System.out.println(name.startsWith("s"));
        System.out.println(name.startsWith("S"));

        //14.trim()
        //15.compareTo()
        //16.compareToIgnoreCase()



        // 3.red way to create a string

        StringBuilder stringbuilder = new StringBuilder("sonal");
        stringbuilder.append("Patel");
        System.out.println(stringbuilder);

        StringBuilder sb = new StringBuilder("Hi");
        sb.append((" Its my world !"));
        System.out.println(sb.toString());


    }

}
