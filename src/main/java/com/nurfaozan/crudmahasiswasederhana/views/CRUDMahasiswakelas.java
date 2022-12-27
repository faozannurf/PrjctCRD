/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nurfaozan.crudmahasiswasederhana.views;

import javax.swing.SwingUtilities;

/**
 *
 * @author lenovo
 */
public class CRUDMahasiswakelas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                MahasiswaFrame form = new MahasiswaFrame();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        });
    }
}