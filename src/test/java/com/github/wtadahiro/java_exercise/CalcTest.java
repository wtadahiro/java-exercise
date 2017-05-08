package com.github.wtadahiro.java_exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {

  @Test
  public void testAdd() {
    assertEquals(3, Calc.add(1, 2));
  }

  @Test
  public void testSubtract() {
    assertEquals(3, Calc.subtract(8, 5));
  }
}
