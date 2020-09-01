package com.masPro.masPro.repository;



import com.masPro.masPro.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ApplicationRepository extends JpaRepository<Application,Long> {
}
