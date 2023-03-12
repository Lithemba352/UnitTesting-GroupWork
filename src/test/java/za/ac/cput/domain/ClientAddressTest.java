package za.ac.cput.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class ClientAddressTest {
        @Test
        //object equality test
        public void ObjectEqualityTest(){

            List<ClientAddress> clientAddressList = new ArrayList<>();
            Set<ClientAddress> clientAddressSet = new HashSet<>();

            for (int i = 0; i < 2; i++) {
                //use all person variables
                ClientAddress clientAddress = new ClientAddress("Sir Lowry", "Cape Town");
                clientAddressList.add(clientAddress);
                clientAddressSet.add(clientAddress);


            }
            System.out.print(clientAddressList.toString());
            assertEquals(5,clientAddressList.size());
            System.out.println(clientAddressSet);
            assertEquals(1,clientAddressSet.size());

        }

        @Test
            //Object identity test
        void ObjectIdentityTest(){
            Set<ClientAddress> clientAddressSet = new HashSet<>();

            for (int i = 0; i < 2; i++) {
                ClientAddress clientAddress = new ClientAddress("Sir Lowry","Cape Town");
                clientAddressSet.add(clientAddress);
            }
            System.out.println(clientAddressSet);
            assertSame(1,clientAddressSet.size());
            assertNotSame(2,clientAddressSet.size());
        }

        @Test
            //failing test
        void FailingTest1(){
            List<ClientAddress> clientAddressList = new ArrayList<>();
            Set<ClientAddress> clientAddressSet = new HashSet<>();

            for (int i = 0; i < 2; i++) {
                //use all person variables
                ClientAddress clientAddress= new ClientAddress("Sir Lowry","Cape Town");
                clientAddressList.add(clientAddress);
                clientAddressSet.add(clientAddress);


            }
            System.out.print(clientAddressList.toString());
            assertEquals(7,clientAddressList.size());
            System.out.println(clientAddressSet);
            assertEquals(2,clientAddressSet.size());
        }



        @Test
        @Timeout(value = 1000,unit = TimeUnit.MILLISECONDS)
            //timeout
        void timeOutTest(){
            List<ClientAddress> clientAddressList = new ArrayList<>();
            Set<ClientAddress> clientAddressSet = new HashSet<>();

            for (int i = 0; i < 5; i++) {
                //use all person variables
                ClientAddress clientAddress = new ClientAddress("Sir Lowry","Cape Town");
                clientAddressList.add(clientAddress);
                clientAddressSet.add(clientAddress);


            }
            System.out.print(clientAddressList.toString());
            assertEquals(5,clientAddressList.size());
            System.out.println(clientAddressSet);
            assertEquals(1,clientAddressSet.size());
        }

        @Disabled
        @Test
        void disableTest(){
            Set<ClientAddress> clientAddressSet= new HashSet<>();

            for (int i = 0; i < 2; i++) {
                ClientAddress clientAddress= new ClientAddress( "Sir Lowry","Cape Town");
                clientAddressSet.add(clientAddress);
            }
            System.out.println(clientAddressSet);
            assertSame(1,clientAddressSet.size());
            assertNotSame(2,clientAddressSet.size());
        }


    }