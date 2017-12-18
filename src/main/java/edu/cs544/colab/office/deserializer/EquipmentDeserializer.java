package edu.cs544.colab.office.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import edu.cs544.colab.equipment.domain.AbstractEquipment;
import edu.cs544.colab.equipment.domain.Equipment;

import java.io.IOException;

/**
 * Created by Grimg on 12/16/2017.
 */
public class EquipmentDeserializer extends JsonDeserializer<Equipment>{
    @Override
    public Equipment deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {



        return null;
    }
}
