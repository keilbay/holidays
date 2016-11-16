package com.ociv.holidays.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the Country entity.
 */
public class CountryDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer sortOrder;

    @NotNull
    @Size(max = 100)
    private String name;

    @Size(max = 100)
    private String formalName;

    @Size(max = 100)
    private String type;

    @Size(max = 100)
    private String subType;

    @Size(max = 100)
    private String sovereignty;

    @Size(max = 100)
    private String capital;

    @Size(max = 20)
    private String currencyCode;

    @Size(max = 100)
    private String currencyName;

    @Size(max = 20)
    private String telephoneCode;

    @NotNull
    @Size(max = 5)
    private String isoLetterCode2;

    @NotNull
    @Size(max = 5)
    private String isoLetterCode3;

    @Size(max = 5)
    private String isoNumberCode;

    @Size(max = 20)
    private String countryCodeTld;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getFormalName() {
        return formalName;
    }

    public void setFormalName(String formalName) {
        this.formalName = formalName;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }
    public String getSovereignty() {
        return sovereignty;
    }

    public void setSovereignty(String sovereignty) {
        this.sovereignty = sovereignty;
    }
    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
    public String getTelephoneCode() {
        return telephoneCode;
    }

    public void setTelephoneCode(String telephoneCode) {
        this.telephoneCode = telephoneCode;
    }
    public String getIsoLetterCode2() {
        return isoLetterCode2;
    }

    public void setIsoLetterCode2(String isoLetterCode2) {
        this.isoLetterCode2 = isoLetterCode2;
    }
    public String getIsoLetterCode3() {
        return isoLetterCode3;
    }

    public void setIsoLetterCode3(String isoLetterCode3) {
        this.isoLetterCode3 = isoLetterCode3;
    }
    public String getIsoNumberCode() {
        return isoNumberCode;
    }

    public void setIsoNumberCode(String isoNumberCode) {
        this.isoNumberCode = isoNumberCode;
    }
    public String getCountryCodeTld() {
        return countryCodeTld;
    }

    public void setCountryCodeTld(String countryCodeTld) {
        this.countryCodeTld = countryCodeTld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CountryDTO countryDTO = (CountryDTO) o;

        if ( ! Objects.equals(id, countryDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "CountryDTO{" +
            "id=" + id +
            ", sortOrder='" + sortOrder + "'" +
            ", name='" + name + "'" +
            ", formalName='" + formalName + "'" +
            ", type='" + type + "'" +
            ", subType='" + subType + "'" +
            ", sovereignty='" + sovereignty + "'" +
            ", capital='" + capital + "'" +
            ", currencyCode='" + currencyCode + "'" +
            ", currencyName='" + currencyName + "'" +
            ", telephoneCode='" + telephoneCode + "'" +
            ", isoLetterCode2='" + isoLetterCode2 + "'" +
            ", isoLetterCode3='" + isoLetterCode3 + "'" +
            ", isoNumberCode='" + isoNumberCode + "'" +
            ", countryCodeTld='" + countryCodeTld + "'" +
            '}';
    }
}
