package com.zeljko.customer3.repository;

import java.util.List;

import com.zeljko.customer3.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    List<Customer> findByFirstName(@Param("first_name") String firstName);
    List<Customer> findByLastName(@Param("last_name") String lastName);

}