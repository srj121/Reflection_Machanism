package demo1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionClass {
    public static void main(String[] args) throws Exception {
        A a = new A("Suraj", 18);

        Field[] AFeilds = a.getClass().getDeclaredFields();

        for (Field field : AFeilds) {
            //it is iterating and printing the variables in the calss

            if (field.getName().equals("name")) {
                field.setAccessible(true);// here we are making it as accessible
                field.set(a, "rahul");
                //here cahnging the private final variable
            }

        }


        Method[] AMethods = a.getClass().getDeclaredMethods();

        for (Method Methods : AMethods) {
            //it is iterating and printing the variables in the calss

            if (Methods.getName().equals("StaticMethod")) {
                Methods.setAccessible(true);// here we are making it as accessible
                Methods.invoke(null);//no need of class beacuse it is static
            }

            if (Methods.getName().equals("helloPrivate")) {
                Methods.setAccessible(true);// here we are making it as accessible
                Methods.invoke(a);
                //we can invoke a private method
            }
        }

    }
}



