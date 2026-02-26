public class Person {
    private String firstName;
    private String lastName;
    private String gender; 

    public Person(String firstName, String lastName, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGender(){
        return gender;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public boolean equals(Person p){
        return this.firstName.equals(p.firstName) &&
               this.lastName.equals(p.lastName);
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }

    public class Teacher extends Person {

    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender,
                   String department, String[] courses) {

        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }


    public String toString() {
        return getFirstName() + " " + getLastName() +
               ", Department: " + department;
    }

    public boolean equals(Teacher t) {

        return this.getFirstName().equals(t.getFirstName()) &&
               this.getLastName().equals(t.getLastName()) &&
               this.department.equals(t.department);
        }
    }
}
