/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi_project;

import java.rmi.*;
import java.rmi.server.*;

public class FactorialImpl extends UnicastRemoteObject implements FactorialInterface {
    public FactorialImpl() throws RemoteException{
        super();
    }
    @Override
    public int getFactorial(int x) throws RemoteException{
        int p = 1;
        for(int i=1 ; i<= x ; i++){
            p = p*i;
        }
        return p;
    }
}
