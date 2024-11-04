package Package2;

import Package1.Class1;

public class SubClass2 extends Class1 {

    public static void main(String[] args)
    {
        Class1 c4 = new Class1();
        System.out.println(c4.x);
        c4.method2_1();
        //c4.method2_3(); Not accessible Since it's a protected modifier from class1
        //c4.method2_2(); Not accessible Since it's default access modifier from class1
        //c4.method2_4(); Not accessible Since it's a private method from Class1
    }
}
