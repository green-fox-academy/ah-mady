package counter;

public class Counter {
  int value;
  int defaultValue;

  public Counter(){
    this(0);
  }

  public Counter(int value){
  this.value = value;
  defaultValue = value;
  }

  public void add(){
    value++;
  }

  public void add(int number){
    value+=number;
  }

  public int get(){
    return value;
  }

  public void reset(){
    value = defaultValue;
  }

}
