package ru.scarletarrow.dbrestjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.scarletarrow.dbrestjpa.dao.OperatorRepository;
import ru.scarletarrow.dbrestjpa.entity.Operator;

import java.util.List;

@Service
public class OperatorServiceImpl implements OperatorService{

    @Autowired
    private OperatorRepository operatorRepository;

    @Override
    public List<Operator> getAllOperators() {
        return operatorRepository.findAll();

    }

    @Override
    public Operator getOperatorById(int id) {
        return operatorRepository.getById(id);
    }
}
