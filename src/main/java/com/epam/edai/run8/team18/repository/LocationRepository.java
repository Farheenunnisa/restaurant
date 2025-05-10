package com.epam.edai.run8.team18.repository;

import com.epam.edai.run8.team18.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
}