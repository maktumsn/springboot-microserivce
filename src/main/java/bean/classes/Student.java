package bean.classes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student() {
        System.out.println("Student bean creation");
    }
    @PostConstruct
    public void init(){
        System.out.println("Initializing Student bean ----->");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("destroying Student bean ....");
    }

}
