package com.wtadahiro;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {

  @Test
  public void testAdd() {
    assertEquals(3, Calc.add(1, 2));
  }
}
