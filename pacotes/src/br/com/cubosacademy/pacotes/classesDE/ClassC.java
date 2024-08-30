package br.com.cubosacademy.pacotes.classesDE;

import br.com.cubosacademy.pacotes.classesABC.ClassA;

public class ClassC extends ClassA {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassC classC = new ClassC();
        System.out.println(classC.name);
        System.out.println(classA.name2);
    }

}
