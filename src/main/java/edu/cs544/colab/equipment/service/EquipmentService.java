package edu.cs544.colab.equipment.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Grimg on 12/18/2017.
 */
@Service
public class EquipmentService<K,V> implements IEquipmentService<K,V>{
    @Override
    public List<V> retrieveEquipment(K officeId) {
        return null;
    }

    @Override
    public void addEquipment(V equipment) {

    }
}
