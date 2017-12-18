package edu.cs544.colab.office.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.cs544.colab.equipment.domain.Equipment;
import edu.cs544.colab.office.enums.OfficeStatus;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Grimg on 12/15/2017.
 */
@Entity
@Component
public class Office {

    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    @NotNull
    private String name;
    @Min(value = 1)
    private double price;
    @Embedded
    @NotNull
    @Valid
    private Location location;
    private String description;
    @NotNull
    @Enumerated(value = EnumType.STRING)
    private OfficeStatus status;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "office")
    @JsonDeserialize()
    private List<Equipment> equipment;

    public Office(){

        equipment = new LinkedList<>();
        location = new Location();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OfficeStatus getStatus() {
        return status;
    }

    public void setStatus(OfficeStatus status) {
        this.status = status;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
