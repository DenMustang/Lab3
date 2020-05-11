package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Weapons;

@Repository
public interface WeaponsRepository extends JpaRepository<Weapons, Integer> {
}
