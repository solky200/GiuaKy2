package org.example.demo22.service;

import org.example.demo22.model.Computer;

import java.util.List;
import java.util.Optional;

public interface IComputerService {
    List<Computer> findAll();
    List<Computer>findByName(String name);
    Optional<Computer> findById(int id);
    void delete(int id);
    void update(Computer student);
    void create(Computer student);
}
