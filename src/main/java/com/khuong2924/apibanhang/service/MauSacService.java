package com.khuong2924.apibanhang.service;

import com.khuong2924.apibanhang.dto.MauSacDTO;

import java.util.List;

public interface MauSacService {
    // các phương thức tương tác với database (CRUD) cho màu sắc

    List<MauSacDTO> getAll();

    MauSacDTO getById(Long id);

    void create(MauSacDTO mauSacDTO);

    void update(MauSacDTO mauSacDTO, Long id);

    void delete(Long id);
}
