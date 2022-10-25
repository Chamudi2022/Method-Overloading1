public class Numbers {

    static void text(String d) {
        d = "12345";
        System.out.println(d);

    }

    static void text(String a, String b) {
        a = "123";
        b = "abc";
        System.out.println("123 "+  "and " + "abc ");
    }

    static void text(int s,String l) {
       s = 54;
       l = "abcd";
      System.out.println(54 + "abcd");

    }

    static void text(double g) {
        g = 3.89;
        System.out.println(g);
    }

    public static void main(String[] args) {
        text(" ");
        text("  "  ,"  ");
        text(54," ");
        text(3.89);

    }
}

