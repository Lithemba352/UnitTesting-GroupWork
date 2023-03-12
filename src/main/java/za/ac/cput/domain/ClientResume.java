/** ClientResume.Java
 * This is the model or worker class
 * @Ruvimbo Ndoro
 * 12 March 2023
 */

package za.ac.cput.domain;

import java.util.Objects;

public class ClientResume {

    private  String clientName;
    private String clientSurname;
    private String clientObjective;
    private String  clientSkill;

    public ClientResume(String clientName, String clientSurname, String clientObjective, String clientSkill) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientObjective = clientObjective;
        this.clientSkill = clientSkill;
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

    public String getClientObjective() {
        return clientObjective;
    }

    public void setClientObjective(String clientObjective) {
        this.clientObjective = clientObjective;
    }

    public String getClientSkill() {
        return clientSkill;
    }

    public void setClientSkill(String clientSkill) {
        this.clientSkill = clientSkill;
    }

    @Override
    public String toString() {
        return "ClientResume{" +
                "clientName='" + clientName + '\'' +
                ", clientSurname='" + clientSurname + '\'' +
                ", clientObjective='" + clientObjective + '\'' +
                ", clientSkill='" + clientSkill + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientResume that = (ClientResume) o;
        return Objects.equals(clientName, that.clientName) && Objects.equals(clientSurname, that.clientSurname) && Objects.equals(clientObjective, that.clientObjective) && Objects.equals(clientSkill, that.clientSkill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientSurname, clientObjective, clientSkill);
    }
}