package com.example.kiemtra.SanPham;

public class SanPham {
    public Integer MaSP;
    public String TenSP;
    public Float GiaTien;
    public String Image;

    public SanPham(Integer maSP, String tenSP, Float giaTien, String image) {
        MaSP = maSP;
        TenSP = tenSP;
        GiaTien = giaTien;
        Image = image;
    }
    public Integer getMaSP() {
        return MaSP;
    }

    public void setMaSP(Integer maSP) {
        MaSP = maSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public Float getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(Float giaTien) {
        GiaTien = giaTien;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
