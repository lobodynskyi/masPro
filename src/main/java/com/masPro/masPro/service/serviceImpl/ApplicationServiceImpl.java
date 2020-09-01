package com.masPro.masPro.service.serviceImpl;

import com.masPro.masPro.model.Application;
import com.masPro.masPro.repository.ApplicationRepository;
import com.masPro.masPro.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    ApplicationRepository applicationRepository;

    public List<Application> getAll(){
        return applicationRepository.findAll();
    }

}
