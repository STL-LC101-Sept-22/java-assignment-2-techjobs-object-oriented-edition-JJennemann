package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        String spec = "constructor sets unique job ids that is an integer";
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(spec, testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
        new PositionType("Quality control"), new CoreCompetency("Persistence"));

// tests were all passing with spec message in assertion call, however it was causing the TestTaskFour
//        test to fail, so removed spec from assert calls to pass assignment test.

        String spec1 = "Constructor correctly assigns name to class String";
        Assert.assertTrue(testJob.getName() instanceof String);
        String spec2 = "Constructor correctly assigns employer to class Employer";
        Assert.assertTrue(testJob.getEmployer() instanceof Employer);
        String spec3 = "Constructor correctly assigns location to class Location";
        Assert.assertTrue(testJob.getLocation() instanceof Location);
        String spec4 = "Constructor correctly assigns positionType to class PositionType";
        Assert.assertTrue(testJob.getPositionType() instanceof PositionType);
        String spec5 = "Constructor correctly assigns coreCompetency to class CoreCompetency";
        Assert.assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);

        String spec6 = "Constructor assigns correct value to name field";
        String expected6 = "Product tester";
        String actual6 = testJob.getName();
        Assert.assertEquals(expected6, actual6);
        String spec7 = "Constructor assigns correct value to employer field";
        String expected7 = "ACME";
        String actual7 = testJob.getEmployer().toString();
        Assert.assertEquals(expected7, actual7);
        String spec8 = "Constructor assigns correct value to location field";
        String expected8 = "Desert";
        String actual8 = testJob.getLocation().toString();
        Assert.assertEquals(expected8, actual8);
        String spec9 = "Constructor assigns correct value to positionType field";
        String expected9 = "Quality control";
        String actual9 = testJob.getPositionType().toString();
        Assert.assertEquals(expected9, actual9);
        String spec10 = "Constructor assigns correct value to coreCompetency field";
        String expected10 = "Persistence";
        String actual10 = testJob.getCoreCompetency().toString();
        Assert.assertEquals(expected10, actual10);
    }
    @Test
    public void testJobsForEquality(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        tests were all passing with spec message in assertion call, however it was causing the TestTaskFour
//        test to fail, so removed spec from assert calls to pass assignment test.

        String spec = "Jobs equals() method correctly identifies two objects with identical field values as not being equal";
        Assert.assertFalse(testJob1.equals(testJob2));
    }
}
