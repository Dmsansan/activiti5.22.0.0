package neusoft.activiti.source;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.impl.cfg.StandaloneInMemProcessEngineConfiguration;

public class OnboardingRequest {
    public static void main(String[] args) {
        ProcessEngineConfiguration cfg = new StandaloneInMemProcessEngineConfiguration()
                .setJdbcUrl("jdbc:mysql://127.0.0.1:3306/activiti?serverTimeizone=UTC")
                .setJdbcUsername("root")
                .setJdbcPassword("root")
                .setJdbcDriver("com.mysql.jdbc.Driver")
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        ProcessEngine processEngine = cfg.buildProcessEngine();
        String pName = processEngine.getName();
        String ver = processEngine.VERSION;
        System.out.print("ProcessEngine ["+pName+"] Version: ["+ ver+"]");
    }
}
