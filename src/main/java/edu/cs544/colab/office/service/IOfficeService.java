package edu.cs544.colab.office.service;

import java.util.List;

/**
 * Created by Grimg on 12/15/2017.
 */

public interface IOfficeService <T>{

    void publishOffice(T office);
    List<T> find();

}
