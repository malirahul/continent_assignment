package com.continent.jsons.entity;

import lombok.Data;

import java.util.List;

@Data
public class Continent {

    private String code;
    private String name;
    private Long areaSqKm;
    private Long population;
    private List<String> lines;
    private int countries;
    private List<String> oceans;
    private List<String> developedCountries;
}
