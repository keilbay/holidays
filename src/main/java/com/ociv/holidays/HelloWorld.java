/**
 * 
 */
package com.ociv.holidays;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ociv.holidays.service.CountryService;
import com.ociv.holidays.service.dto.CountryDTO;

/**
 * @author Gaby
 *
 */
@RestController
@RequestMapping("/api")
public class HelloWorld {
	
    @Inject
    private CountryService countryService;
	
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    ResponseEntity<String> helloWorld() {
    	
    	CountryDTO country = countryService.findOne(64L);
    	
        return new ResponseEntity<String>(country.toString(), HttpStatus.OK);
    }

}
