/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz_12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DoctorSerialization implements Runnable {
    
    private Doctor doctor;

    public DoctorSerialization(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void run() {
        try {
            serializeDoctor(doctor);
            System.out.println("Объект успешно сохранен.");
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации объекта: " + e.getMessage());
        }
    }

/**
 *
 * папка Doctor используется мною для записи на нее файла, т.к. у программы
 * не хватает прав на запись файла напрямую на диск С.
 * 
 */
    
    private static void serializeDoctor(Doctor doctor) throws IOException {
        String filePath = "C:\\Doctor\\doctor.txt";
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(doctor);
        }
    }

    
}
