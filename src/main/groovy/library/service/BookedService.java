package library.service;
import library.models.Booked;
import library.repository.BookedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedService {
    @Autowired
    private BookedRepository bookedRepository;

    public List<Booked> getAllBooked() {
        return bookedRepository.findAll();
    }

    public Booked addBooked(Booked booked) {
        return bookedRepository.save(booked);
    }
}
