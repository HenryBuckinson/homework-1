package homework_20.classes;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@XmlRootElement
public class EmployeeWrapper {
    private List<Employee> employee;
}
