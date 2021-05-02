
package $11_Super_Method;


public class Child extends Parent{
    int c,d;
    
    public Child(int a, int b, int c,int d) {
        super(a,b);
        this.c=c;
        this.d=d;
     
    }
    
    void display(){
        System.out.println("parent"+super.a);
         System.out.println("parent"+super.b);
          System.out.println("child"+this.c);
          System.out.println("child"+this.d);
    }
     @Override
    void m1(){
        super.m1();
        System.out.println("child");
    }
    
}
