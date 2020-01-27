package cl.earthquake.test.sismos.controller;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.earthquake.test.sismos.dto.SismoFecha;
import cl.earthquake.test.sismos.dto.SismoMagnitud;
import cl.earthquake.test.sismos.service.ConsultaService;


@RestController
@RequestMapping("/consulta/sismos")
public class ConsultaController {
	
	private static final Logger logger = LoggerFactory.getLogger(ConsultaController.class);
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	
	@Autowired		
    private ConsultaService consultaService;
	
	
	   @PostMapping(path="/fechas")
	   @ResponseBody   
	    public ResponseEntity<Object>  getSismosByFechas(@RequestBody SismoFecha sismoFecha){
		   
	        logger.info("getSismosByFechas: "+ sismoFecha.getStarttime() + " "+ sismoFecha.getEndtime());

	        try{
	            LocalDate fecIni = LocalDate.parse(sismoFecha.getStarttime(), formatter);
	            LocalDate fecFin = LocalDate.parse(sismoFecha.getEndtime(), formatter);

	            return new ResponseEntity<>(consultaService.getSismosbyFecha(fecIni, fecFin), HttpStatus.OK);
	        }
	        catch(Exception e){
	            logger.error("Error al obtener sismos por fechas [Exception]: "+e.getMessage());
	            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_IMPLEMENTED);
	        }

	    }
	  
	   @PostMapping(path="/magnitudes")
	    @ResponseBody
	    public ResponseEntity<Object> getSismosByMagnitudes(@RequestBody SismoMagnitud sismoMagnitud){   		   
		   
		   logger.info("getSismosByMagnitudes: "+ sismoMagnitud.getMinMagnitude() + " "+sismoMagnitud.getMaxMagnitude());

	        try{
	            DecimalFormatSymbols formatoSym = new DecimalFormatSymbols(Locale.getDefault());
	            formatoSym.setDecimalSeparator('.');
	            formatoSym.setGroupingSeparator(' ');

	            DecimalFormat formatter = new DecimalFormat("#0.0", formatoSym);
	            String minMag = formatter.format(sismoMagnitud.getMinMagnitude() );
	            String maxMag = formatter.format(sismoMagnitud.getMaxMagnitude());

	            
	            return new ResponseEntity<>(consultaService.getSismosbyMagnitud(minMag, maxMag), HttpStatus.OK);

	        }
	        catch(Exception e){
	            logger.error("Error al obtener sismos por magnitud [Exception]: "+e.getMessage());
	            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_IMPLEMENTED);
	        }


	    }
	   @PostMapping(path="/fecha/hoy")
	   @ResponseBody   
	    public ResponseEntity<Object>  getSismosByFechaHoy(){
		   LocalDate fechaDeHoy = LocalDate.now();
		   
	        logger.info("getSismosByFechaHoy: "+ fechaDeHoy );

	        try{

	            return new ResponseEntity<>(consultaService.getSismosByFechaHoy(fechaDeHoy), HttpStatus.OK);
	        }
	        catch(Exception e){
	            logger.error("Error al obtener sismos por fechas [Exception]: "+e.getMessage());
	            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_IMPLEMENTED);
	        }

	    }

}
