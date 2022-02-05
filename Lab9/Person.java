public class Person
{
    final private String name,surname;
    final int age;
    Person(String name, String surname, int age)
    {
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{ name= "+name+" surname= "+surname+" age= "+String.valueOf(age)+" } ";
    }

        public boolean equals(Object person)
        {
            return true;
        }
    public int hashCode()
    {
        return name.hashCode()+surname.hashCode()+(String.valueOf(age)).hashCode();
    }

}