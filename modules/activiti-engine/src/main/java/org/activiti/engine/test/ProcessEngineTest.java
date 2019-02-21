package org.activiti.engine.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Assert;
import org.junit.Test;

public class ProcessEngineTest {
    @Test
    public void  getDefaultProcessEmgine(){
        ProcessEngine pe = ProcessEngines.getDefaultProcessEngine();
        Assert.assertNotNull("not null", pe);
    }
}
