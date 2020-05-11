package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.business.WeaponsService;
import ua.lviv.iot.model.Weapons;

import java.util.List;

@RequestMapping("/weapons")
@RestController
public class WeaponController {

    @Autowired
    private WeaponsService weaponsService;

    @GetMapping
    public final List getWeapons() {
        return weaponsService.getWeapons();
    }

    @GetMapping(path = "/{id}")
    public final Weapons getWeaponById(final @PathVariable("id") Integer weaponId) {
        return weaponsService.getWeaponsById(weaponId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final Weapons createWeapons(final @RequestBody Weapons weapons) {
        return weaponsService.createWeapons(weapons);
    }

    @DeleteMapping(path = "/{id}")
    public final void deleteFlowerById(final @PathVariable("id") Integer weaponId) {
        weaponsService.deleteWeaponsById(weaponId);
    }

    @PutMapping(path = "/{id}")
    public final ResponseEntity<Object> updateWeaponById(final @PathVariable("id") Integer weaponId,
                                                         final @RequestBody Weapons weapons) {

        Weapons weaponBeforeUpdate = weaponsService.getWeaponsById(weaponId);
        if (weaponBeforeUpdate == null) {
            return ResponseEntity.notFound().build();
        }

        weaponsService.updateWeaponById(weaponId, weapons);
        return ResponseEntity.ok(weaponBeforeUpdate);
    }

}
