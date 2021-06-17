package com.motomatch.motomatch.motorcycle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MotorcycleRepository
        extends JpaRepository<Motorcycle,Long> {

//    @Query("SELECT s FROM Student s WHERE s.name = ?1")
//    Optional<Student> findStudentByName(String email);

    @Query("SELECT m FROM Motorcycle m WHERE m.drivingLicenseType = ?1")
    List<Motorcycle> findMotorcycleByDrivingLicenseType(String type);

}
