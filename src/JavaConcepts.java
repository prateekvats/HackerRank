
public class JavaConcepts {
    static int i=0;
    static {System.out.println("Executed:"+i++);}
    JavaConcepts (){System.out.println(i);}
    public static void main(String args[]){
        JavaConcepts j=new JavaConcepts();
        j=new JavaConcepts();
        j=new JavaConcepts();

    }
}
