package ru.scarletarrow.dbrestjpa.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.scarletarrow.dbrestjpa.dao.LocationRepository;
import ru.scarletarrow.dbrestjpa.entity.Location;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

   // private Logger LOGGER = LoggerFactory.getLogger(LocationServiceImpl.class);

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public void saveLocation(Location location) {
        locationRepository.save(location);
    }

    @Override
    public Location getLocation(int id) {
        Location location = null;
        Optional<Location> locationOptional = (locationRepository.findById(id));
        if (locationOptional.isPresent()) location = locationOptional.get();
        return location;
    }

    @Override
    public void deleteLocation(int id) {
        locationRepository.deleteById(id);
    }

    @Override
    public List<Location> findByTypeidEqualsAndTypeidNotNull(int type_id) {
        return locationRepository.findByTypeidEqualsAndTypeidNotNull(type_id);
    }


}
