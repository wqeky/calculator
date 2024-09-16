package org.example;

public class Calculator {

        public int add(int a, int b){
            return a + b;
        }
        public int subtract(int a, int b){
            return a - b;
        }
        public int multiply(int a, int b){
            return a * b;
        }
        public double division(int a, int b){
            if (b==0){
                throw new ArithmeticException("Делить на 0 нельзя");
            }
            return (double) a / b;
        }
    }

