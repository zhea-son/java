/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi_project;


import java.rmi.registry.*;

public class Server {
    public static void main(String[] args) throws Exception{
        FactorialImpl obj = new FactorialImpl();
        Registry reg = LocateRegistry.createRegistry(1009);
        reg.bind("Service", obj);
        System.out.println("Service Running...");
    }
}
