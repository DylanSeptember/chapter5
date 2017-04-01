package chapter5.prototype;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Cat c = new Cat();
        Dog d = new Dog();

        Cat cat = (Cat)c.copy();
        Dog dog = (Dog)d.copy();

        cat.speak();
        dog.speak();
    }
}

interface CloneObject
{
    public CloneObject copy();
}

class Cat implements CloneObject
{
    private String name;

    Cat()
    {
        setName("Kitty");
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void speak()
    {
        System.out.println("Meow");
    }

    public CloneObject copy() {
        return new Cat();
    }
}

class Dog implements CloneObject
{
    private String name;

    Dog()
    {
        setName("Rufus");
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void speak()
    {
        System.out.println("Woof");
    }

    public CloneObject copy() {
        return new Dog();
    }
}