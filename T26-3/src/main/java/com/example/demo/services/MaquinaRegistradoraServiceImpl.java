package com.example.demo.services;

import com.example.demo.dao.IMaquinaRegistradoraDAO;
import com.example.demo.dto.MaquinaRegistradora;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MaquinaRegistradoraServiceImpl implements IMaquinaRegistradoraService {

    private final IMaquinaRegistradoraDAO maquinaDAO;

    public MaquinaRegistradoraServiceImpl(IMaquinaRegistradoraDAO maquinaDAO) {
        this.maquinaDAO = maquinaDAO;
    }

    @Override
    public MaquinaRegistradora getMaquinaByCodigo(int codigo) {
        return maquinaDAO.findById(codigo).orElse(null);
    }

    @Override
    public List<MaquinaRegistradora> getAllMaquinas() {
        return (List<MaquinaRegistradora>) maquinaDAO.findAll();
    }

    @Override
    public MaquinaRegistradora createMaquina(MaquinaRegistradora maquina) {
        return maquinaDAO.save(maquina);
    }

    @Override
    public MaquinaRegistradora updateMaquina(int codigo, MaquinaRegistradora maquina) {
        MaquinaRegistradora existingMaquina = getMaquinaByCodigo(codigo);
        if (existingMaquina != null) {
            existingMaquina.setPiso(maquina.getPiso());
            return maquinaDAO.save(existingMaquina);
        }
        return null;
    }

    @Override
    public void deleteMaquina(int codigo) {
        maquinaDAO.deleteById(codigo);
    }
}