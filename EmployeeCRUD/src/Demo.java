import com.DAO.DepartmentDao;
import com.DAO.EmployeeDao;
import com.Model.Department;
import com.Model.Employee;

public class Demo {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		DepartmentDao Ddao=new DepartmentDao();
		
		Department d1 = new Department(101, "Dep1");
		Ddao.addDepartment(d1);
		Department d2 = new Department(102, "Dep2");
		Ddao.addDepartment(d2);
		//System.out.println(dao.addDepartment(d1));
		
		Employee e1 = new Employee(10, "Test", "user", 101);
		dao.addEmployee(e1);
		Employee e2 = new Employee(11, "Test2", "user2", 102);
		dao.addEmployee(e2);
		//EmployeeDao det = new EmployeeDao();
		dao.EmployeeDetails();
		//System.out.println(det);
		
		

		dao.UpdateEmployee(10,"nameupdated");
		dao.EmployeeDetails();
	
	}

}
