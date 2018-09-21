package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class BaseMood
{
    protected Date date;

    public Date GetDate()
    {
        return this.date;
    }

    public void SetDate(Date date)
    {
        this.date = date;
    }

    public abstract String GetMood();

    public BaseMood(Date date)
    {
        this.date = date;
    }

    public BaseMood()
    {
        this.date = new Date();
    }
}
