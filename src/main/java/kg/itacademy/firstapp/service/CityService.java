package kg.itacademy.firstapp.service;

import kg.itacademy.firstapp.entity.City;

import java.util.List;

public interface CityService {
    List<City> getAll();
    City getById(Long id);
    City create(City city);
    City update(City city);
    void deleteById(Long id);
}
