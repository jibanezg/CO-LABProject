package edu.cs544.colab.equipment.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Grimg on 12/15/2017.
 */

@Entity
public interface Equipment {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    String getId();
    void setId(String id);
    String getDescription();
    void setDescription(String description);
    int getQuantity();
    void setQuantity(int quantity);
    String getName();
    void setName(String name);
}
