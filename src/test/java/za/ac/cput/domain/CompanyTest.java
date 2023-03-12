/**
 * CompanyTest.Java
 * This is the Company Test class
 * @author :Lithemba Nkqayi 220558558
 */
package za.ac.cput.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    //Object equality test
    @Test
    public void test() {
        List<Company> companyList = new ArrayList<>();
        Set<Company> companySet = new HashSet<>();

        for (int i = 0; i < 7; i++) {
            Company c = new Company("LilzCorperations", 5122, "Lilzcc@co.za");
            companyList.add(c);
            companySet.add(c);

        }
        //comparing
        System.out.println(companyList.toString());
        assertEquals(7, companyList.size());
        System.out.println(companySet.toString());
        assertEquals(3, companySet.size());

    }

    //Object Identity test
    @Test
    public void ObjectIdentityTest() {
        Set<Company> companySet = new HashSet<>();
        for (int i = 0; i < 7; i++) {
            Company c = new Company("LilzCorperations", 5122, "Lilzcc@co.za");
            companySet.add(c);
        }
        System.out.println(companySet);
        assertSame(7, companySet.size());
        assertNotSame(2, companySet.size());
    }

    //This test has to fail
    @Test
    public void testFail() {
        List<Company> companyList = new ArrayList<>();
        Set<Company> companySet = new HashSet<>();

        for (int i = 0; i < 7; i++) {
            Company c = new Company("", 5122, "Lilzcc@co.za");
            companyList.add(c);
            companySet.add(c);
        }
        System.out.println(companyList.toString());
        assertEquals(7, companyList.size());
        System.out.println(companySet.toString());
        assertEquals(1, companySet.size());
    }
    //Time Out Test
    @Test
    @Timeout(value= 1000, unit= TimeUnit.MILLISECONDS)
    public void TimeOutTest(){
        List<Company> companyList = new ArrayList<>();
        Set<Company> companySet = new HashSet<>();

        for (int i = 0; i < 7; i++) {
            Company c = new Company("", 5122, "Lilzcc@co.za");
            companyList.add(c);
            companySet.add(c);
        }
        System.out.println(companyList.toString());
        assertEquals(7, companyList.size());
        System.out.println(companySet.toString());
        assertEquals(1, companySet.size());

    }
    //Disabled test
    @Disabled
    @Test
    public void DisabledTest(){
        List<Company> companyList = new ArrayList<>();
        Set<Company> companySet = new HashSet<>();

        for (int i = 0; i < 7; i++) {
            Company c = new Company("", 5122, "Lilzcc@co.za");
            companyList.add(c);
            companySet.add(c);
        }
        System.out.println(companyList.toString());
        assertEquals(7, companyList.size());
        System.out.println(companySet.toString());
        assertEquals(1, companySet.size());
    }



}
