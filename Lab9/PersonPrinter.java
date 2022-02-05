public class PersonPrinter {

    Sum sum = (x,y)->{return x+y;};
    Sum multiply = (x,y)->{return x*y;};
    static void print(Person... x)
    {
        if(x.length < 1) { System.out.println("//"); return; }
        for (Person obj : x) {
            System.out.print(obj);
        }
        System.out.println();
    
    }
    void printOperation(Person obj1, Person obj2, Sum x)
    {
        System.out.println(x.sum(obj1.age,obj2.age));
    }
    public static void checkIfCanDrinkWithExceptionCatch(Person person1) {
        
        try{
            if(person1.age<18) { throw new ExceptionAge(1); }
            else
            {
                System.out.println(person1+"ta osoba moze pic alkohol");
            }
        } catch(ExceptionAge e)
        {
            System.err.println(person1+ "ta osoba nie moze pic alkoholu!");
        }
    }
}
