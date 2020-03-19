package sum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

  @Test
  public void sum() {
    Sum summation = new Sum();
    int [] addNumbers = {10,20,30};

    int calculatedSum = summation.sum(addNumbers);

    assertEquals(60, calculatedSum);
  }

  @Test
  public void sumOfEmptyList() {
    Sum summation = new Sum();
    int [] addNumbers = {};

    int calculatedSum = summation.sum(addNumbers);

    assertEquals(0, calculatedSum);
  }

  @Test
  public void sumWithOneElement() {
    Sum summation = new Sum();
    int [] addNumbers = {10};

    int calculatedSum = summation.sum(addNumbers);

    assertEquals(10, calculatedSum);
  }

  /*@Test
  public void sumWithNull() {
    Sum summation = new Sum();
    int [] addNumbers = null;

    int calculatedSum = summation.sum(addNumbers);

    assertNull();
  }*/

}