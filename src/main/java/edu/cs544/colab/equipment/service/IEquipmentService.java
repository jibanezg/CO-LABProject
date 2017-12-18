package edu.cs544.colab.equipment.service;

import java.util.List;

/**
 * Created by Grimg on 12/17/2017.
 */
public interface IEquipmentService <K,V>{

    List<V> retrieveEquipment(K officeId);

    void addEquipment(V equipment);
}
