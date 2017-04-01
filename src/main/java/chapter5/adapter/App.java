package chapter5.adapter;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        DistanceAdapter distanceAdapter = new DistanceAdapter();

        distanceAdapter.setDistanceMiles(90);
        System.out.println("Distance in Miles: " + distanceAdapter.getDistanceMiles());
        System.out.println("Distance in KM: " + distanceAdapter.getDistanceKM());
        System.out.println();
        distanceAdapter.setDistanceKM(144);
        System.out.println("Distance in Miles: " + distanceAdapter.getDistanceMiles());
        System.out.println("Distance in KM: " + distanceAdapter.getDistanceKM());

    }
}

class DistanceMiles
{
    private double distance;

    DistanceMiles()
    {}

    DistanceMiles(double distance)
    {
        setDistance(distance);
    }

    public double getDistance()
    {
        return distance;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }
}

interface DistanceInfo
{
    public double getDistanceMiles();
    public double getDistanceKM();

    public void setDistanceMiles(double distance);
    public void setDistanceKM(double distance);
}

class DistanceAdapter implements DistanceInfo
{
    DistanceMiles distanceMiles;

    DistanceAdapter()
    {
        distanceMiles = new DistanceMiles();
    }

    public void setDistanceMiles(double distance)
    {
        distanceMiles.setDistance(distance);
    }

    public void setDistanceKM(double distance)
    {
        distanceMiles.setDistance(KMToMiles(distance));
    }

    public double getDistanceMiles()
    {
        return distanceMiles.getDistance();
    }

    public double getDistanceKM()
    {
        return milesToKM(distanceMiles.getDistance());
    }

    private double milesToKM(double distance)
    {
        return ((distance/5)*8);
    }

    private double KMToMiles(double distance)
    {
        return ((distance/2)+(distance/8));
    }
}