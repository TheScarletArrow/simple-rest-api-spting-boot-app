package ru.scarletarrow.dbrestjpa.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.scarletarrow.dbrestjpa.entity.Location;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Integer> {

    public List<Location> findByTypeidEqualsAndTypeidNotNull(int id);
}
