/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugasakhirHakeem.tugasakhirHakeem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping(value = "/Penjualan")
public class DatabaseController {
    @Autowired
    RepositoryPenjualan repositoryPenjualanTas;
            
    @PostMapping(value = "/addPenjualan")
    public Pejualan addPenjualan(@RequestBody Pejualan Param)
    {
        repositoryPenjualanTas.save(Param);
        return Param;
    }
    
    @GetMapping(value = "/allPenjualan")
    public List<Pejualan> allPenjualan()
    {
        return repositoryPenjualanTas.findAll();
    }
    
    @PutMapping(value = "/updatePenjualan")
    public Pejualan updatePenjualan(@RequestBody Pejualan Param)
    {
       return repositoryPenjualanTas.save(Param);
    }
    
    @DeleteMapping(value = "/hapusPenjualan")
    public List<Pejualan> hapuschanna(@RequestParam int id)
    {
        repositoryPenjualanTas.deleteById(id);
        List<Pejualan> Penjualanlist = repositoryPenjualanTas.findAll();
        return Penjualanlist;
    }
}
