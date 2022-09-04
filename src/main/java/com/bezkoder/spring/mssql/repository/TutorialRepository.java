package com.bezkoder.spring.mssql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.mssql.model.TcGruposDiscriminados;

public interface TutorialRepository extends JpaRepository<TcGruposDiscriminados, Integer> {
  List<TcGruposDiscriminados> findAll();
}
