package vn.edu.giadinh.tuan02;

public class TaiKhoan {
    // thuộc tính
    String chuTaiKhoan;
    String soTaiKhoan;
    int soDuTaiKhoan;

    // Phương thức
    void inThongTinTaiKhoan(){
        System.out.println("Chủ tài khoản: "+chuTaiKhoan);
        System.out.println("Số tài khoản: "+soTaiKhoan);
        System.out.println("Số dư: "+soDuTaiKhoan);
    }
}