package edu.cs544.colab.office.controller;

import edu.cs544.colab.office.domain.Office;
import edu.cs544.colab.office.service.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by Grimg on 12/15/2017.
 */
@Controller
public class ServiceController {

    @Autowired
    private IOfficeService officeService;

    @PostMapping(value = "/offices", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void publishOfficeAsJson(@RequestBody @NotNull @Valid Office office, BindingResult result){
        officeService.publishOffice(office);
    }

    @PostMapping(value = "/offices", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public String publishOfficeAsFormUrlEncoded(@NotNull @Valid Office office, BindingResult result){


        officeService.publishOffice(office);
        return "officeSuccess";
    }

    @GetMapping(value = "/office")
    public ModelAndView showOfficeView(ModelAndView model){
        model.addObject(new Office());
        model.setViewName("office");
        return model;
    }

}
