package apache.commons;

import apache.commons.SimpleClosure.Gender;

public class LaborForce
{
  private State state;
  private Gender gender;
  private int year;
  public LaborForce()
  {
  }
  public LaborForce(State state, Gender gender, int year)
  {
    this.state = state;
    this.gender = gender;
    this.year = year;
  }
  public State getState()
  {
    return state;
  }
  public void setState(State state)
  {
    this.state = state;
  }
  public Gender getGender()
  {
    return gender;
  }
  public void setGender(Gender gender)
  {
    this.gender = gender;
  }
  public int getYear()
  {
    return year;
  }
  public void setYear(int year)
  {
    this.year = year;
  }
}
