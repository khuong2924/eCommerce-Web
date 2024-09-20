package com.khuong2924.apibanhang.service;

import com.khuong2924.apibanhang.dto.KichCoDTO;
import com.khuong2924.apibanhang.dto.MauSacDTO;

import java.util.List;

public interface KichCoService {
    List<KichCoDTO> getAll();

    KichCoDTO getById(Long id); // layas thong tin 1 ban ghi bang id

    void create(KichCoDTO kichCoDTO); // tao

    void update(KichCoDTO kichCoDTO, Long id);

    void delete(Long id);
}
