package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;


import com.example.demo.dto.MaquinaRegistradora;
import com.example.demo.services.IMaquinaRegistradoraService;

@RestController
@RequestMapping("/maquinas")
public class MaquinaRegistradoraController {

 private final IMaquinaRegistradoraService maquinaService;
 
 public MaquinaRegistradoraController(IMaquinaRegistradoraService maquinaService) {
     this.maquinaService = maquinaService;
 }
 
 @GetMapping("/all")
 public List<MaquinaRegistradora> getAllMaquinasRegistradoras() {
     return maquinaService.getAllMaquinas();
 }

 @GetMapping("/{codigo}")
 public MaquinaRegistradora getMaquina(@PathVariable int codigo) {
     return maquinaService.getMaquinaByCodigo(codigo);
 }

 @PostMapping
 public MaquinaRegistradora createMaquina(@RequestBody MaquinaRegistradora maquina) {
     return maquinaService.createMaquina(maquina);
 }

 @PutMapping("/{codigo}")
 public MaquinaRegistradora updateMaquina(@PathVariable int codigo, @RequestBody MaquinaRegistradora maquina) {
     return maquinaService.updateMaquina(codigo, maquina);
 }

 @DeleteMapping("/{codigo}")
 public void deleteMaquina(@PathVariable int codigo) {
     maquinaService.deleteMaquina(codigo);
 }
}
