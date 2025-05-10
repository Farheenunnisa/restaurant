package com.epam.edai.run8.team18.service;

import com.epam.edai.run8.team18.model.Table;
import com.epam.edai.run8.team18.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TableService {

    private final TableRepository tableRepository;

    @Autowired
    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public Table saveTable(Table table) {
        return tableRepository.save(table);
    }

    public Optional<Table> getTable(Long id) {
        return tableRepository.findById(id);
    }

    public void deleteTable(Long id) {
        tableRepository.deleteById(id);
    }
}