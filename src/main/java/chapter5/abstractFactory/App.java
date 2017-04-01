package chapter5.abstractFactory;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        abstractFactory fact = new HobbyFactory();

        Hobby hob1 = fact.getHobby("soccer");
        Hobby hob2 = fact.getHobby("chess");

        hob1.activity();
        hob2.activity();
    }
}

interface Hobby
{
    void activity();
}

class Soccer implements Hobby
{
    public void activity()
    {
        System.out.println("Kick Balls");
    }
}

class Chess implements Hobby
{
    public void activity()
    {
        System.out.println("Stare at table");
    }
}

abstract class abstractFactory
{
    abstract Hobby getHobby(String hobby);
}

class HobbyFactory extends abstractFactory
{
    public Hobby getHobby(String hobby) {
        if(hobby == null){
            return null;
        }

        if(hobby.equalsIgnoreCase("Soccer")) {
            return new Soccer();

        }

        else if(hobby.equalsIgnoreCase("Chess")) {
            return new Chess();

        }

        return null;
    }
}