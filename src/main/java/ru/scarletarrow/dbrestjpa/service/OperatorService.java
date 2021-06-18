package ru.scarletarrow.dbrestjpa.service;


import ru.scarletarrow.dbrestjpa.entity.Operator;

import java.util.List;

public interface OperatorService {
    List<Operator> getAllOperators();
    public Operator getOperatorById(int id);
}
