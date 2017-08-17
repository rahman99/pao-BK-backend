package com.pao.pokaan.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.pao.pokaan.entity.Transfer;

public interface TransferDao extends PagingAndSortingRepository<Transfer, String>{
    
}
