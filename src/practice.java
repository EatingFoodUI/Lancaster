/*public class practice {
    public String name;
    public int count;

    public practice(String name , int count)
    {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        practice tc = new practice("疯狂Java讲义" , 90000);

        System.out.println(tc.name);
        System.out.println(tc.count);
    }
}*/                   //p138

/*public class practice
{
    public String name;
    public int count;

    public practice()
    {

    }

    public practice(String name , int count)
    {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        practice oct1 = new practice();
        practice oct2 = new practice("轻量级Java"  ,300000);

        System.out.println(oct1.name + " " + oct1.count );
        System.out.println(oct2.name + " " + oct2.count );
    }
}*/                          //p139

/*public class practice
{
   public String name;
   public String color;
   public double weight;
   public practice()
   {

   }

   public practice(String name , String color)
   {
       this.name = name;
       this.color = color;
   }

   public practice(String name , String color , double weight)
   {
       this(name, color);
       this.weight = weight;
   }
}*/                          //p140

/*class Baseclass
{
    public int a = 5;
}
public class practice extends Baseclass
{
    public int a = 7;
    public  void  accessOwner()
    {
        System.out.println(a);
    }
    public void accessBase()
    {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        practice sc = new practice();
        sc.accessOwner();
        sc.accessBase();
    }
}*/                             //p144

/*class Craeture
{
    public Craeture()
    {
        System.out.println("Creature无参数的构造器");
    }
}
class Animal extends Craeture
{
    public Animal(String name)
    {
        System.out.println("Animal带一个参数的构造器，" + "该动物的name为" + name);
    }
    public Animal(String name , int age)
    {
        this(name);
        System.out.println("Animal带有两个参数的构造器，" + "其age为" + age);
    }
}
public class practice extends Animal
{
    public practice()
    {
        super("灰太狼",3);
        System.out.println("practice无参数的构造器");
    }

    public static void main(String[] args) {
        new practice();
    }
}*/

/*class Baseclass
{
    public int book = 6;
    public void base()
    {
        System.out.println("父类的普通方法");
    }
    public void test()
    {
        System.out.println("父类的被覆盖的方法");
    }
}
public class practice extends Baseclass
{
    public String book = "轻量级Java EE企业应用实战";
    public void test()
    {
        System.out.println("子类覆盖父类的方法");
    }
    public  void sub()
    {
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
       /* Baseclass bc = new Baseclass();
        System.out.println(bc.book);
        bc.base();
        bc.test();

        practice sc = new practice();
        System.out.println(sc.book);
        sc.base();
        sc.test();

        Baseclass ploymophicBc = new practice();
        System.out.println(ploymophicBc.book);
        ploymophicBc.base();
        ploymophicBc.test();
    }
}*/                                 //p148

/*public class practice
{
    public static void main(String[] args) {
        double d = 3.14;
        long l = (long)d;
        System.out.println(l);

        int in = 5;
        Object obj = "Hello";
        String object = (String)obj;
        System.out.println(object);

        Object objPri = new Integer(5);
        if (objPri instanceof String)
        {
            String str = (String) objPri;
        }
    }
}*/

/*public class practice
{
    public static void main(String[] args) {
        Object hello = "Hello";
        System.out.println("字符串类型是否是obj类的实例： "
        + (hello instanceof Object));
        System.out.println("字符串是否为comparable接口的实例： "
        + (hello instanceof Comparable));
    }
}*/

/*public class practice
{
    {
        int a = 6;
        if (a > 4)
        {
            System.out.println("初始化块：局部变量a的值大于4");
        }
            System.out.println("初始化块");
    }
    {
        System.out.println("第二个初始化块");
    }
    public practice()
    {
        System.out.println("无参数的构造器");
    }

    public static void main(String[] args) {
        new practice();
    }
}*/

/*class Root
{
    static {
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }
    public Root()
    {
        System.out.println("Root的无参数的构造器");
    }
}
class Mid extends Root
{
    static {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println();
    }
}*/                    //未完+++++++++++++++++ p159

/*public class practice
{
    public static void main(String[] args) {
        boolean bl = true;
        Boolean blObj = new Boolean(bl);

        int it = 5;
        Integer itObj = new Integer(it);

        float f1 = new Float("4.56");

        Boolean bObj = new Boolean("flase");

        boolean bb = bObj.booleanValue();
        int i = itObj.intValue();
    }
}*/                 //163

/*public class practice
{
    public static void main(String[] args) {
        Integer inObj = 5;
        Object boolObj = true;
        int it = inObj;
        if (boolObj instanceof Boolean)
        {
            boolean b = (Boolean)boolObj;
            System.out.println(b);
        }
    }
}*/                    //164

/*class Apple
{
    private String color;
    private double weight;
    public Apple(String color , double weight)
    {
        this.color = color;
        this.weight = weight;
    }

    public String toString()  //重写了自我描述的话
    {
        return  "一个苹果，颜色是： " + color
                + ", 重量是：" + weight;
    }

}
public class practice
{
    public static void main(String[] args)
    {
        Apple a = new Apple("红色", 5.68);
        System.out.println(a);
    }
}*/                         //168

/*class Person
{
    public boolean equals(Object obj)
    {
        return true;
    }

}
class Dog{}
public class practice
{
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Person对象是否equals Dog对象？"
            + p.equals(new Dog()));
        System.out.println("Person对象是否equa String对象？" +
            + p.equals(new String("Hello")));
    }
}*/                                 //有问题p170

/*import java.util.HashSet;

public class practice
{
    public static void main(String[] args) {
        practice books = new Hashpractice();
        books.add(new String("疯狂Java讲义"));
        boolean result = books.add(new String("疯狂Java讲义"));
        System.out.println(result + "-->" + books);
    }
}*/                           //出错p281

/*class A
{
    public boolean equals(Object obj)
    {
        return ture;
    }
}
class B
{
    public int hashcode()
    {
        return 1;
    }
}
class C
{
    public int hashcode()
    {
        return 2;
    }
    public boolean equals(Object obj)
    {
        return true;
    }
}
public class  practice
{
    public static void main(String[] args) {
        practice books = new practice();
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }
}*/                 //有问题 p282

/*interface interfaceA
{
    int PROP_A = 5;
    Void testA();
}
interface interfaceB
{
    int PROP_B = 6;
    Void testB();
}
interface interfaceC extends interfaceA,interfaceB
{
    int PROP_C = 7;
    void testC();
}
public class practice
{
    public static void main(String[] args) {
        System.out.println(interfaceC.PROP_A);
        System.out.println(interfaceC.PROP_B);
        System.out.println(interfaceC.PROP_C);
    }
}*/                        //p192

