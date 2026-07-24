/*
 * Program: MethodOverridingDemo
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates method overriding
 * KL University - Java Placement Training
 */

class Bank {
    double getRateOfInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 8.4;
    }
}

class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.3;
    }
}

class Axis extends Bank {
    @Override
    double getRateOfInterest() {
        return 9.7;
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        Axis axis = new Axis();
        
        System.out.println("SBI Rate: " + sbi.getRateOfInterest() + "%");
        System.out.println("ICICI Rate: " + icici.getRateOfInterest() + "%");
        System.out.println("Axis Rate: " + axis.getRateOfInterest() + "%");
    }
}
