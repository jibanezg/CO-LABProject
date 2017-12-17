package edu.cs544.colab.equipment.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Grimg on 12/16/2017.
 */
@Entity
public class MiscellaneousEquipment extends AbstractEquipment{
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    //@Override
    public String getId() {
        return null;
    }

    //@Override
    public void setId(String id) {

    }

    //@Override
    public String getDescription() {
        return null;
    }

    //@Override
    public void setDescription(String description) {

    }

    //@Override
    public int getQuantity() {
        return 0;
    }

    //@Override
    public void setQuantity(int quantity) {

    }

    //@Override
    public String getName() {
        return null;
    }

    //@Override
    public void setName(String name) {

    }
}
