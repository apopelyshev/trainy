package com.awt_group1.ticketreservationsystem.repositories;


import com.awt_group1.ticketreservationsystem.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, String> {
}
