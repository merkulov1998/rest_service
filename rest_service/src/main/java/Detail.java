public class Detail
{
    private String name;

    private int company_code;

    private String id;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public int getCompany_code ()
    {
        return company_code;
    }

    public void setCompany_code (int company_code)
    {
        this.company_code = company_code;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Detail [name = "+name+", company_code = "+company_code+", id = "+id+"]";
    }
}
