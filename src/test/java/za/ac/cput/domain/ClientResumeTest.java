/** ClientResume.Java
 * This is the model or worker class
 * @Ruvimbo Ndoro
 * 12 March 2023
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

class ClientResumeTest {

    @Test
    void ObjectEqualityTest() {
        List<ClientResume> clientResumeArrayList = new ArrayList<>();
        Set<ClientResume> clientResumeHashSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            //use all person variables
            ClientResume clientResume = new ClientResume("Ruvimbo", "Ndoro", "Goal driven", "Problem Solving");
            clientResumeArrayList.add(clientResume);
            clientResumeHashSet.add(clientResume);


        }
        System.out.print(clientResumeArrayList.toString());
        assertEquals(5, clientResumeArrayList.size());
        System.out.println(clientResumeHashSet);
        assertEquals(1, clientResumeHashSet.size());

    }

    @Test
    void ObjectIdentityTest() {
        Set<ClientResume> clientResumeSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            ClientResume clientResume = new ClientResume("Ruvimbo", "Ndoro", "Goal driven", "Problem Solving");
            clientResumeSet.add(clientResume);
        }
        System.out.println(clientResumeSet);
        assertSame(1, clientResumeSet.size());
        assertNotSame(2, clientResumeSet.size());

    }

    @Test
    void FaillingTest() {
        List<ClientResume> clientResumeArrayList = new ArrayList<>();
        Set<ClientResume> clientResumeHashSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            //use all person variables
            ClientResume clientResume = new ClientResume("Ruvimbo", "Ndoro", "Goal driven", "Problem Solving");
            clientResumeArrayList.add(clientResume);
            clientResumeHashSet.add(clientResume);


        }
        System.out.print(clientResumeArrayList.toString());
        assertEquals(7, clientResumeArrayList.size());
        System.out.println(clientResumeHashSet);
        assertEquals(2, clientResumeHashSet.size());

    }


    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void TimeOutTest() {
        List<ClientResume> clientResumeArrayList = new ArrayList<>();
        Set<ClientResume> clientResumeHashSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            //use all person variables
            ClientResume clientResume = new ClientResume("Ruvimbo", "Ndoro", "Goal driven","Problem Solving" );
            clientResumeArrayList.add(clientResume);
            clientResumeHashSet.add(clientResume);


        }
        System.out.print(clientResumeArrayList.toString());
        assertEquals(5, clientResumeArrayList.size());
        System.out.println(clientResumeHashSet);
        assertEquals(1, clientResumeHashSet.size());

    }

    @Disabled
    @Test
    void DisabledTest() {
        List<ClientResume> clientResumeArrayList = new ArrayList<>();
        Set<ClientResume> clientResumeHashSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            //use all person variables
            ClientResume clientResume = new ClientResume("Ruvimbo", "Ndoro", "Goal driven","Problem Solving" );
            clientResumeArrayList.add(clientResume);
            clientResumeHashSet.add(clientResume);


        }
        System.out.print(clientResumeArrayList.toString());
        assertEquals(5, clientResumeArrayList.size());
        System.out.println(clientResumeHashSet);
        assertEquals(1, clientResumeHashSet.size());


    }
}