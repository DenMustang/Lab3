package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.model.Weapons;
import ua.lviv.iot.repository.WeaponsRepository;

import java.util.List;

@Service
public class WeaponsService {

    @Autowired
    private WeaponsRepository weaponsRepository;

    public List getWeapons() {
        return weaponsRepository.findAll();
    }

    public final Weapons getWeaponsById(Integer weaponsId) {
        return weaponsRepository.findById(weaponsId).get();
    }

    public Weapons createWeapons(Weapons weapons) {
        return weaponsRepository.save(weapons);
    }

    public final void deleteWeaponsById(Integer weaponrId) {
        weaponsRepository.deleteById(weaponrId);
    }

    public final Weapons updateWeaponById(Integer weaponId, Weapons newWeapon) {

        if (weaponsRepository.existsById(weaponId)) {
            Weapons weapon = weaponsRepository.findById(weaponId).orElseThrow(NullPointerException::new);
            //weapon.setColor(newFlower.getColor());
            weapon.setTypeOfWeapon(newWeapon.getTypeOfWeapon());
            weapon.setAge(newWeapon.getAge());
            weapon.setAuthor(newWeapon.getAuthor());
            weapon.setDecade(newWeapon.getDecade());
            weapon.setDescription(newWeapon.getDescription());
            weapon.setId(weaponId);
            weapon.setMeasureInMm(newWeapon.getMeasureInMm());
            weapon.setWeightInKg(newWeapon.getWeightInKg());
            weaponsRepository.save(weapon);
            return weapon;
        } else {
            return null;
        }
    }

}
