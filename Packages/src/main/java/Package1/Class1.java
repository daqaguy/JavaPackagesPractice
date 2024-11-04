package Package1;

import Package2.Class3;

public class Class1 {

    public int x =9;
    public void method1()
    {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();
        Class3 c3 = new Class3();
    }
    public void method2_1()
    {
        System.out.println("I am in Method2_1");
    }
    void method2_2()
    {
        System.out.println("I am in Method2_2");
    }
    protected void method2_3()
    {
        System.out.println("I am in Method2_3");
    }
    private void method2_4()
    {
        System.out.println("I am in Method2_4");
    }

    public static void main(String[] args)
    {
        Class1 a1 = new Class1();
        System.out.println(a1.x);
        a1.method2_1(); /* public method */
        a1.method2_2(); /* default method */
        a1.method2_3(); /* protected method */
        a1.method2_4(); /* private method */
    }
}
