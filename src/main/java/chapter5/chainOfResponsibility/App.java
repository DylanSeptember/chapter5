package chapter5.chainOfResponsibility;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
       int balance = 800;

       Strategy hoodieStrategy = new PurchaseHoodieStrategy();
       Context context = new Context(balance,hoodieStrategy);

       System.out.println("Balance: " + context.getBalance());
        System.out.println();
        System.out.println("Do i have enough to buy a hoodie? " + (context.getResult() == true ? "Yes": "No"));
        System.out.println();

        Strategy shoeStrategy = new PurchaseShoeStrategy();
       context.setStrategy(shoeStrategy);
        System.out.println("Do i have enough to buy a shoe? " + (context.getResult() == true ? "Yes": "No"));


    }



}

interface Strategy
{
    public boolean checkBalance(int balance);
}

class PurchaseHoodieStrategy implements Strategy
{
    public boolean checkBalance(int balance)
    {
        if(balance >= 300)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class PurchaseShoeStrategy implements Strategy
{
    public boolean checkBalance(int balance)
    {
        if(balance >= 1200)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}

class Context
{
    private int balance;
    private Strategy strategy;

    public Context(int balance, Strategy strategy)
    {
        this.balance = balance;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public Strategy getStrategy()
    {
        return strategy;
    }

    public int getBalance()
    {
        return balance;
    }

    public boolean getResult()
    {
        return strategy.checkBalance(balance);
    }
}