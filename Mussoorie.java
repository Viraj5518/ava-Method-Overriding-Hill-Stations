package Override;

class Mussoorie extends HillStations
{
    @Override
    void location()
    {
        System.out.println("Mussoorie is in Uttarakhand.");
    }

    @Override
    void famousFor()
    {
        System.out.println("Mussoorie is famous for Hills and Waterfalls.");
    }
}