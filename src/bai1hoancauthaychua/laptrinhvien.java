/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1hoancauthaychua;

/**
 *
 * @author kieun
 */
public class laptrinhvien extends nhanvien {

    private int soGioLamThem;

    public laptrinhvien() {
        super();
    }

    public laptrinhvien(int soGioLamThem) {
        super();
        this.soGioLamThem = soGioLamThem;
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập số giờ làm thêm: ");
        soGioLamThem = scanner.nextInt();
    }

    @Override
    public int tinhLuong() {
        this.luong = this.luongCoBan + this.soGioLamThem * 200000;
        return this.luong;
    }

    @Override
    public String toString() {
        return super.toString() + "\n, số giờ làm thêm: " + this.soGioLamThem + ", lương: " + this.luong;
    }
}
