package com.ociv.holidays.domain;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Country.
 */
@Entity
@Table(name = "country")
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

    @NotNull
    @Size(max = 100)
    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Size(max = 100)
    @Column(name = "formal_name", length = 100)
    private String formalName;

    @Size(max = 100)
    @Column(name = "type", length = 100)
    private String type;

    @Size(max = 100)
    @Column(name = "sub_type", length = 100)
    private String subType;

    @Size(max = 100)
    @Column(name = "sovereignty", length = 100)
    private String sovereignty;

    @Size(max = 100)
    @Column(name = "capital", length = 100)
    private String capital;

    @Size(max = 20)
    @Column(name = "currency_code", length = 20)
    private String currencyCode;

    @Size(max = 100)
    @Column(name = "currency_name", length = 100)
    private String currencyName;

    @Size(max = 20)
    @Column(name = "telephone_code", length = 20)
    private String telephoneCode;

    @NotNull
    @Size(max = 5)
    @Column(name = "iso_letter_code_2", length = 5, nullable = false)
    private String isoLetterCode2;

    @NotNull
    @Size(max = 5)
    @Column(name = "iso_letter_code_3", length = 5, nullable = false)
    private String isoLetterCode3;

    @Size(max = 5)
    @Column(name = "iso_number_code", length = 5)
    private String isoNumberCode;

    @Size(max = 20)
    @Column(name = "country_code_tld", length = 20)
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

    public Country sortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getName() {
        return name;
    }

    public Country name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormalName() {
        return formalName;
    }

    public Country formalName(String formalName) {
        this.formalName = formalName;
        return this;
    }

    public void setFormalName(String formalName) {
        this.formalName = formalName;
    }

    public String getType() {
        return type;
    }

    public Country type(String type) {
        this.type = type;
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public Country subType(String subType) {
        this.subType = subType;
        return this;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getSovereignty() {
        return sovereignty;
    }

    public Country sovereignty(String sovereignty) {
        this.sovereignty = sovereignty;
        return this;
    }

    public void setSovereignty(String sovereignty) {
        this.sovereignty = sovereignty;
    }

    public String getCapital() {
        return capital;
    }

    public Country capital(String capital) {
        this.capital = capital;
        return this;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public Country currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public Country currencyName(String currencyName) {
        this.currencyName = currencyName;
        return this;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getTelephoneCode() {
        return telephoneCode;
    }

    public Country telephoneCode(String telephoneCode) {
        this.telephoneCode = telephoneCode;
        return this;
    }

    public void setTelephoneCode(String telephoneCode) {
        this.telephoneCode = telephoneCode;
    }

    public String getIsoLetterCode2() {
        return isoLetterCode2;
    }

    public Country isoLetterCode2(String isoLetterCode2) {
        this.isoLetterCode2 = isoLetterCode2;
        return this;
    }

    public void setIsoLetterCode2(String isoLetterCode2) {
        this.isoLetterCode2 = isoLetterCode2;
    }

    public String getIsoLetterCode3() {
        return isoLetterCode3;
    }

    public Country isoLetterCode3(String isoLetterCode3) {
        this.isoLetterCode3 = isoLetterCode3;
        return this;
    }

    public void setIsoLetterCode3(String isoLetterCode3) {
        this.isoLetterCode3 = isoLetterCode3;
    }

    public String getIsoNumberCode() {
        return isoNumberCode;
    }

    public Country isoNumberCode(String isoNumberCode) {
        this.isoNumberCode = isoNumberCode;
        return this;
    }

    public void setIsoNumberCode(String isoNumberCode) {
        this.isoNumberCode = isoNumberCode;
    }

    public String getCountryCodeTld() {
        return countryCodeTld;
    }

    public Country countryCodeTld(String countryCodeTld) {
        this.countryCodeTld = countryCodeTld;
        return this;
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
        Country country = (Country) o;
        if(country.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, country.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Country{" +
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
