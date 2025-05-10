package com.epam.edai.run8.team18.controller;

import com.epam.edai.run8.team18.model.Table;
import com.epam.edai.run8.team18.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tables")
public class TableController {

    private final TableService tableService;

    @Autowired
    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @PostMapping
    public ResponseEntity<Table> createTable(@RequestBody Table table) {
        Table savedTable = tableService.saveTable(table);
        return ResponseEntity.ok(savedTable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Table> getTable(@PathVariable Long id) {
        Optional<Table> table = tableService.getTable(id);
        return table.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTable(@PathVariable Long id) {
        tableService.deleteTable(id);
        return ResponseEntity.noContent().build();
    }
}