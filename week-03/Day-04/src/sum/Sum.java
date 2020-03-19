package sum;

public class Sum {

  public int sum(int [] inputNumbers){

    int sumResult = 0;
    for (int i = 0; i < inputNumbers.length ; i++) {
      sumResult = sumResult + inputNumbers[i];
    }
    return sumResult;
  }

}
