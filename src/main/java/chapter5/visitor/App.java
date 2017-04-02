package chapter5.visitor;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
       HumanOrgan humanOrgan = new Human();

       humanOrgan.accept(new HumanOrganDisplayVisitor());
    }



}

interface OrganVisitor
{
    public void visit(Heart heart);
    public void visit(Liver liver);
    public void visit(Lungs lungs);
    public void visit(Human human);
}

interface HumanOrgan
{
    public void accept(OrganVisitor visitor);
}

class Heart implements HumanOrgan
{
    Heart()
    {

    }
    public void accept(OrganVisitor visitor)
    {
        visitor.visit(this);
    }

    public void info()
    {
        System.out.println("Heart; pumps blood...");
    }
}


class Liver implements HumanOrgan {
    Liver() {

    }

    public void accept(OrganVisitor visitor) {
        visitor.visit(this);
    }

    public void info()
    {
        System.out.println("Liver; tastes good...");
    }
}

class Lungs implements HumanOrgan {
    Lungs() {

    }

    public void accept(OrganVisitor visitor) {
        visitor.visit(this);
    }

    public void info()
    {
        System.out.println("Lungs; helps me smoke...and breathe...");
    }
}

class Human implements HumanOrgan {
    HumanOrgan[] organs;

    public Human() {
        organs = new HumanOrgan[]{new Heart(), new Liver(), new Lungs()};
    }

    public void accept(OrganVisitor visitor) {
        for (int i = 0; i < organs.length; i++) {
            organs[i].accept(visitor);

        }
        visitor.visit(this);
    }

    public void info() {
        System.out.println("Humans; have many organs...");
    }
}

class HumanOrganDisplayVisitor implements OrganVisitor
{
    public void visit(Human human)
    {
        System.out.println("Human");
        human.info();
    }

    public void visit(Heart heart)
    {
        System.out.println("Heart");
        heart.info();
    }

    public void visit(Liver liver)
    {
        System.out.println("Liver");
        liver.info();
    }

    public void visit(Lungs lungs)
    {
        System.out.println("Lungs");
    }
}