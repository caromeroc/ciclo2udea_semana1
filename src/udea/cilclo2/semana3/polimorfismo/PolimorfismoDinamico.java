package udea.cilclo2.semana3.polimorfismo;

public class PolimorfismoDinamico {

    public static void main(String args[]) {
        X x = new X();
        Y y = new Y();
        y.m2();
        x.m1();
        y.m1();
        x = y;// parent pointing to object of child
        x.m1() ;
        //y.a=10;
    }

}

class X {

    private int a;
    int b;

    public void m1() {
        System.out.println("This is method m1 of class X");
    }
}

class Y extends X {

    int c; // new instance variable of class Y

    public void m1() {
        // overriden method
        System.out.println("This is method m1 of class YY");
    }

    public void m2() {
        super.m1();
        System.out.println("This is method m2 of class Y");
    }
}
