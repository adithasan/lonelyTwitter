package ca.ualberta.cs.lonelytwitter;

public class Student
{
    private int age;
    private String name;

    // Setters
    public void SetName(String name) { this.name = name; }
    public void SetAge(int age) { this.age = age; }

    //Getters
    public int GetAge() { return this.age; }
    public String GetName() { return this.name; }
}
