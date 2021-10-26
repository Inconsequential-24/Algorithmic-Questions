//Multiple Inheritance
class A
{
    int a;
    double b;
    void getData(int m, double n)
    {
         a=m;
         b=n;
    }
    void putData()
    {
         System.out.println("Value of a = " + a);
         System.out.println("Value of b = " + b);
    }
}

interface B
{
    int c = 5;
    public void show();
}

class C extends A implements B
{
    double total;
    public void show()
    {
         System.out.println("Value of c = " + c);
    }
    void display()
    {
         total = a + b + c;
         putData();
         show();
         System.out.println("Total Value = " + total);
    }
}
class MultipleInheritance
{
    public static void main(String args[])
    {
         C obj = new C();
         obj.getData(10,16.5);
         obj.display();
    }
}