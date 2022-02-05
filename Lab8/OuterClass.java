public class OuterClass {

    public interface Inner {

        String getName();
        void saySomething();
    }

    class Clasa implements Inner{
        String name;
        Clasa(String s){name = s;}
        public String getName(){return name;}
        @Override
        public void saySomething() {
            System.out.println("Say something "+name);
            
        }
    }

    Inner instantiateFirst(){
        
        System.out.println("Tworze klase wewnetrzna pierwsza");
        
        return new Clasa("first");
    }
    
    class InnerClassFirst implements Inner{
        String name;
        InnerClassFirst()
            {
                System.out.println("Tworze klase wewnetrzna pierwsza");
                name = "first";
            }

        @Override
        public String getName() {
            return name;
        }
        public void saySomething() {
            System.out.println("Say something "+name);
            
        }
         }

    Inner instantiateSecond()
            {
                System.out.println("Tworze klase wewnetrzna druga");
                return new Clasa("Second");
            }
        
        static class InnerClassSecond implements Inner{
            String name;
            InnerClassSecond()
                {
                    System.out.println("Tworze klase wewnetrzna druga");
                    name = "second";
                }

            @Override
            public String getName() {
                // TODO Auto-generated method stub
                return name;
            }
            public void saySomething() {
                System.out.println("Say something "+name);
                
            }
             }

        
        
}
