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
class ClientTest {


        @Test
        void ObjectEqualityTest() {
            List<Client> clientArrayList = new ArrayList<>();
            Set<Client> clientHashSet = new HashSet<>();

            for (int i = 0; i < 5; i++) {
                //use all person variables
                Client client = new Client("chrisian", "mukuna", "20220", "mukuna@gmail.com");
                clientArrayList.add(client);
                clientHashSet.add(client);


            }
            System.out.print(clientArrayList.toString());
            assertEquals(5,clientArrayList.size());
            System.out.println(clientHashSet);
            assertEquals(1,clientHashSet.size());

        }

        @Test
        void ObjectIdentityTest(){
            Set<Client> clientset = new HashSet<>();

            for (int i = 0; i < 5; i++) {
                Client client = new Client("chrisian", "mukuna", "20220", "mukuna@gmail.com");
                clientset.add(client);
            }
            System.out.println(clientset);
            assertSame(1,clientset.size());
            assertNotSame(2,clientset.size());

        }

        @Test
        void FaillingTest(){
            List<Client> clientArrayList = new ArrayList<>();
            Set<Client> clientHashSet = new HashSet<>();

            for (int i = 0; i < 5; i++) {
                //use all person variables
                Client client = new Client("chrisian", "mukuna", "20220", "mukuna@gmail.com");
                clientArrayList.add(client);
                clientHashSet.add(client);


            }
            System.out.print(clientArrayList.toString());
            assertEquals(7,clientArrayList.size());
            System.out.println(clientHashSet);
            assertEquals(2,clientHashSet.size());

        }

        @Test
        @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
        void TimeOutTest(){
            List<Client> clientArrayList = new ArrayList<>();
            Set<Client> clientHashSet = new HashSet<>();

            for (int i = 0; i < 5; i++) {
                //use all person variables
                Client client = new Client("chrisian", "mukuna", "20220", "mukuna@gmail.com");
                clientArrayList.add(client);
                clientHashSet.add(client);


            }
            System.out.print(clientArrayList.toString());
            assertEquals(5,clientArrayList.size());
            System.out.println(clientHashSet);
            assertEquals(1,clientHashSet.size());

        }

        @Disabled
        @Test
        void DisabledTest(){
            List<Client> clientArrayList = new ArrayList<>();
            Set<Client> clientHashSet = new HashSet<>();

            for (int i = 0; i < 5; i++) {
                //use all person variables
                Client client = new Client("chrisian", "mukuna", "20220", "mukuna@gmail.com");
                clientArrayList.add(client);
                clientHashSet.add(client);


            }
            System.out.print(clientArrayList.toString());
            assertEquals(5,clientArrayList.size());
            System.out.println(clientHashSet);
            assertEquals(1,clientHashSet.size());

        }
    }