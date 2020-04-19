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
public class kiemchungvien extends nhanvien {

    private int soLoiPhatHien;

    public kiemchungvien() {
        super();
    }

    public kiemchungvien(int soLoiPhatHien) {
        super();
        this.soLoiPhatHien = soLoiPhatHien;
    }

    public int getSoLoiPhatHien() {
        return soLoiPhatHien;
    }

    public void setSoLoiPhatHien(int soLoiPhatHien) {
        this.soLoiPhatHien = soLoiPhatHien;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập số lỗi phát hiện: ");
        soLoiPhatHien = scanner.nextInt();
    }

    @Override
    public int tinhLuong() {
        this.luong = this.luongCoBan + this.soLoiPhatHien * 50000;
        return this.luong;
    }

    @Override
    public String toString() {
        return super.toString() + "\n, số lỗi phát hiện: " + this.soLoiPhatHien + ", lương: " + this.luong;
    }
}
