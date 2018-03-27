package com.woodmen.hello.repository;

import com.woodmen.hello.domain.PlanCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanCategoryRepository extends JpaRepository<PlanCategory, Long> {
    public PlanCategory findByCompanyCodeAndPlanCode(String companyCode, String planCode);
}
