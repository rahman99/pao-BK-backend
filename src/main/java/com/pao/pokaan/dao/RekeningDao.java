package com.pao.pokaan.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.pao.pokaan.entity.Rekening;

public interface RekeningDao extends PagingAndSortingRepository<Rekening, String>{
    
}
