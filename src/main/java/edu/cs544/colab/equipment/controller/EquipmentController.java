package edu.cs544.colab.equipment.controller;

import edu.cs544.colab.equipment.domain.AbstractEquipment;
import edu.cs544.colab.equipment.service.IEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by Grimg on 12/17/2017.
 */
@Controller
public class EquipmentController {

    @Autowired
    private AbstractEquipment equipment;

    @Autowired
    private IEquipmentService equipmentService;

    @PostMapping(value = "/equipments")
    public void createEquipment(@RequestBody @NotNull @Valid AbstractEquipment equipment){
        equipmentService.addEquipment(equipment);
    }

    @GetMapping(value = "/AddEquipment/{officeId}")
    public ModelAndView showEquipmentView(@PathVariable String officeId, ModelAndView model){
        equipment.getOffice().setId(officeId);
        model.addObject(equipment);
        model.setViewName("equipmentAdd");
        return model;
    }

    @GetMapping(value = "/ListEquipment/{officeId}")
    public ModelAndView showEquipmentListView(@PathVariable String officeId, ModelAndView model){
        model.addObject("equipmentList",equipmentService.retrieveEquipment(officeId));
        model.setViewName("equipmentList");
        return model;
    }
}
