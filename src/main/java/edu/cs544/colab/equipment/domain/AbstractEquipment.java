package edu.cs544.colab.equipment.domain;

import edu.cs544.colab.equipment.domain.Equipment;
import edu.cs544.colab.office.domain.Office;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Grimg on 12/15/2017.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "equipment_type")
public abstract class AbstractEquipment implements Equipment {


    private String id;
    private int quantity;
    private String name;
    private String description;
    private Office office;

    public AbstractEquipment(){
        office = new Office();
    }

    @Id
    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne
    @JoinColumn(name = "officeId")
    @Override
    public Office getOffice() {
        return office;
    }

    @Override
    public void setOffice(Office office) {
        this.office = office;
    }
}
