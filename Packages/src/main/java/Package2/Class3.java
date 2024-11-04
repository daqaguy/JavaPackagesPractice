package Package2;

import Package1.Class1;
//import Package1.Class2;

public class Class3 {

    public void method11()
    {
        Class1 c1 = new Class1();
        //Class2 c2 = new Class2();
        Class3 c3 = new Class3();
    }

    public static void main(String[] args)
    {
        Class1 c4 = new Class1();
        System.out.println(c4.x);
        c4.method2_1();
        //c4.method2_3(); Since it's a protected modifier from class1
        //c4.method2_2(); Since it's default access modifier from class1
        //c4.method2_4(); Not accessible Since it's a private method from Class1
    }
}
