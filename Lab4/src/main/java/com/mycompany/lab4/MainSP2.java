/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class MainSP2 {

    public static void main(String[] args) {
        SanPham2 sp1=new SanPham2();
        SanPham2 sp2=new SanPham2();
        System.out.println("- San pham 1");
        sp1.nhap();
        System.out.println("- San pham 2");
        sp2.nhap();
        System.out.println("-----------------------");
        System.out.println("-------San pham 1------");
        sp1.xuat();
        System.out.println("-----------------------");
        System.out.println("-------San pham 2------");
        sp2.xuat();
        System.out.println("-----------------------");
    }
}
