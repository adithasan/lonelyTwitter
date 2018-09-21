package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class AngryMood extends BaseMood
{
    public AngryMood(Date date)
    {
        super(date);
    }

    public AngryMood()
    {
        super();
    }

    @Override
    public String GetMood()
    {
        return "Angry";
    }
}
