package com.kodilla.spring.basic.spring_dependency_injection.homework;
import org.springframework.stereotype.Component;


@Component
public class Calculator {

    private Display display;

    public Calculator(Display display){
        this.display = display;

    }
    public double add(double a,double b){   /// dodawanie
        double sum = a+b;
        display.display(sum);
        return sum;

    }
    public double subtract(double a,double b){  /// odejmowanie
        double difference = a - b;
        display.display(difference);
        return difference;
    }
    public double multiply(double a,double b){  /// mnożenie
        double product = a*b;
        display.display(product);
        return product;
    }
    public double divide(double a,double b){ /// dzielenie
        double quotient = a/b;
        display.display(quotient);
        return quotient;
    }
}
