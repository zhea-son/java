/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi_project;

import java.rmi.registry.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Registry reg = LocateRegistry.getRegistry("localhost");
        FactorialInterface obj = (FactorialInterface) reg.lookup("Service");
        int fact = obj.getFactorial(7);
        System.out.println(fact);
    }
}
