package ProblemNonSpecific;
class Chromosome<T>
{
    DataType data;
    public Chromosome(DataType d)
    {
     data = d;

    }
    public Chromosome()
    {
    }
    public void hillClimb()
    {
        data.hillClimb();
    }
    public void setData(DataType d)
    {
        data = d;
    }
    public DataType getData()
    {
        return data;
    }
}
