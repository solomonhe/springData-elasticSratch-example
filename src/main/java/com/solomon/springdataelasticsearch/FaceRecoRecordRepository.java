package com.solomon.springdataelasticsearch;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * PersonRepository
 *
 * @author Solomon
 * @date 2020/05/09
 */

public interface FaceRecoRecordRepository extends ElasticsearchRepository<FaceRecogRecord,Long> {

    Page<FaceRecogRecord> findByAppId(String d340366abfd04e87b9f5253a0cd6fa46, PageRequest of);
}
