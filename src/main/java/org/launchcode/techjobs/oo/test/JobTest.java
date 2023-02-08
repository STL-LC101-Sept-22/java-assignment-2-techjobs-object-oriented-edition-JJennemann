package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        String spec = "constructor sets unique job ids that is an integer";
        assertNotEquals(spec, testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    // tests were all passing with spec message in assertion call, however it was causing the TestTaskFour
    //        test to fail, so removed spec from assert calls to pass assignment test.

        String spec1 = "Constructor correctly assigns name to class String";
        Assert.assertTrue(testJob1.getName() instanceof String);
        String spec2 = "Constructor correctly assigns employer to class Employer";
        Assert.assertTrue(testJob1.getEmployer() instanceof Employer);
        String spec3 = "Constructor correctly assigns location to class Location";
        Assert.assertTrue(testJob1.getLocation() instanceof Location);
        String spec4 = "Constructor correctly assigns positionType to class PositionType";
        Assert.assertTrue(testJob1.getPositionType() instanceof PositionType);
        String spec5 = "Constructor correctly assigns coreCompetency to class CoreCompetency";
        Assert.assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);

        String spec6 = "Constructor assigns correct value to name field";
        String expected6 = "Product tester";
        String actual6 = testJob1.getName();
        Assert.assertEquals(expected6, actual6);
        String spec7 = "Constructor assigns correct value to employer field";
        String expected7 = "ACME";
        String actual7 = testJob1.getEmployer().toString();
        Assert.assertEquals(expected7, actual7);
        String spec8 = "Constructor assigns correct value to location field";
        String expected8 = "Desert";
        String actual8 = testJob1.getLocation().toString();
        Assert.assertEquals(expected8, actual8);
        String spec9 = "Constructor assigns correct value to positionType field";
        String expected9 = "Quality control";
        String actual9 = testJob1.getPositionType().toString();
        Assert.assertEquals(expected9, actual9);
        String spec10 = "Constructor assigns correct value to coreCompetency field";
        String expected10 = "Persistence";
        String actual10 = testJob1.getCoreCompetency().toString();
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

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String spec1 = "When passed a Job object, toString should return a string that contains a blank line before the job information";
        char expected1 = '\n';
        char actual1 = testJob1.toString().charAt(0);
        assertEquals(expected1, actual1);
        String spec2 = "When passed a Job object, toString should return a string that contains a blank line after the job information";
        char expected2 = '\n';
        char actual2 = testJob1.toString().charAt(testJob1.toString().length()-1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String spec = "returned toString String should contain a label for each field, followed by the data stored" +
                    " in that field with each field on its own line.";
        String expected = "\n" +
                "ID: 4\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n" +
                "";
        String actual = testJob1.toString();
        System.out.println(testJob1.toString());
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob1 = new Job("Product tester", new Employer(""), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String spec = "If a field is empty the method should add, 'Data not available' after the label.";
        String expected = "\n" +
                "ID: 3\n" +
                "Name: Product tester\n" +
                "Employer: Data not available\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n" +
                "";
        String actual = testJob1.toString();
        System.out.println(testJob1.toString());
        assertEquals(expected, actual);
    }

//    @Test
//    public void testToStringHandlesAllEmptyFields(){
//        Job testJob = new Job("", new Employer(), new Location(),
//                new PositionType(), new CoreCompetency());
//        String expected = "OOPS! This job does not seem to exist";
//        String actual = testJob.toString();
//        System.out.println(testJob.toString());
//        assertEquals(expected, actual);
//    }
}
