package com.khuong2924.apibanhang.repository;

import com.khuong2924.apibanhang.entity.LoaiSanPham;
import com.khuong2924.apibanhang.entity.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MauSacRepository extends JpaRepository<MauSac, Long> {
}
