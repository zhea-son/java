/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi_project;

import java.rmi.*;

public interface FactorialInterface extends Remote {
    public int getFactorial(int x) throws RemoteException;
}
