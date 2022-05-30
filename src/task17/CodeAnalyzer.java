package task17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import static task17.Printer.*;

public class CodeAnalyzer {
    public static void analyzeClass(Object o) {
        Class oclass = o.getClass();

        System.out.println(oclass.getName());
        printSeparator();

        System.out.println(oclass.getClassLoader());
        printSeparator();

        analyzeInterfaces(oclass);
        printSeparator();

        analyzeInheritance(oclass);
        printSeparator();

        analyzeFields(oclass);
        printSeparator();

        analyzeConstructors(oclass);
        printSeparator();

        analyzeMethods(oclass);
        printSeparator();

        printAnnotations(oclass.getAnnotations(), 0);
    }

    private static void analyzeInterfaces(Class oclass) {
        Class[] interfaces = oclass.getInterfaces();

        for (Class oInterface : interfaces) {
            System.out.println(oInterface);

            Method[] methods = oInterface.getMethods();

            for (Method method : methods) {
                print(method.toString(), 1);
            }
            System.out.println();
        }
    }

    private static void analyzeInheritance(Class oclass) {
        Class superclass = oclass.getSuperclass();

        while (superclass != null) {
            System.out.println(superclass);
            superclass = superclass.getSuperclass();
        }
    }

    private static void analyzeFields(Class oclass) {
        Field[] fields = oclass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field);
            printAnnotations(field.getAnnotations(), 1);
            System.out.println();
        }
    }

    private static void analyzeConstructors(Class oclass) {
        Constructor[] constructors = oclass.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            printModifiers(constructor.getModifiers(), 1);

            Class[] parametersForModif = constructor.getParameterTypes();
            Parameter[] parameters = constructor.getParameters();

            for (int i = 0; i < parameters.length; i++){
                printModifiers(parametersForModif[i].getModifiers(), 2);
                print(parameters[i].getType().toString(), 2);
                printAnnotations(parameters[i].getAnnotations(), 2);

                if (i < parameters.length - 1)
                    System.out.println();
            }

            printAnnotations(constructor.getAnnotations(), 1);
            System.out.println();
        }
    }

    private static void analyzeMethods(Class oclass) {
        Method[] methods = oclass.getDeclaredMethods();

        for (Method method : methods) {
            printModifiers(method.getModifiers(), 1);
            print(method.getReturnType().toString(), 1);
            print(method.getName(), 1);

            Class[] parametersForModif = method.getParameterTypes();
            Parameter[] parameters = method.getParameters();

            for (int i = 0; i < parameters.length; i++){
                printModifiers(parametersForModif[i].getModifiers(), 2);
                print(parameters[i].getType().toString(), 2);
                printAnnotations(parameters[i].getAnnotations(), 2);

                if (i < parameters.length - 1)
                    System.out.println();
            }

            printAnnotations(method.getAnnotations(), 1);
            System.out.println();
        }
    }
}


