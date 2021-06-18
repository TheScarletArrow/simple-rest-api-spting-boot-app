package ru.scarletarrow.dbrestjpa.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import ru.scarletarrow.dbrestjpa.entity.Operator;

import java.util.List;

public interface OperatorRepository extends JpaRepository<Operator, Integer> {

}
