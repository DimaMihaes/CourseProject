import edu.tekwil.course.ClassInPackage;

public class NewClass {
    public static void main (String[] args) {
       ClassInPackage classInPackage=new ClassInPackage();
       ClassInPackage.test();
         for (String arg : args ){
             System.out.println(arg);
         }

    }
}
