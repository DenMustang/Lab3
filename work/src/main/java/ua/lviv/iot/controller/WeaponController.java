package ua.lviv.iot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.model.Weapons;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/weapons")
@RestController
public class WeaponController {

    private static final Map<Integer, Weapons> weaponsHashMap = new HashMap<>();

    private static AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public final List<Weapons> getWeapons() {
        return new LinkedList<>(weaponsHashMap.values());
    }

    @GetMapping(path = "/{id}")
    public final Weapons getWeaponById(final @PathVariable("id") Integer weaponId) {
        return weaponsHashMap.get(weaponId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final Weapons createWeapons(final @RequestBody Weapons weapons) {
        weapons.setId(idCounter.incrementAndGet());
        weaponsHashMap.put(weapons.getId(), weapons);
        return weapons;
    }

    @DeleteMapping(path = "/{id}")
    public final ResponseEntity<Object> deleteWeapons(final @PathVariable("id") Integer weaponsId) {
        HttpStatus status = weaponsHashMap.remove(weaponsId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public final Weapons updateWeapons(final @PathVariable("id") Integer weaponsId,
                                       final @RequestBody Weapons weapons) {
        weapons.setId(weaponsId);
        return weaponsHashMap.put(weaponsId, weapons);
    }

}
