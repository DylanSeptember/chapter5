package chapter5.bridge;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Computer computer = new PC(new i7());
        computer.boot();

    }
}

abstract class Computer
{
    Processor processor;

    String colour;

    public abstract void boot();

    public void setProcessor(Processor processor)
    {
        this.processor = processor;
    }
}

class PC extends Computer
{
    public PC(Processor processor)
    {
        this.colour = "Green";
        this.processor = processor;
    }

    public void boot()
    {
        System.out.println("This pc has viruses");
        processor.process();
    }
}



interface Processor
{
    public void process();
}

class i7 implements Processor
{
    public void process()
    {
        System.out.println("process process...");
    }
}