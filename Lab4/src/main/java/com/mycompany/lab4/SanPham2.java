/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class SanPham2 {

    public String ten;
    public Double gia;
    public Double giamgia;

    public Double thue(double gia) {
        return this.gia * 0.1;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap don gia: ");
        this.gia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        this.giamgia = sc.nextDouble();
    }

    public SanPham2(String ten, Double gia, Double giamgia) {
        this.ten = ten;
        this.gia = gia;
        this.giamgia = giamgia;
    }

    public SanPham2() {
    }

    public void xuat() {
        System.out.println("Ten san pham: " + this.ten);
        System.out.println("Don gia: " + this.gia);
        System.out.println("Giam gia: " + this.giamgia);
        System.out.println("Thue nhap khau: " + thue(gia));
    }
}
