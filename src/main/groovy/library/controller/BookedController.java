package library.controller;
import library.models.Booked;
import library.repository.BookedRepository;
import library.service.BookedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booked")
public class BookedController {
    @Autowired
    private BookedService bookedService;

    @GetMapping
    public List<Booked> getAllBooked() {
        return bookedService.getAllBooked();
    }

    @PostMapping
    public Booked addBooked(@RequestBody Booked booked) {
        return bookedService.addBooked(booked);
    }
}