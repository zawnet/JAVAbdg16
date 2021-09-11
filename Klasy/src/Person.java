public class Person {
    private String name;
    private String surname;
    private String gender;
    private int age;
    private String pesel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public boolean hasReachedRetirementAge(){
        if(this.gender == "Female" && this.age>=60)
            return true;
        else if (this.gender == "Male" && this.age>=65)
            return true;
        else
            return false;
    }
    public int ageDifference(Person person){
        return Math.abs(this.age - person.age);
    }

    public int howYearsToRetirementAge() {
        if(this.gender == "Female" && this.age < 60)
            return 60-this.age;
        else if(this.gender == "Male" && this.age < 65)
            return 65-this.age;
        else
            return 0;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(48);
        person.setGender("Male");
        Person person1 = new Person();
        person1.setAge(60);
        person1.setGender("Female");
        System.out.println(person.ageDifference(person1));
        System.out.println(person.howYearsToRetirementAge());
    }

}
