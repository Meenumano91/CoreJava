package Encapsulation;
public class Person{
    private String name;
    private int age;

    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String newName)
    {
        name =newName;
    }

    public void setAge(int newAge)
    {
        if(age>=0)
        {
            age=newAge;
        }
        else {
            System.out.println("Invalid Age");
        }
    }

}