package edu.cs544.colab.equipment.dao;

import edu.cs544.colab.equipment.domain.AbstractEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Grimg on 12/18/2017.
 */
public interface EquipmentDAO extends JpaRepository<AbstractEquipment, String> {

    AbstractEquipment save(AbstractEquipment t);
    List<AbstractEquipment> findByOfficeId(String officeId);
}
