package edu.cs544.colab.office.service;

import java.util.List;

import edu.cs544.colab.office.domain.Office;

/**
 * Created by Grimg on 12/15/2017.
 */

public interface IOfficeService {

    void publishOffice(Office office);
    List<Office> retrieveAllOffice();
    Office findOfficeById(String officeId);
   
}
