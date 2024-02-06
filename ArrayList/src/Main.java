import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("AB");
        al.add("CD");
        al.add("EF");
        al.add("GH");
        al.add("IJ");
        al.add("KL");
        al.add("MN");

        System.out.println("AB" + al.indexOf("AB"));
        System.out.println("AB" + al.indexOf("KL"));
        System.out.println("AB" + al.indexOf("AA"));
        System.out.println("AB" + al.indexOf("EF"));
    }
}