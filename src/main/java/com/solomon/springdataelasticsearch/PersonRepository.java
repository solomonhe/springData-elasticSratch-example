package com.solomon.springdataelasticsearch;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

import java.util.List;

/**
 * PersonRepository
 *
 * @author Solomon
 * @date 2020/05/09
 */

public interface PersonRepository extends ElasticsearchRepository<Person,Long> {
    List<Person> findByLastName(String lastname);

    List<Person> findByFirstNameLike(String firstname);

    Page<Person> findByLastName(String LastName, PageRequest of);

    Page<Person> findByLastName(String LastName, PageRequest of, Sort firstName);
}
