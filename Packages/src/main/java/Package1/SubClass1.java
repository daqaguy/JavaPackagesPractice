package Package1;

public class SubClass1 extends Class1
{
    public void method5()
    {
        System.out.println(x);
        method2_1(); /* public method from Class1 */
        method2_2(); /* default method from Class1 */
        method2_3(); /* private method from Class1 */
        //method2_4(); /* Not accessible Since it's a private method from Class1 - even with instance */

    }
}
