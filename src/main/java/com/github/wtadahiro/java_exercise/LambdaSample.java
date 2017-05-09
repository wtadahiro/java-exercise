package com.github.wtadahiro.java_exercise;

import java.util.List;
import java.util.ArrayList;

public class LambdaSample {

  public static int sumUsingLoop(List<Integer> arrayList) {
    int sum = 0;
    for(int i = 0; i< arrayList.size(); i++) {
      sum += arrayList.get(i);
    }
    return sum;
  }

  public static int sumUsingLambda(List<Integer> arrayList) {
    return arrayList.stream().reduce(0, (prev, current) -> prev + current);
  }
}
