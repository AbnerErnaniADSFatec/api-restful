package api.restful.model;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import api.restful.model.Catalog;

@Repository
public interface CatalogRepository extends CrudRepository<Catalog, Long> {}