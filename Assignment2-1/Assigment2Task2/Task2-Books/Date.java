
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
  
    enum Month {
        January, 
        February, 
        March, 
        April, 
        May, 
        June,
        July,
        August,
        September,
        October,
        November,
        December
    }
    enum Format
    {
        DMY,
        SlashDMY,
        SlashMDY
    }
    private Month month;
    private int day;
    private int year;
    
    public Date(Month mon, int day, int year)
    {
        this.month = mon;
        this.day = day;
        this.year = year;
        
    }
    
    public String getDate(Date.Format form)
    {
        switch(form)
        {
            case DMY:
                return "" + day + " " + month + " " + year;
            case SlashDMY:
                return "" + day + "/" + month + "/" + year;
            case SlashMDY:
                return "" + month + "/" + day + "/" + year;
            default:
                return "" + month + "/" + day + "/" + year;
                
        }
    }
    
}
