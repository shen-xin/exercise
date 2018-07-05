package reflection;

import java.lang.reflect.*;
import java.util.*;

public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        if (args.length > 0)
            name = args[0];
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g: java.util.Date");
            name = in.next();
        }
        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.print("class " +name);
            if (supercl != null && supercl != Object.class)
                System.out.print("extends " + supercl.getName());
            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.exit(0);
    }

    private static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c :
                constructors) {
            String name = c.getName();
            System.out.println("  ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0)
                System.out.println(modifiers + " ");
            System.out.println(name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0)
                    System.out.print(",");
                System.out.println(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    private static void printMethods(Class cl) {
        Method[] methods = cl.getMethods();
        for (Method m :
                methods) {
            Class retType = m.getReturnType();
            String name = m.getName();
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0)
                System.out.println(modifiers + " ");
            System.out.println(retType.getName() +" "+name + "(");

            Class[] paramTypes = m.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0)
                    System.out.print(",");
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    private static void printFields(Class cl) {
        Field[] fields =cl.getDeclaredFields();

        for (Field f :
                fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.println("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.println(type.getName() +" " + name + ";");
        }
    }
}

