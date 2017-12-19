package edu.cs544.colab.office.dao;

import edu.cs544.colab.office.domain.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Grimg on 12/15/2017.
 */
@Repository
public interface OfficeDAO<T extends Office> extends JpaRepository<T, String> {

    T save(T office);
    List<T> findAll();	
}
