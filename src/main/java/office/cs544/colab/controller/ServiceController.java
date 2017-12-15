package office.cs544.colab.controller;

import office.cs544.colab.service.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Grimg on 12/15/2017.
 */
public class ServiceController {

    @Autowired
    private IOfficeService officeService;
}
