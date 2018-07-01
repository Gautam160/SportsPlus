package com.it.sportsplus.repo;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.sportsplus.models.Athlete;
public interface AthleteRepository extends JpaRepository<Athlete,Long>{

}
