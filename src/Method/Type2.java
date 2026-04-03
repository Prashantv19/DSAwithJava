package Method;
class Calculater
{
    int a;
    int b;
    int res;
    int add()
    {
        a =10;
        b = 20;
        res = a+b;
        return res;
    }
}
class Lunch {
    public static void main(String[] args) {
        Calculater calc = new Calculater();
        int sum = calc.add();
        System.out.println(sum);
    }
}
