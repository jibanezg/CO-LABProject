package edu.cs544.colab.office.service;

import edu.cs544.colab.office.dao.OfficeDAO;
import edu.cs544.colab.office.domain.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by Grimg on 12/15/2017.
 */
@Service
public class OfficeService implements IOfficeService {

    @Autowired
    private OfficeDAO officeDao;

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE,propagation = Propagation.REQUIRES_NEW)
    public void publishOffice(Office t) {
        officeDao.save(t);
    }

    @Override
    @Transactional(isolation = Isolation.READ_UNCOMMITTED, propagation = Propagation.REQUIRES_NEW)
    public List<Office> retrieveAllOffice() {
        return officeDao.findAll();
    }

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.REQUIRES_NEW)
    public Office findOfficeById(String officeId) {
        return officeDao.findOfficeById(officeId);
    }
}
