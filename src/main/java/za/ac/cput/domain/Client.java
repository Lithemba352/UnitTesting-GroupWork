/**
 * Client.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 12/03/2023
 */
package za.ac.cput.domain;

import java.util.Objects;

public class Client {

        private String clientName;
        private String clientSurname;
        private String clientNumber;
        private String clientEmail;

        private Client(){}

        public Client(String clientName, String clientSurname, String clientNumber, String clientEmail) {
            this.clientName = clientName;
            this.clientSurname = clientSurname;
            this.clientNumber = clientNumber;
            this.clientEmail = clientEmail;
        }

        public String getClientName() {
            return clientName;
        }

        public void setClientName(String clientName) {
            this.clientName = clientName;
        }

        public String getClientSurname() {
            return clientSurname;
        }

        public void setClientSurname(String clientSurname) {
            this.clientSurname = clientSurname;
        }

        public String getClientNumber() {
            return clientNumber;
        }

        public void setClientNumber(String clientNumber) {
            this.clientNumber = clientNumber;
        }

        public String getClientEmail() {
            return clientEmail;
        }

        public void setClientEmail(String clientEmail) {
            this.clientEmail = clientEmail;
        }

        @Override
        public String toString() {
            return "Client{" +
                    "clientName='" + clientName + '\'' +
                    ", clientSurname='" + clientSurname + '\'' +
                    ", clientNumber='" + clientNumber + '\'' +
                    ", clientEmail='" + clientEmail + '\'' +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(clientName, client.clientName) && Objects.equals(clientSurname, client.clientSurname) && Objects.equals(clientNumber, client.clientNumber) && Objects.equals(clientEmail, client.clientEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientSurname, clientNumber, clientEmail);
    }
}
