package Method;
class Calculator
{
    int a;
    int b;
    int res;
    void add()
    {
        a =10;
        b = 20;
        res = a+b;
        System.out.println(res);
    }
}
class Launch {
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        calc.add();
    }
}
