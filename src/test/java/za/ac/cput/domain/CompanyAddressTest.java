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

class CompanyAddressTest {

    @Test
    void ObjectEqualityTest(){
        List<CompanyAddress> companyAddressArrayList = new ArrayList<>();
        Set<CompanyAddress> companyAddressHashSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            //use all person variables
            CompanyAddress companyAddress = new CompanyAddress("A3452","143 Sir Lowry","Cape Town",8001);
            companyAddressArrayList.add(companyAddress);
            companyAddressHashSet.add(companyAddress);


        }
        System.out.print(companyAddressArrayList.toString());
        assertEquals(5,companyAddressArrayList.size());
        System.out.println(companyAddressHashSet);
        assertEquals(1,companyAddressHashSet.size());

    }

    @Test
    void ObjectIdentityTest(){
        Set<CompanyAddress> companyAddressSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            CompanyAddress companyAddress = new CompanyAddress("A3452","143 Sir Lowry","Cape Town",8001);
            companyAddressSet.add(companyAddress);
        }
        System.out.println(companyAddressSet);
        assertSame(1,companyAddressSet.size());
        assertNotSame(2,companyAddressSet.size());

    }

    @Test
    void FaillingTest(){
        List<CompanyAddress> companyAddressArrayList = new ArrayList<>();
        Set<CompanyAddress> companyAddressHashSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            //use all person variables
            CompanyAddress companyAddress = new CompanyAddress("A3452","143 Sir Lowry","Cape Town",8001);
            companyAddressArrayList.add(companyAddress);
            companyAddressHashSet.add(companyAddress);


        }
        System.out.print(companyAddressArrayList.toString());
        assertEquals(7,companyAddressArrayList.size());
        System.out.println(companyAddressHashSet);
        assertEquals(2,companyAddressHashSet.size());

    }


    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void TimeOutTest(){
        List<CompanyAddress> companyAddressArrayList = new ArrayList<>();
        Set<CompanyAddress> companyAddressHashSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            //use all person variables
            CompanyAddress companyAddress = new CompanyAddress("A3452","143 Sir Lowry","Cape Town",8001);
            companyAddressArrayList.add(companyAddress);
            companyAddressHashSet.add(companyAddress);


        }
        System.out.print(companyAddressArrayList.toString());
        assertEquals(5,companyAddressArrayList.size());
        System.out.println(companyAddressHashSet);
        assertEquals(1,companyAddressHashSet.size());

    }

    @Disabled
    @Test
    void DisabledTest(){
        List<CompanyAddress> companyAddressArrayList = new ArrayList<>();
        Set<CompanyAddress> companyAddressHashSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            //use all person variables
            CompanyAddress companyAddress = new CompanyAddress("A3452","143 Sir Lowry","Cape Town",8001);
            companyAddressArrayList.add(companyAddress);
            companyAddressHashSet.add(companyAddress);


        }
        System.out.print(companyAddressArrayList.toString());
        assertEquals(5,companyAddressArrayList.size());
        System.out.println(companyAddressHashSet);
        assertEquals(1,companyAddressHashSet.size());

    }

}