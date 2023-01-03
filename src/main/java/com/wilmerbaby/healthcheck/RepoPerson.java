package com.wilmerbaby.healthcheck;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoPerson extends JpaRepository<Person,Long> {


}
