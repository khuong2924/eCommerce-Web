package com.khuong2924.apibanhang.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GioHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long tongSanPham; //ví dụ trong chi tiết của giỏ này có 3 shirt + 2 polo cùng loại thì tongSanPham = 2.
    private Long tongSoTien;

    //1 tài khoản - 1 giỏ hàng
    //1 sản phẩm nhiều chi tiết

    @OneToOne
    @JoinColumn(name = "tai_khoan_id")
    private TaiKhoan taiKhoan;

}
