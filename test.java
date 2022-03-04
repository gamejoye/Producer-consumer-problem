package one;
public class test{
    public static void main(String[] args) {
        Resource r = new Resource();

        prothread t1 = new prothread(r);
        comthread t2 = new comthread(r);
        t1.start();
        t2.start();
    }
}

