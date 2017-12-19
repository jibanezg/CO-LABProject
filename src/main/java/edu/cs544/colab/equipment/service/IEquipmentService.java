package edu.cs544.colab.equipment.service;

import edu.cs544.colab.equipment.domain.AbstractEquipment;

import java.util.List;

/**
 * Created by Grimg on 12/17/2017.
 */
public interface IEquipmentService{

    List<AbstractEquipment> retrieveEquipment(String officeId);

    void addEquipment(AbstractEquipment t);

}
