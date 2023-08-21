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

    public void setName(String name)
    {
       if(name.equals( "sethu") || name.equals("Meenu") || name.equals("sethu meenakshi"))
       {
           this.name =name;
       }
    }

    public void setAge(int newAge)
    {
        if(newAge>=0)
        {
            age=newAge;
        }
        else
        {
            System.out.println("Invalid Age");
        }
    }

}
