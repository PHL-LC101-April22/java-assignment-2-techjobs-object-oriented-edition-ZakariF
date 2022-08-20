package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId () {
        Job firstJobId = new Job();
        Job secondJobId = new Job();
        assertNotEquals(firstJobId,secondJobId);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job firstFullJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //firstFullJob.getName that to get the name
        assertEquals(firstFullJob.getName(),"Product tester" );
        assertEquals(firstFullJob.getEmployer().toString(),"ACME");
        assertEquals(firstFullJob.getLocation().toString(),"Desert");
        assertEquals(firstFullJob.getPositionType().toString(),"Quality control");
        assertEquals(firstFullJob.getCoreCompetency().toString(),"Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job firstJob = new Job("Mango",new Employer("John"),new Location("PA"),new PositionType("Cashier"),new CoreCompetency("Integrity"));
        Job secondJob = new Job("Mango",new Employer("John"),new Location("PA"),new PositionType("Cashier"),new CoreCompetency("Integrity"));
        assertNotEquals(firstJob.getId(),secondJob.getId());

    }

}
