package Comparable;

public class Thing {
  protected String name;
  public boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public Thing() {
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}
