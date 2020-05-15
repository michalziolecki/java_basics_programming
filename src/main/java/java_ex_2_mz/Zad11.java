package java_ex_2_mz;

/**
 * Created by Michal Ziolecki.
 */
public class Zad11 {
    String name;
    String surname;
    String sex;
    String dateOfBirth;
    String NIN;

    public Zad11(){}

    public Zad11(String name, String surname, String sex, String dateOfBirth, String NIN) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.NIN = NIN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNIN(String NIN) {
        this.NIN = NIN;
    }

    @Override
    public String toString() {
        return "Zad11{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", NIN='" + NIN + '\'' +
                '}';
    }
}
