package generics;


// <T extends Number> kimi T ancaq Number-den extend eden objectleri qebul edir.
//<T,E> kimi de Generic iki tip qebul ede biler.
public class Container<T> { //<> Generics

    private T object;
    
    public Container (T object) {
        this.object = object;
    }
    
    public T doItAndReturn () {
        System.out.println("I did something");
        
        return this.object;
    }
    
    //metodda genericin gosterilmesi
    public <E> E saySomething () {
        E e = (E) new User();
        if (e instanceof User)
        return  null;
        else
            return e;
    }
}
