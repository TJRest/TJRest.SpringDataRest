package br.com.tjrest.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;

import br.com.tjrest.entities.children.Project;


@Projection(types = { Project.class })
@RepositoryRestResource(collectionResourceRel = "projects", path = "projects")
public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {


}