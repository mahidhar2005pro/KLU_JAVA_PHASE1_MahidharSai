/*
 * Program: MultiLevelInheritance
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates multi-level inheritance
 * KL University - Java Placement Training
 */

class GrandFather {
    void grandFatherProperty() {
        System.out.println("Grandfather has Land property");
    }
}

class Father extends GrandFather {
    void fatherProperty() {
        System.out.println("Father has House property");
    }
}

class Son extends Father {
    void sonProperty() {
        System.out.println("Son has Business");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Son son = new Son();
        son.grandFatherProperty();
        son.fatherProperty();
        son.sonProperty();
    }
}
