/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dz_12;

import java.util.Scanner;


public class DZ_12 {

    public static void main(String[] args) {
        System.out.println("Practical task 1.12, Student Dmitry Poluektov, RIBO-01-22, Variant 3");
        
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Введите данные о враче.");

            System.out.print("Имя: ");
            String name = scanner.nextLine();

            System.out.print("Специальность: ");
            String specialization = scanner.nextLine();

            System.out.print("Порядковый номер: ");
            int employeeNumber = Integer.parseInt(scanner.nextLine());

            System.out.print("Количество рабочих смен в месяц: ");
            int workShiftsPerMonth = Integer.parseInt(scanner.nextLine());

            System.out.print("Пройдена ли аттестация (true/false): ");
            boolean certificationStatus = Boolean.parseBoolean(scanner.nextLine());

            Doctor doctor = new Doctor(name, specialization, employeeNumber, workShiftsPerMonth, certificationStatus);

            Thread serializationThread = new Thread(new DoctorSerialization(doctor));
            serializationThread.start();
            serializationThread.join();

        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода числа: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Ошибка при ожидании завершения потока: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
