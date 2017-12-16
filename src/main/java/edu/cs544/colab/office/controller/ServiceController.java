package edu.cs544.colab.office.controller;

import edu.cs544.colab.office.domain.Office;
import edu.cs544.colab.office.service.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by Grimg on 12/15/2017.
 */
@Controller
public class ServiceController {

    @Autowired
    private IOfficeService officeService;

    @PostMapping(value = "/office", consumes = "application/json")
    public void publishOffice(@RequestBody @NotNull @Valid Office office, BindingResult result){
        officeService.publishOffice(office);
    }
}
