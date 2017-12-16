package edu.cs544.colab.office.service;

import edu.cs544.colab.office.dao.OfficeDAO;
import edu.cs544.colab.office.domain.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Grimg on 12/15/2017.
 */
@Service
public class ServiceOffice implements IOfficeService {

    @Autowired
    private OfficeDAO officeDao;

    @Override
    public void publishOffice(Office office) {

        officeDao.save(office);

    }
}
