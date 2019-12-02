package java8.data;

public class Person {

    private String firstname;
    private String lastname;
    private Integer age;
    private String password;

    public Person() {
    }
    
    public Person( Person p1, Person p2) {
        this.firstname 	= p1.firstname + " " + p2.firstname;
        this.lastname 	= p1.lastname;
        this.age 		= 0;
        this.password 	= null;
    }

    public Person(String firstname, String lastname, Integer age, String password) {
        this.firstname 	= firstname;
        this.lastname 	= lastname;
        this.age 		= age;
        this.password 	= password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
