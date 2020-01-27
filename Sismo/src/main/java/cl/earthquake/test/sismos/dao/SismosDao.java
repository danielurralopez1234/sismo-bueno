package cl.earthquake.test.sismos.dao;

import cl.earthquake.test.sismos.entitys.SismosEntity;
import org.springframework.data.repository.CrudRepository;

public interface SismosDao extends CrudRepository<SismosEntity, Long> {
}
