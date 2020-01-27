package cl.earthquake.test.sismos.service;

import java.time.LocalDate;


public interface ConsultaService {
	
	Object getSismosbyFecha(LocalDate fecIni, LocalDate fecFin) throws Exception;
    Object getSismosbyMagnitud(String minMag, String maxMag) throws Exception;
    Object getSismosByFechaHoy(LocalDate fechaDeHoy) throws Exception;

}

