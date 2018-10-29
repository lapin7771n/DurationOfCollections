public class A {
    public static void main(String[] args) {
        Gen<Integer, String> ob;
        ob = new Gen<>(88, "Generics");
        ob.showType();

        int v = ob.getOb();
        System.out.println("v = " + v);



        String str = ob.getOb1();
        System.out.println("str = " + str);
    }
}
