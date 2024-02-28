package br.com.erudio.integrationtests.vo;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serial;
import java.io.Serializable;

@XmlRootElement
public class PersonVO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id; // Alterando o atributo de id para Key(chave);

    private String firstName;
    private String lastName;
    private String address;
    private String gender;
    private Boolean enabled;


    public PersonVO() {} // Constructor padrão que o JPA exige.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonVO personVO)) return false;

        if (getId() != null ? !getId().equals(personVO.getId()) : personVO.getId() != null) return false;
        if (getFirstName() != null ? !getFirstName().equals(personVO.getFirstName()) : personVO.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(personVO.getLastName()) : personVO.getLastName() != null)
            return false;
        if (getAddress() != null ? !getAddress().equals(personVO.getAddress()) : personVO.getAddress() != null)
            return false;
        if (getGender() != null ? !getGender().equals(personVO.getGender()) : personVO.getGender() != null)
            return false;
        return getEnabled() != null ? getEnabled().equals(personVO.getEnabled()) : personVO.getEnabled() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        result = 31 * result + (getEnabled() != null ? getEnabled().hashCode() : 0);
        return result;
    }
}
