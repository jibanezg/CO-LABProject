package edu.cs544.colab.equipment.domain;

import edu.cs544.colab.office.domain.Office;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Grimg on 12/16/2017.
 */
@Entity
@Component
@DiscriminatorValue(value = "Miscellaneous")
public class MiscellaneousEquipment extends AbstractEquipment{

    public MiscellaneousEquipment(){
        super();
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Office getOffice() {
        return super.getOffice();
    }

    @Override
    public void setOffice(Office office) {
        super.setOffice(office);
    }
}
