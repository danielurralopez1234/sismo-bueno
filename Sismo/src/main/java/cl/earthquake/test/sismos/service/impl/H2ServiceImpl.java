package cl.earthquake.test.sismos.service.impl;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import cl.earthquake.test.sismos.dto.Features;
import cl.earthquake.test.sismos.service.H2Service;

@Service
public class H2ServiceImpl implements H2Service {

	@Override
	public void insertSysmo(Object obj) throws Exception {
		
		Gson gson = new Gson();
		
		Features features = gson.fromJson(obj.toString(), Features.class);
		
	}

}
