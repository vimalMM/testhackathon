package com.example.demo;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface Billrepo extends JpaRepository<BillPOJO,Long> {
//List<BillPOJO> findByBilledDate(String billed_date);
	/*
public final static String findByBilledDate="SELECT * FROM bills WHERE billed_date = :date";

@Query( findByBilledDate)
public List<BillPOJO> findByBilledDate(@Param("date") String BilledDate);
*/
public List<BillPOJO> findByBilledDate(String BilledDate);
}
