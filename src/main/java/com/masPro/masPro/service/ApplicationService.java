package com.masPro.masPro.service;

import com.masPro.masPro.model.Application;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ApplicationService {
    public List<Application> getAll();
}
