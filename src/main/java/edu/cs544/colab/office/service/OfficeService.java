package edu.cs544.colab.office.service;

import edu.cs544.colab.office.dao.OfficeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by Grimg on 12/15/2017.
 */
@Service
public class OfficeService<T> implements IOfficeService<T> {

    @Autowired
    private OfficeDAO officeDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void publishOffice(T office) {

        officeDao.save(office);

    }

    @Override
    public List<T> retrieveAllOffice() {
        return officeDao.findAll();
    }
}
