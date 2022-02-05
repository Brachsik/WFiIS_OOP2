public class PersonBuilder {
    String name,surname;
    int age;
    PersonBuilder name(String _name)
    {
        name=_name;
        return this;
    }
    PersonBuilder surname(String _surname)
    {
        surname=_surname;
        return this;
    }
    PersonBuilder age(int age)
    {
        this.age=age;
        return this;
    }
    Person build()
    {
        return new Person(name,surname,age);
    }
}
