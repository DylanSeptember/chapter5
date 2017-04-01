package chapter5.bridge;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {


        PersonInfo personInfo = new PersonInfo();
        personInfo.print();
        Proxy proxy = new Proxy();
        proxy.print();
    }
}

interface DBInfo
{
    public void print();
}

class PersonInfo implements DBInfo
{
    public void print()
    {
        System.out.println("this is someones info");
    }
}

class Proxy
{
    PersonInfo personInfo;

    public Proxy()
    {
        System.out.println("Creating proxy");
    }

    public void print()
    {
        if(personInfo == null)
        {
            personInfo = new PersonInfo();
        }
        personInfo.print();
    }
}