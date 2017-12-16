package office.cs544.colab.service;

import office.cs544.colab.dao.OfficeDAO;
import office.cs544.colab.domain.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Grimg on 12/15/2017.
 */
@Service
public class ServiceOffice implements IOfficeService{

    @Autowired
    private OfficeDAO officeDao;

    @Override
    public void publishOffice(Office office) {

        officeDao.save(office);

    }
}
