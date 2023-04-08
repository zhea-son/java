class OuterClass {
  String x = "There";
  class InnerClass {
    String y = "Hello ";
  }
}

class Outer{
  int x=5;
  static class Inner{
    int y=2;
  }
}

public class inner_class {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
    Outer.Inner i = new Outer.Inner();
    System.out.println(i.y);
  }
}