package ca.ualberta.cs.lonelytwitter;
import java.util.Date;


public class HappyMood extends BaseMood
{
    public HappyMood(Date date)
    {
        super(date);
    }

    public HappyMood()
    {
        super();
    }

    @Override
    public String GetMood()
    {
        return "Happy";
    }
}
