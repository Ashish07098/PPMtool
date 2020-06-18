package io.jharkhand.ppmtool.repository;

import io.jharkhand.ppmtool.Domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProjectRepository extends CrudRepository<Project,Long> {

    Project findByProjectIdentifier(String projectId);

    @Override
    Iterable<Project> findAll();

    @Override
    void deleteById(Long aLong);
}
