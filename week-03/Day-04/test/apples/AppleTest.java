package apples;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

  @org.junit.jupiter.api.Test
  public void getApple() {
    Apple fruit = new Apple();
    String appleReturn = fruit.getApple();

    assertEquals("grape", appleReturn);
  }
}