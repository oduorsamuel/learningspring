package com.sam.learningspring.controller;

import com.sam.learningspring.model.DataModel;
import com.sam.learningspring.services.DataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/data")
public class DataController {
private final DataService service;

    public DataController(DataService service) {
        this.service = service;
    }
    @GetMapping
    public List<DataModel> getData(){
        return service.getData();
    }

    @PostMapping
    public DataModel saveData(@RequestBody DataModel dataModel){
        return  service.saveData(dataModel);
    }
    @GetMapping("/{id}")
    public DataModel findSingleData(@PathVariable("id") Integer id){
        return service.getSingleData(id);
    }

    @PutMapping("/{id}")
    public DataModel updateData(@RequestBody DataModel dataModel, @PathVariable("id") Integer id){
        return service.updateData(dataModel, id);
    }

    @DeleteMapping("/{id}")
    public void deleteData(@PathVariable("id") Integer id){
        service.deleteData(id);
    }
}
