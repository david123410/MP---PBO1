/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minpro1;

/**
 *
 * @author david
 */
public class Ruangan {
    public String namaruang;
    public String status;
    public int kapasitas;

    public Ruangan(String ruang, String statusruangan, int kapasitasruang) {
        this.namaruang = ruang;
        this.status = statusruangan;
        this.kapasitas = kapasitasruang;
    }

    public String Nama() {
        return namaruang; 
    }

    public String Status() {
        return status; 
    }

    public int Kapasitas() {
        return kapasitas; 
    }
     public void setNama(String nama) {
        this.namaruang = nama;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}
