import java.io.Serializable;
import java.util.Date;

public class Structure
{
    private String zip;
    private Date date_time;
    private String id;

    public String getZip ()
    {
        return zip;
    }

    public void setZip (String zip)
    {
        this.zip = zip;
    }

    public Date getDate_time ()
    {
        return date_time;
    }

    public void setDate_time (Date date_time)
    {
        this.date_time = date_time;
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
        return "Structure [zip = "+getZip()+", date_time = "+getDate_time()+", id = "+getId()+"]";
    }

}
