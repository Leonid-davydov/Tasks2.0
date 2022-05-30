package task17;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;

public class Printer {
    private static final String separator = "------------------------------------------------------------------------------------------";

    public static void printSeparator() {
        System.out.println(separator);
    }

    public static void print(String massage, int spaces) {
        for (int i = 0; i < spaces; i++){
            System.out.print("\t");
        }
        System.out.println(massage);
    }

    public static void printAnnotations(Annotation[] annotations, int spaces) {
        for (Annotation annotation : annotations) {
            print(annotation.toString(), spaces);
        }
    }

    public static void printModifiers(int modifiers, int spaces) {
        if (Modifier.isAbstract(modifiers))
            print("Abstract", spaces);
        if (Modifier.isFinal(modifiers))
            print("Final", spaces);
        if (Modifier.isInterface(modifiers))
            print("Interface", spaces);
        if (Modifier.isNative(modifiers))
            print("Native", spaces);
        if (Modifier.isPrivate(modifiers))
            print("Private", spaces);
        if (Modifier.isProtected(modifiers))
            print("Protected", spaces);
        if (Modifier.isPublic(modifiers))
            print("Public", spaces);
        if (Modifier.isStatic(modifiers))
            print("Static", spaces);
        if (Modifier.isStrict(modifiers))
            print("Strict", spaces);
        if (Modifier.isSynchronized(modifiers))
            print("Synchronized", spaces);
        if (Modifier.isTransient(modifiers))
            print("Transient", spaces);
        if (Modifier.isVolatile(modifiers))
            print("Volatile", spaces);
    }
}
