/**
 * 
 */
package com.ece.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ece.restapi.dto.TaStudent;

/**
 * @author user
 *
 */
@Repository
public interface StudentRepository extends CrudRepository<TaStudent, Long> {

}
