package edu.cs544.colab.equipment.controller;

import edu.cs544.colab.equipment.domain.AbstractEquipment;
import edu.cs544.colab.equipment.domain.MiscellaneousEquipment;
import edu.cs544.colab.equipment.dto.EquipmentDTO;
import edu.cs544.colab.equipment.service.IEquipmentService;
import edu.cs544.colab.office.domain.Office;
import edu.cs544.colab.office.service.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by Grimg on 12/17/2017.
 */
@Controller
public class EquipmentController {

    @Autowired
    private EquipmentDTO equipment;

    @Autowired
    private IEquipmentService equipmentService;
    @Autowired
    private IOfficeService officeService;

    @PostMapping(value = "/equipments", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createEquipmentAsJson(@RequestBody @NotNull @Valid EquipmentDTO equipment){
        equipmentService.addEquipment(equipmentDtoToEntity(equipment));
    }

    @PostMapping(value = "/equipments/{officeId}", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE,MediaType.TEXT_HTML_VALUE})
    public String createEquipmentAsFormUrlEncoded(@NotNull @Valid EquipmentDTO equipment,@PathVariable String officeId, BindingResult result){

        equipmentService.addEquipment(equipmentDtoToEntity(equipment,officeId));
        return "redirect:/equipmentSuccess";
    }

    private AbstractEquipment equipmentDtoToEntity(EquipmentDTO equipment, String officeId){
        AbstractEquipment entity = new MiscellaneousEquipment();
        entity.setDescription(equipment.getDescription());
        entity.setName(equipment.getName());
        entity.setQuantity(equipment.getQuantity());
        Office office = officeService.findOfficeById(officeId);
        //*******************PREGUNTAR AL PROFESOR SI ESTO ES NORMAL O SI BIEN SE DEBE HACER ALGO CON HIBERNATE*******************
        //Office office = new Office();
        //office.setId(officeId);
        entity.setOffice(office);

        return entity;
    }

    private AbstractEquipment equipmentDtoToEntity(EquipmentDTO equipment){
        AbstractEquipment entity = new MiscellaneousEquipment();
        entity.setDescription(equipment.getDescription());
        entity.setName(equipment.getName());
        entity.setQuantity(equipment.getQuantity());
        Office office = officeService.findOfficeById(equipment.getOfficeId());
        //*******************PREGUNTAR AL PROFESOR SI ESTO ES NORMAL O SI BIEN SE DEBE HACER ALGO CON HIBERNATE*******************
        //Office office = new Office();
        //office.setId(officeId);
        entity.setOffice(office);

        return entity;
    }

    @Secured("hasAuthority('ADMIN')")
    @GetMapping(value = "/AddEquipment/{officeId}")
    public ModelAndView showEquipmentAddView(@PathVariable String officeId, ModelAndView model){
        equipment.setOfficeId(officeId);
        model.addObject("equipment",equipment);
        model.setViewName("equipmentAdd");
        return model;
    }

    @GetMapping(value = "/ListEquipment/{officeId}")
    public ModelAndView showEquipmentListView(@PathVariable String officeId, ModelAndView model){
        model.addObject("equipmentList",equipmentService.retrieveEquipment(officeId));
        model.setViewName("equipmentList");
        return model;
    }

    @GetMapping(value = "/equipmentSuccess")
    public String officeSuccess(){
        return "equipmentSuccess";
    }
}
