package edu.cs544.colab.office.controller;

import edu.cs544.colab.office.domain.Office;
import edu.cs544.colab.office.dto.OfficeDTO;
import edu.cs544.colab.office.service.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Grimg on 12/15/2017.
 */
@Controller
public class OfficeController {

    @Autowired
    private IOfficeService officeService;

    @Autowired
    private OfficeDTO office;

    @PostMapping(value = "/offices", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void publishOfficeAsJson(@RequestBody @NotNull @Valid OfficeDTO office, BindingResult result){

        officeService.publishOffice(officeDtoToEntity(office));
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping(value = "/offices", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public String publishOfficeAsFormUrlEncoded(@NotNull @Valid OfficeDTO office, BindingResult result){

        officeService.publishOffice(officeDtoToEntity(office));
        return "redirect:officeSuccess";
    }

    private Office officeDtoToEntity(OfficeDTO office){

        Office entity = new Office();
        entity.setName(office.getName());
        entity.setDescription(office.getDescription());
        entity.setPrice(office.getPrice());
        entity.getLocation().setCity(office.getCity());
        entity.getLocation().setState(office.getState());
        entity.getLocation().setStreet(office.getStreet());
        entity.getLocation().setZipCode(office.getZipCode());
        entity.setStatus(office.getStatus());

        return entity;

    }

    @GetMapping(value = "/offices", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Office> listOfficeAsJson(){
        return officeService.retrieveAllOffice();
    }

    @GetMapping(value = "/AddOffice")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ModelAndView showAddOfficeView(ModelAndView model){
        model.addObject("office",office);
        model.setViewName("officeAdd");
        return model;
    }

    @GetMapping(value = "/ListOffice")
    public ModelAndView showOfficeListView(ModelAndView model){
        List<Office> officeList=officeService.retrieveAllOffice();
        if(officeList == null || officeList.size()<=0){
            model.setViewName("redirect:/AddOffice");
        }else {
            model.addObject("officeList",officeList);
            model.setViewName("officeList");
        }
        return model;
    }

    @GetMapping(value = "/officeSuccess")
    public String officeSuccess(){
        return "officeSuccess";
    }


}
