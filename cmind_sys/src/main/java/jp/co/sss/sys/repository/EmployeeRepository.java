package jp.co.sss.sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.sss.sys.entity.Employee;

/**
 * リポジトリークラス
 * 
 *
 */

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, String> {

Employee findByEmpIdAndPassword(String empId, String password);

}
