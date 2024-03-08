package org.example.demo22.service;

import org.example.demo22.model.Computer;
import org.example.demo22.repository.RepoComputer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ComputerService implements IComputerService{
    @Autowired
    RepoComputer staffRepo;
    @Override
    public List<Computer> findAll() {
        return staffRepo.findAll();
    }

    @Override
    public List<Computer> findByName(String name) {
        return staffRepo.findAllByNameContaining(name);
    }

    @Override
    public Optional<Computer> findById(int id) {
        return staffRepo.findById(id);
    }

    @Override
    public void delete(int id) {
        staffRepo.deleteById(id);
    }

    @Override
    public void update(Computer staff) {
        staffRepo.save(staff);
    }

    @Override
    public void create(Computer staff) {
        staffRepo.save(staff);
    }
}
