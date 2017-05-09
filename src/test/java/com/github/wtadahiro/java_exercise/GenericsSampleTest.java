package com.github.wtadahiro.java_exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class GenericsSampleTest {

  @Test
  public void testStringArgument() {
    GenericsSample container = new GenericsSample<String>();
    container.set("foo");
    assertEquals("foo", container.get());
  }

  @Test
  public void testIntegerArgument() {
    GenericsSample container = new GenericsSample<Integer>();
    container.set(1);
    assertEquals(1, container.get());
  }

  @Test
  public void testObjectArgument() {
    GenericsSample container = new GenericsSample<Object>();
    container.set(1);
    assertEquals(1, container.get());

    container.set("a");
    assertEquals("a", container.get());
  }

  @Test
  public void testUnsetValue() {
    GenericsSample container = new GenericsSample<Object>();
    assertEquals(null, container.get());
  }
}
