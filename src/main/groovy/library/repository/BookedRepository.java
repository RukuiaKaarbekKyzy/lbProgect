package library.repository;

import library.models.Booked;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookedRepository extends JpaRepository<Booked, Long> {
}
