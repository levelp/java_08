
package javareflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


@MyAnnotation(comment = "class", value = true)
public class JavaReflection {

    @MyAnnotation(comment = "var")
    private int var;

    @MyAnnotation(comment = "foo")
    public void foo() {
        // do nothing
    }

    public int boo() {
        return 5;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Method[] allMethods = JavaReflection.class.getMethods();

        for (Method method : allMethods) {
            System.out.println("method = " + method.getName());
        }

        System.out.println("\n====\n");

        Method[] declaredMethods = JavaReflection.class.getDeclaredMethods();

        for (Method method : declaredMethods) {
            System.out.println("Declared method = " + method.getName());
        }

        System.out.println("\n====\n");

        for (Method method : declaredMethods) {
            // if method is annotated with @Test
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                Annotation annotation = method.getAnnotation(MyAnnotation.class);
                MyAnnotation myAnnot = (MyAnnotation) annotation;
                System.out.println("Annotated with " + myAnnot.comment());
            }
        }
    }
}
