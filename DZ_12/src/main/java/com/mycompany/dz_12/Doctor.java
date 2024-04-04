/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz_12;


import java.io.Serializable;

public class Doctor implements Serializable {
    private String name;
    private String specialization;
    private int employeeNumber;
    private int workShiftsPerMonth;
    private boolean certificationStatus;

    public Doctor(String name, String specialization, int employeeNumber, int workShiftsPerMonth, boolean certificationStatus) {
        this.name = name;
        this.specialization = specialization;
        this.employeeNumber = employeeNumber;
        this.workShiftsPerMonth = workShiftsPerMonth;
        this.certificationStatus = certificationStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getWorkShiftsPerMonth() {
        return workShiftsPerMonth;
    }

    public void setWorkShiftsPerMonth(int workShiftsPerMonth) {
        this.workShiftsPerMonth = workShiftsPerMonth;
    }

    public boolean isCertificationStatus() {
        return certificationStatus;
    }

    public void setCertificationStatus(boolean certificationStatus) {
        this.certificationStatus = certificationStatus;
    }

}