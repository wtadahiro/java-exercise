package com.github.wtadahiro.java_exercise;

public class GenericsSample<T> {
  private T value;
  public void set(T value) {
    this.value = value;
  }

  public T get () {
    return this.value;
  }
}
