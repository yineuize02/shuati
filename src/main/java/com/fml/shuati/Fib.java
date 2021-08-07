package com.fml.shuati;

/** https://leetcode-cn.com/problems/fibonacci-number/ */
public class Fib {

  public static void main(String[] args) {
    //
    var tt = new Fib();
    System.out.println(tt.fib(1));
    System.out.println(tt.fib(2));

    System.out.println(tt.fib(3));
    System.out.println(tt.fib(4));
  }

  public int fib(int n) {

    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    int fn2 = 0;
    int fn1 = 1;
    int f = 0;
    for (int i = 2; i <= n; ++i) {
      f = fn1 + fn2;
      fn2 = fn1;
      fn1 = f;
    }

    return f;
  }
}
