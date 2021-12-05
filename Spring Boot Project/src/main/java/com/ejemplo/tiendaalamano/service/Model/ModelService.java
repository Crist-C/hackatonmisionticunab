package com.ejemplo.tiendaalamano.service.Model;

import java.util.List;

import com.ejemplo.tiendaalamano.entities.Model;

public interface ModelService {
    void deleteAllModels();
    void deleteModelById(Long id);

    void createModel(Model model);

    Model getModelById(Long id);

    List<Model> getAllModels();
}
