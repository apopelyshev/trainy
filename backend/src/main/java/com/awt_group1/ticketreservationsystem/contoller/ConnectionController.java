package com.awt_group1.ticketreservationsystem.contoller;


import com.awt_group1.ticketreservationsystem.model.Connection;
import com.awt_group1.ticketreservationsystem.model.ConnectionDTO;
import com.awt_group1.ticketreservationsystem.services.ConnectionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/connection")
public class ConnectionController {

    private final ConnectionService connectionService;

    public ConnectionController(ConnectionService connectionService) {
        this.connectionService = connectionService;
    }

    @GetMapping("/{id}")
    public ConnectionDTO getConnectionById(@PathVariable String id) { return connectionService.findById(id); }

    @DeleteMapping("/{id}")
    public void removeConnectionById(@PathVariable String id) { connectionService.deleteById(id); }

    @GetMapping("/all")
    public List<ConnectionDTO> getAllConnections() { return connectionService.findAll(); }

    @GetMapping("/between")
    public List<ConnectionDTO> getAllConnectionsBetween(
            @RequestParam String originId,
            @RequestParam String destinationId) {
        return connectionService.getAllConnectionFromTo(originId, destinationId);
    }
}