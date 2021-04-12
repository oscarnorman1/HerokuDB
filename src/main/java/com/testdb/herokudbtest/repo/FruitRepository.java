package com.testdb.herokudbtest.repo;

import com.testdb.herokudbtest.models.Fruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface FruitRepository extends CrudRepository<Fruit, Long> {

    List<Fruit> findAllByColor(String color);
    List<Fruit> findByColorAndId(String color, Long id);
    List<Fruit> findAll();

    @Transactional
    List<Fruit> deleteByColor(String color);

}

