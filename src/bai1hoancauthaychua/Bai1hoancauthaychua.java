/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1hoancauthaychua;

import java.util.Scanner;

/**
 *
 * @author kieun
 */
public class Bai1hoancauthaychua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int luongTrungBinh = 0, tongLuong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhân viên trong công ty: ");
        int soNhanVien = scanner.nextInt();
        NhanVienInterface[] nhanVien = new nhanvien[soNhanVien];
        System.out.println("Nhập thông tin cho nhân viên");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.print("Chọn loại nhân viên (1 - lập trình viên, 2 - kiểm chứng viên): ");
            int choose = scanner.nextInt();
            if (choose == 1) {
                nhanVien[i] = new laptrinhvien();
            } else if (choose == 2) {
                nhanVien[i] = new kiemchungvien();
            }
            nhanVien[i].nhap();
            nhanVien[i].tinhLuong();
        }
        System.out.println("Thông tin của các nhân viên trong công ty: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(nhanVien[i].toString());
        }
        System.out.println("Danh sách nhân viên có lương thấp hơn mức lương trung bình của " + "các nhân viên trong công ty.");
        for (int i = 0; i < soNhanVien; i++) {
            tongLuong += nhanVien[i].tinhLuong();
        }
        luongTrungBinh = tongLuong / soNhanVien;
        for (int i = 0; i < soNhanVien; i++) {
            if (nhanVien[i].tinhLuong() <= luongTrungBinh) {
                System.out.println(nhanVien[i].toString());
            }
        }
    }
}
