package ru.scarletarrow.dbrestjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ru.scarletarrow.dbrestjpa.entity.Location;
import ru.scarletarrow.dbrestjpa.entity.Operator;
import ru.scarletarrow.dbrestjpa.service.LocationService;
import ru.scarletarrow.dbrestjpa.service.OperatorService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIRESTController {

    @Autowired
    private LocationService locationService;

    @Autowired
    private OperatorService operatorService;




    @GetMapping("/locations")
    public List<Location> showAllLocations() {
        List<Location> allLocations = locationService.getAllLocations();
        return allLocations;
    }



    @GetMapping("/operators")
    public List<Operator> showALlOperators() {
        List<Operator> allOperators = operatorService.getAllOperators();

        return allOperators;
    }



    //    public Location getLocation(@PathVariable int id){
//        Location location = locationService.getLocation(id);
//
//        return location;
//    }
//
    @GetMapping("/locations/{id}")
    public Location getLocation(@PathVariable int id) {
        Location location = locationService.getLocation(id);

        return location;
    }
    @GetMapping("locations/ids/{id}")
    public List<Location> getLocationsWithTypeId(@PathVariable int id){
        List<Location> allLocations = locationService.findByTypeidEqualsAndTypeidNotNull(id);
        return allLocations;
    }


    @PostMapping("/locations")
    public Location addNewLocation(@RequestBody Location location){
        locationService.saveLocation(location);
        return location;
    }

    @PutMapping("/locations")
    public Location updateLocation(@RequestBody Location location){
        locationService.saveLocation(location);
        return location;
    }

    @DeleteMapping("/locations/{id}")
    public String deleteLocation(@PathVariable int id){
        locationService.deleteLocation(id);
        return String.format("Location with id %d was deleted", id);
    }

}
