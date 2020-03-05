

import com.wissen.model.Employee;
import com.wissen.model.NewEmployee;
import com.wissen.repository.HospitalRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String args[]){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HospitalRepository employeeDAO = ctx.getBean("HospitalRepository", HospitalRepository.class);
        List<Employee> l=new ArrayList<>();
        NewEmployee ne=new NewEmployee();
        ne.setJob("SwEng");ne.setWorkHours(8000);
        Integer id=ne.saveId();
        ne.setId(id);
        if(id>1000)
        {
            employeeDAO.addEmp(ne);
        }
        else
        {
            //postgresql
        }
    }
}
