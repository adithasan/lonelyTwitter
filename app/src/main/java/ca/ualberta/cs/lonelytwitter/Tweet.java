package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet {

    protected String message;
    protected Date date;
    protected ArrayList<BaseMood> moods;

    public Tweet(String message)
    {
        this.message = message;
        this.date = new Date();
        this.moods = new ArrayList<BaseMood>();
    }

    public Tweet(String message, Date date)
    {
        this.message = message;
        this.date = date;
        this.moods = new ArrayList<BaseMood>();
    }

    public Tweet(String message, Date date, ArrayList<BaseMood> moods)
    {
        this.message = message;
        this.date = date;
        this.moods = moods;
    }

    public void SetMessage(String message) throws TweetTooLongException
    {
        if (message.length()>140)
        {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void SetDate(Date date)
    {
        this.date = date;
    }

    public String GetMessage()
    {
        return this.message;
    }

    public Date GetDate()
    {
        return this.date;
    }

    public abstract boolean isImportant();

    // not adding getters and setters for moods to the class since it
    // was not asked for in the assignment description
}
