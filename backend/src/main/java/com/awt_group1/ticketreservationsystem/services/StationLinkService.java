package com.awt_group1.ticketreservationsystem.services;

import com.awt_group1.ticketreservationsystem.entities.Customer;
import com.awt_group1.ticketreservationsystem.entities.StationLink;
import com.awt_group1.ticketreservationsystem.repositories.CustomerRepository;
import com.awt_group1.ticketreservationsystem.repositories.StationLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.List;

public class StationLinkService {
    @Autowired
    StationLinkRepository stationLinkRepository;

    public StationLinkService() { }

    public Optional<StationLink> getById(String id) { return this.stationLinkRepository.findById(id); }

    public List<StationLink> getAll() { return this.stationLinkRepository.findAll(); }

    public void removeById(String id) { this.stationLinkRepository.deleteById(id); }

    public void update(StationLink stationLink) {
        stationLinkRepository.save(stationLink);
    }

    public void add(StationLink stationLink) {
        stationLinkRepository.save(stationLink);
    }
}