package cwiczenia;

public class Lambdas {
    public static void main(String[] args) {
        //f(x) -> x*x; za strzałką jest funkcją;
        //zalety lambd:
        //nie musimy podwac typu w lambdzie;
        //nie potrzebe return
        //nie potrzeba klamer przy jednej funkcji
 MathOperation addition= (a, b)-> a+b;
 MathOperation subtraction = (a,b)-> a-b;
 MathOperation multiplication = (a,b)-> a*b;
 MathOperation division = (a,b)-> a/b;

 //implementacja interfejsu funkcyjnego poniżej
 double additionResult =executeOperation(3.0, 15.0, addition);
 System.out.println("Wynik operacji (a,b)-> a+b: " + additionResult);

 double subtractionResult= executeOperation(3, 15, subtraction);
 System.out.println("Wynik operacji (a,b)-> a-b: " +subtractionResult);

 double multiplicationResult= executeOperation(3, 15, multiplication);
 System.out.println("Wynik operacji (a,b)-> a*b: "+ multiplicationResult);

 double divisionResult= executeOperation(3, 15, division);
 System.out.println("Wynik operacji (a,b)-> a/b: "+ divisionResult);

    }
    //przyjmuje 2 liczby i operacje w formie interfejsu;
    //przyjmuje jako argument interfajs funkcyjny

    static double executeOperation (double a, double b, MathOperation operation){
        double result = operation.operate(a, b);
        return result;
    }
}
