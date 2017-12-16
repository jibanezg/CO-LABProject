package office.cs544.colab.dao;

import office.cs544.colab.domain.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Grimg on 12/15/2017.
 */
@Repository
public interface OfficeDAO extends JpaRepository<Office, String> {

    Office save(Office office);
}
