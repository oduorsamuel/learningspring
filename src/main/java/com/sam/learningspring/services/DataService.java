package com.sam.learningspring.services;

import com.sam.learningspring.model.DataModel;
import com.sam.learningspring.repository.DataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    private final DataRepository repository;

    public DataService(DataRepository repository) {
        this.repository = repository;
    }

    public List<DataModel> getData(){
        return repository.findAll();    }

    public DataModel saveData(DataModel dataModel) {
        return repository.save(dataModel);
    }

    public DataModel getSingleData(Integer id) {
        return repository.findDataById(id);
    }

    public void deleteData(Integer id) {
        repository.deleteById(id);
    }

    public DataModel updateData(DataModel dataModel, Integer id) {
        return repository.findById(id)
                .map(dt -> {
                    dt.setFirst_name(dataModel.getFirst_name());
                    dt.setLast_name(dataModel.getLast_name());
                    dt.setCareer(dataModel.getCareer());
                    return repository.save(dt);
                })
                .orElseGet(() -> {
                    dataModel.setId(id);
                    return repository.save(dataModel);
                });
    }
}
