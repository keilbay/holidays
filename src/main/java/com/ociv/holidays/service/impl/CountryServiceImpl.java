package com.ociv.holidays.service.impl;

import com.ociv.holidays.service.CountryService;
import com.ociv.holidays.domain.Country;
import com.ociv.holidays.repository.CountryRepository;
import com.ociv.holidays.service.dto.CountryDTO;
import com.ociv.holidays.service.mapper.CountryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Service Implementation for managing Country.
 */
@Service
@Transactional
public class CountryServiceImpl implements CountryService {

    private final Logger log = LoggerFactory.getLogger(CountryServiceImpl.class);
    
    @Inject
    private CountryRepository countryRepository;

    @Inject
    private CountryMapper countryMapper;
    

    /**
     * Save a country.
     *
     * @param countryDTO the entity to save
     * @return the persisted entity
     */
    public CountryDTO save(CountryDTO countryDTO) {
        log.debug("Request to save Country : {}", countryDTO);
        Country country = countryMapper.countryDTOToCountry(countryDTO);
        country = countryRepository.save(country);
        CountryDTO result = countryMapper.countryToCountryDTO(country);
        return result;
    }

    /**
     *  Get all the countries.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    @Transactional(readOnly = true) 
    public Page<CountryDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Countries");
        Page<Country> result = countryRepository.findAll(pageable);
        return result.map(country -> countryMapper.countryToCountryDTO(country));
    }

    /**
     *  Get one country by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Transactional(readOnly = true) 
    public CountryDTO findOne(Long id) {
        log.debug("Request to get Country : {}", id);
        Country country = countryRepository.findOne(id);
        CountryDTO countryDTO = countryMapper.countryToCountryDTO(country);
        return countryDTO;
    }

    /**
     *  Delete the  country by id.
     *
     *  @param id the id of the entity
     */
    public void delete(Long id) {
        log.debug("Request to delete Country : {}", id);
        countryRepository.delete(id);
    }

    /**
     * Search for the country corresponding to the query.
     *
     *  @param query the query of the search
     *  @return the list of entities
     *
    @Transactional(readOnly = true)
    public Page<CountryDTO> search(String query, Pageable pageable) {
        log.debug("Request to search for a page of Countries for query {}", query);
        Page<Country> result = countrySearchRepository.search(queryStringQuery(query), pageable);
        return result.map(country -> countryMapper.countryToCountryDTO(country));
    }*/
}
