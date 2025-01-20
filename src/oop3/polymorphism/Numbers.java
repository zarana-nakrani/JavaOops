package oop3.polymorphism;

public class Numbers {
//    int sum(int a, int b){
//        return a + b;
//    }
    double sum(double a, double b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }


    public static void main(String[] args) {
        Numbers num = new Numbers();
        //this method call will still work with sum() taking and returning 'double' type values. This works because int type values will be implicitly type-casted to double.
        num.sum(2, 3); // this is called compile time polymorphism because at the compile-time it will be decided which method to call even though memory will be allocated at rumtime for method to run.
        num.sum(2, 3, 4);
        num.sum(2, 5);
    }
}
