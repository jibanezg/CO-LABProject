package edu.cs544.colab.equipment.service;

import edu.cs544.colab.equipment.dao.EquipmentDAO;
import edu.cs544.colab.equipment.domain.AbstractEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Grimg on 12/18/2017.
 */
@Service
public class EquipmentService implements IEquipmentService{

    @Autowired
    private EquipmentDAO equipmentDao;


    @Override
    public List<AbstractEquipment> retrieveEquipment(String officeId) {
        return equipmentDao.findByOfficeId(officeId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addEquipment(AbstractEquipment t) {
        equipmentDao.save(t);
    }
}
