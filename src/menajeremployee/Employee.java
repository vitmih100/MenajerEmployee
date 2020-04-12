package menajeremployee;

import enums.Gender;
import java.time.LocalDate;

class Employee{
  private int idnp;
  private static int nextIdnp = 1;
  private String name;
  private String surname;
  private double salary;
  private LocalDate hireDay;
  private LocalDate birthDay;
  private Gender gender;

  public Employee(String name,String surname,double salary,LocalDate hireDay,LocalDate birthDay,Gender gender){
    setIdnp();
    this.name=name;
    this.surname=surname;
    this.salary=salary;
    this.hireDay=hireDay;
    this.birthDay=birthDay;
    this.gender=gender;
  }

  public int getIdnp(){
    return this.idnp;
  }

  public void setIdnp(){
    this.idnp=this.nextIdnp++;
  }

  public static int getNextIdnp(){
    return nextIdnp;
  }

  public String getName(){
    return this.name;
  }

  public String getsurName(){
    return this.surname;
  }

  public double getSalary(){
    return this.salary;
  }

  public LocalDate getHireDay(){
    return this.hireDay;
  }

  public LocalDate getBirthDay(){
    return this.birthDay;
  }

  public void raiseSalary(double byPercent){
    double raise = salary * byPercent / 100;
    salary += raise;
  }


  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

 /* private static void alterData() {
  // Nu este posibil de a seta valori altele decât prezente în Gender:
    emps[0].setGender(Gender.FEMALE);
    emps[0].setGender(Gender.MALE);
  }
*/
}