public class Gen<T, V> {
    T ob;
    V ob1;

    public Gen(T ob, V ob1) {
        this.ob = ob;
        this.ob1 = ob1;
    }

    public T getOb() {
        return ob;
    }

    public V getOb1() {
        return ob1;
    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
        System.out.println("Type of V is " + ob1.getClass().getName());
    }
}
