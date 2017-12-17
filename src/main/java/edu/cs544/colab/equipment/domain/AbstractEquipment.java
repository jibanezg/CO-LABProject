package edu.cs544.colab.equipment.domain;

import edu.cs544.colab.equipment.domain.Equipment;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Grimg on 12/15/2017.
 */
@MappedSuperclass
public abstract class AbstractEquipment implements Equipment {



    private String id;
    private int quantity;
    private String name;
    private String description;


}
