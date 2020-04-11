package kg.itacademy.firstapp.service;

import kg.itacademy.firstapp.entity.City;
import kg.itacademy.firstapp.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public City getById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public City create(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City update(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteById(Long id) {
        cityRepository.deleteById(id);
    }
}
