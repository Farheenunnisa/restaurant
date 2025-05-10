package com.epam.edai.run8.team18.service;

import com.epam.edai.run8.team18.model.Location;
import com.epam.edai.run8.team18.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    @Autowired
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    public Optional<Location> getLocation(Long id) {
        return locationRepository.findById(id);
    }

    public void deleteLocation(Long id) {
        locationRepository.deleteById(id);
    }
}