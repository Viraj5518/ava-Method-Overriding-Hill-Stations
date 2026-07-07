package Override;

class Gulmarg extends HillStations
{
    @Override
    void location()
    {
        System.out.println("Gulmarg is in Jammu and Kashmir.");
    }

    @Override
    void famousFor()
    {
        System.out.println("Gulmarg is famous for Skiing and Snowfall.");
    }
}
