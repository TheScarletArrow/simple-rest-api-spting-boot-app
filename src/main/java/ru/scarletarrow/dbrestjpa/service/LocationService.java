package ru.scarletarrow.dbrestjpa.service;



import ru.scarletarrow.dbrestjpa.entity.Location;

import java.util.List;

public interface LocationService {
    public List<Location> getAllLocations();

    public void saveLocation(Location location);

    public Location getLocation(int id);

    public void deleteLocation(int id);

    public List<Location> findByTypeidEqualsAndTypeidNotNull(int type_id);
}
