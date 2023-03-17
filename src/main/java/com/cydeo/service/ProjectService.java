package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.service.CrudService;

import javax.sql.rowset.CachedRowSet;

public interface ProjectService extends CrudService<ProjectDTO,String> {

    void complete(ProjectDTO project);
}
