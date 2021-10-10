package com.sam.learningspring.repository;

import com.sam.learningspring.model.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<DataModel, Integer> {
    DataModel findDataById(Integer id);
}
