package ex_20_OOPs_Super_Abstraction;

public class Lab190_Interview_Q {


}

interface I11{}

interface I12{
}


class A1{}
class B1{}

class Test1 extends A1{}

// class Test2 extends A1,B1{}        Multiple inheritance in class is not allowed

class Test3 implements I11{
}

class Test4 implements I12, I11 {
}

class Test5 extends A implements I11, I12 { }   // This is possible

//class Test5 implements I11 extends A{}  This is not possible

interface I3{}

//interface I3 extends A1{}  This is not possible

