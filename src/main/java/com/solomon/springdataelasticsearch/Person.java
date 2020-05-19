package com.solomon.springdataelasticsearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * Person
 *
 * @author Solomon
 * @date 2020/05/09
 */

@Data
@Document(indexName = "persons" ,shards = 5)
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    private String id;
    @Field(fielddata=true)
    private int firstName;
    private String lastName;
}
