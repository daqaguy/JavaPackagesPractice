package Package1;

import Package2.Class3;

class Class2 {


    public void method1()
    {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();
        Class3 c3 = new Class3();
    }
    public static void main(String[] args)
    {
        Class1 c4 = new Class1();
        System.out.println(c4.x);
        c4.method2_1(); /* public method from Class1 */
        c4.method2_2(); /* default method from Class1 */
        c4.method2_3(); /* protected method from Class1 */
        //c4.method2_4(); Not accessible Since it's a private method from Class1
    }
}
