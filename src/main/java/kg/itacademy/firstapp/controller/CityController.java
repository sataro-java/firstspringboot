package kg.itacademy.firstapp.controller;

import kg.itacademy.firstapp.entity.City;
import kg.itacademy.firstapp.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city") // localhost:8080/city
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getAll() {
        return cityService.getAll();
    }

    @GetMapping("/{id}") // localhost:8080/city/5
    public City getById(@PathVariable Long id) {
        return cityService.getById(id);
    }

    @PostMapping
    public City create(@RequestBody City city) {
        return cityService.create(city);
    }

    @PutMapping
    public City update(@RequestBody City city) {
        return cityService.update(city);
    }

    @DeleteMapping("/{id}") //localhost:8080/city/5
    public void deleteById(@PathVariable Long id) {
        cityService.deleteById(id);
    }
}
