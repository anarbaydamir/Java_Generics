package generics;

public class Main {
    public static void main (String[] args) {
        
        
        //-----------Generics-----------
        Container container1 = new Container(new User()); //raw type halinda olan instance
        
        Container<User> container = new Container<User>(new User()); // Generics, compile time zamani type safety temin edir.
        //Compile edildikden sonra type erasure bash verir yeni tipler silinir
        
//        Container<User> container2 = new Container<>(new User()); java 1.7-den etibaren bu cur de yazmaq olar.
        
        User u = (User) container.doItAndReturn();
        
        
        
        //metodlara da generic teyin etmek olur.
        Integer i = container.<Integer>saySomething();
        Double d = container.<Double>saySomething();
        
        
        
        
        
        
        
        
        //----------------Wildcard-----------------
        
        Container<Integer> container3 = new Container<Integer>(new Integer(4));
        Container<User> container4 = new Container<User>(new User());
        Container<User2> container5= new Container<User2>(new User2());
        
        method1(container5);
        method2(container3);
        method3(container4);
    }
    
    public static void doSomething (Container<User> container) {
        User u = container.doItAndReturn();
        System.out.println("u "+u);
        
    }
    
    
    //Wildcard
    public static void method1 (Container<? extends User> container) { //yeni Userden extend eden bir class goturur. upper bound
    
    }
    
    public static void method2 (Container<? extends Number> container) {
    
    }
    
    public static void method3 (Container<? super User2> container) { //yeni User2-de extends olunan classi goturur. lower bound
    
    }
    
    public static void method4 (Container<?> container) { //unbound wildcard
    
    }
}
