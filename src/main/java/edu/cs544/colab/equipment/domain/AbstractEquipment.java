package edu.cs544.colab.equipment.domain;

import edu.cs544.colab.office.domain.Office;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Grimg on 12/15/2017.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "equipment_type", discriminatorType = DiscriminatorType.STRING)
public abstract class AbstractEquipment {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    private int quantity;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "officeId")
    private Office office;

    public AbstractEquipment(){
        office = new Office();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
