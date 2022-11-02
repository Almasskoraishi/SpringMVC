/**
 *@auther [user} amkoraishi@dmacc.edu
 *CIS175-Fal2022
 *Nov 2, 2022
  */
package dmacc.reposittory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.model.Student;


@Repository
public interface StudentsRepository extends JpaRepository<Student, Long> {

}