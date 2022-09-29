package com.kpi.question1;
@FunctionalInterface

interface Mul {
    int calculate(int x, int y);
}
  
class FnInterface2 {
    public static void main(String args[])
    {
        int a = 5;
        int b = 4;
        Mul s = (int x, int y) -> x * y;
 
      
        int ans = s.calculate(a,b);
        System.out.println(ans);
    }
}
