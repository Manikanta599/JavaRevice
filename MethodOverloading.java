//BY CHANGING NUMBER OF ARGUEMNTS
//BY CHANGING THE DATA TYPE

/**
 * MethodOverloading
 */
/* public class MethodOverloading { 

    static int add(int a,int b)
    {
        return a+b;
    }

    static int add(int a,int b,int c)
    {
        return a+b+c;
    }


    public static void main(String[] args) {
        add(2, 4);
        add(4, 5,6);
    }
}
    */

/**
 * MethodOverloading
 */

 /*
  * In Java, method overloading and method overriding are two key concepts in object-oriented programming.
  * Method overloading occurs when multiple methods in the same class share the same name but have 
  different parameters (i.e., different type or number of parameters).

  Purpose: It allows a class to perform a similar function in different ways,
   depending on the input parameters.

   Real-Time Example: In a Calculator class, you may need to create an add method 
   that can add different types and numbers of inputs (e.g., integers, doubles, etc.).



  */

  /**
   * MethodOverloading
   */
   class Caliculator {
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }

    public double add(double a,double b)
    {
        return a+b;
    }
}

    public class MethodOverloading {
    
        public static void main(String[] args) {

            Caliculator cal=new Caliculator();
            double d=cal.add(2.3, 2.7);
            int  s=cal.add(5,4);

            System.out.println(d+" "+s);
            
        }
    }
  