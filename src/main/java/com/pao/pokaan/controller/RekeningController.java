package com.pao.pokaan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pao.pokaan.dao.RekeningDao;
import com.pao.pokaan.entity.Rekening;

@RestController
public class RekeningController {
    
    @Autowired private RekeningDao rekeningDao;
    
    @RequestMapping("/rekening/")
    public Iterable<Rekening> semuaRekening(){
        return rekeningDao.findAll();
    }
}
