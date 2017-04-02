package chapter5.chainOfResponsibility;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        WorkerHandler chain = setUpChain();

        chain.handleRequest(WorkerEnum.Worker1);
        System.out.println();
        chain.handleRequest(WorkerEnum.Worker2);
        System.out.println();
        chain.handleRequest(WorkerEnum.Worker3);
    }

    public static WorkerHandler setUpChain()
    {
        WorkerHandler worker1Handler = new Worker1Handler();
        WorkerHandler worker2Handler = new Worker2Handler();
        WorkerHandler worker3Handler = new Worker3Handler();

        worker1Handler.setSuccessor(worker2Handler);
        worker2Handler.setSuccessor(worker3Handler);

        return worker1Handler;
    }

}


abstract class WorkerHandler
{
    WorkerHandler successor;

    public void setSuccessor(WorkerHandler successor)
    {
        this.successor = successor;
    }

    public abstract void handleRequest(WorkerEnum request);
}

enum WorkerEnum
{
    Worker1,Worker2,Worker3;
}

class Worker1Handler extends WorkerHandler
{
    public void handleRequest(WorkerEnum request)
    {
        if(request == WorkerEnum.Worker1)
        {
            System.out.println("Worker 1 works it " + request);
        }
        else
        {
            System.out.println("Worker 1: Not my job");
            if(successor != null)
            {
                successor.handleRequest(request);
            }
        }
    }
}

class Worker2Handler extends WorkerHandler
{
    public void handleRequest(WorkerEnum request)
    {
        if(request == WorkerEnum.Worker2)
        {
            System.out.println("Worker 2 works it " + request);
        }
        else
        {
            System.out.println("Worker 2: Not my job");
            if(successor != null)
            {
                successor.handleRequest(request);
            }
        }
    }
}

class Worker3Handler extends WorkerHandler
{
    public void handleRequest(WorkerEnum request)
    {
        if(request == WorkerEnum.Worker3)
        {
            System.out.println("Worker 3 works it " + request);
        }
        else
        {
            System.out.println("Worker 3: Not my job");
            if(successor != null)
            {
                successor.handleRequest(request);
            }
        }
    }
}