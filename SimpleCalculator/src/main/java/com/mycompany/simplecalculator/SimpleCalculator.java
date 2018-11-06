/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplecalculator;

/**
 *
 * @author posso
 */
public class SimpleCalculator {
    
    private double operand1;
    private double operand2;
    private double result;
    
    public double add(double op1, double op2){
        return op1 + op2;
    }
    
    public double subtract(double op1, double op2){
        return op1 - op2;
    }
    
    public double multiply(double op1, double op2){
        return op1 * op2;
    }
    
    public double divide(double op1, double op2){
        return op1 / op2;
    }
    
}
