package demo1;

public class A {

    private final String name ;
    int age ;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private void helloPrivate (){
        System.out.println("This is hello private method");

        System.out.println("name:" + name);
    }
    private static void StaticMethod(){
        System.out.println("This is static method");
    }

     void hello(){
        System.out.println("This is hello private method");

        System.out.println("name:" + name);
    }
}
