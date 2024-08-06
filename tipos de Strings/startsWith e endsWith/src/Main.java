public class Main {
    public static void main(String[] args) {

        String var1 = "juliano sobral";
        boolean res1 = var1.startsWith("Jul");
        boolean res2 = var1.startsWith("ul", 1);
        System.out.println(res2);

        String var2 = "juliano sobral";
        boolean res3 = var1.endsWith("bral");
        boolean res4 = var1.startsWith("ul");
        System.out.println(res3);

    }



}