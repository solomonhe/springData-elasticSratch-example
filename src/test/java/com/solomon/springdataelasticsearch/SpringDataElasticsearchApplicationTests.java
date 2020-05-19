package com.solomon.springdataelasticsearch;

import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@SpringBootTest
@Slf4j
class SpringDataElasticsearchApplicationTests {


    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private FaceRecoRecordRepository faceRecoRecordRepository;




    @Test
    public void saves(){
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            person.setId(UUID.randomUUID().toString());
            person.setLastName("知秋2");
            person.setFirstName(i);
            personRepository.save(person);
            elasticsearchRestTemplate.putMapping(Person.class);
        }
    }

    @Test
    public void save(){
        Person person = new Person();
        person.setId(UUID.randomUUID().toString());
        person.setLastName("Gierke");
        personRepository.save(person);
    }

    @Test
    public void findBy(){
        List<Person> gierke = personRepository.findByLastName("Gierke");
    }

    @Test
    public void selectPage(){
        //分页查询
        //PageRequest 分页查询
        //PageRequest.of() 多个入参函数,可根据入参函数是否排序，还有排序规则
        Page<FaceRecogRecord> page = faceRecoRecordRepository.findByAppId("d340366abfd04e87b9f5253a0cd6fa46",PageRequest.of(1,10,Sort.by("snapTime")));
    }


}
