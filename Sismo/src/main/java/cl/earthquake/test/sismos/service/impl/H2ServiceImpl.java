package cl.earthquake.test.sismos.service.impl;

import cl.earthquake.test.sismos.dao.SismosDao;
import cl.earthquake.test.sismos.entitys.SismosEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import cl.earthquake.test.sismos.dto.Features;
import cl.earthquake.test.sismos.service.H2Service;

@Service
public class H2ServiceImpl implements H2Service {

	@Autowired
	private SismosDao sismosDao;


	@Override
	public void addSismosHoy(SismosEntity sismos) {
		sismosDao.save(sismos);
	}
}
