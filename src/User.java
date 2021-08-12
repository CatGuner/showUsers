
public class User {
    private String firthName;
    private String secondName;
    private String middleName;
    private Integer age;
    private String pass;

    public User(String firthName, String secondName, String middleName, Integer age, String pass) {
        this.firthName = firthName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.age = age;
        this.pass = pass;
    }

    public String getFirthName() {
        return firthName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Integer getAge() {
        return age;
    }

    public User() {
    }

    public String getPass() {
        return pass;
    }

    public void setFirthName(String firthName) {
        this.firthName = firthName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "firthName='" + firthName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", pass='" + pass + '\'' +
                '}';
    }
}
