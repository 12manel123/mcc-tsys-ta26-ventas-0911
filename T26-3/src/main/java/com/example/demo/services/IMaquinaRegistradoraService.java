package com.example.demo.services;

import com.example.demo.dto.MaquinaRegistradora;

import java.util.List;

public interface IMaquinaRegistradoraService {
    MaquinaRegistradora getMaquinaByCodigo(int codigo);
    List<MaquinaRegistradora> getAllMaquinas();
    MaquinaRegistradora createMaquina(MaquinaRegistradora maquina);
    MaquinaRegistradora updateMaquina(int codigo, MaquinaRegistradora maquina);
    void deleteMaquina(int codigo);
}