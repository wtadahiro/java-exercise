package com.github.wtadahiro.java_exercise;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class LambdaSampleTest {

  @Test
  public void test() {
    List list = new ArrayList<Integer>();
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(5);
    list.add(8);
    assertEquals(LambdaSample.sumUsingLoop(list), LambdaSample.sumUsingLambda(list));
  }



}
