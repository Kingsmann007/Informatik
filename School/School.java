public class School {
  private Person[] persons = new Person[2000];

  public School() {

  }

  public void addPerson(Person p) {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] == null) {
        Person person = p;
        persons[i] = person;
        return;
      }
    }
  }

  public void getPersons() {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null) {
        System.out.println(persons[i]);

      }
    }
  }

  public void getTeachers() {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i] instanceof Teacher) {
        System.out.println(persons[i]);
      }
    }
  }

  public void getStudents() {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i] instanceof Student) {
        System.out.println(persons[i]);
      }
    }
  }

  public void getFirstPersBySex(char sex) {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i].sex == sex) {
        System.out.println(persons[i]);
        return;
      }
    }
  }

  public void getFirstPersByLastname(String lastname) {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i].lastName.equals(lastname)) {
        System.out.println(persons[i]);
        return;
      }
    }
  }

  public void getFirstPersByBeginningOfLastName(String beginningOfLN) {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i].lastName.substring(0, beginningOfLN.length()).equals(beginningOfLN)) {
        System.out.println(persons[i]);
        return;
      }
    }
  }

  public void getFirstTeacher() {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i] instanceof Teacher) {
        System.out.println(persons[i]);
        return;
      }
    }
  }

  public void getFirstTeacherWithSubject(String subject) {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i] instanceof Teacher) {
        if (subject.equals(((Teacher) persons[i]).getSub1()) || subject.equals(((Teacher) persons[i]).getSub2())) {
          System.out.println(persons[i]);
          return;
        }
      }
    }
  }

  public void getTeachersWithSubject(String subject) {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i] instanceof Teacher) {
        if (subject.equals(((Teacher) persons[i]).getSub1()) || subject.equals(((Teacher) persons[i]).getSub2())) {
          System.out.println(persons[i]);
        }
      }
    }
  }

  public void getFirstStudent() {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i] instanceof Student) {
        System.out.println(persons[i]);
        return;
      }
    }
  }

  public void getFirstStudentOlderThan(int age) {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i] instanceof Student) {
        if (age >= persons[i].age) {
          System.out.println(persons[i]);
          return;
        }
      }
    }
  }

  public void getFirstStudentBySex(char sex) {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i] instanceof Student) {
        if (sex == persons[i].getSex()) {
          System.out.println(persons[i]);
          return;
        }
      }
    }
  }

  public void getFirstTeacherByLastname(String lastname) {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i] instanceof Student) {
        if (lastname == persons[i].getLastName()) {
          System.out.println(persons[i]);
          return;
        }
      }
    }
  }

  public void rmPerson(Person p) {
    for (int i = 0; i < persons.length; i++) {
      if(persons[i]!=null){
        if (persons[i].equals(p)) {
          persons[i] = null;
        }
      }
    }
  }

  public Student getFirstMStudentWithFavVidGameStartsWith(String vidGame) {
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i] instanceof Student &&
          vidGame.equals((((Student) persons[i]).getFavGame()).substring(0, vidGame.length()))) {
        if (persons[i].getSex() == 'M') {
          return (Student) persons[i];
        }
      }
    }
    return null;
  }

  public Teacher[] getAllTeachersByAgeAndSubject(int age, String subject) {
    Teacher[] teachers = new Teacher[2000];
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null && persons[i] instanceof Teacher) {
        if (persons[i].getAge() == age) {
          if (((Teacher) persons[i]).getSub1().equals(subject) || ((Teacher) persons[i]).getSub2().equals(subject)) {
            for (int j = 0; j < teachers.length; j++) {
              if (teachers[j] == null) {
                teachers[j] = (Teacher) persons[i];
              }
            }
          }
        }
      }
    }
    
    return teachers;

  }

  public static void main(String[] args) {
    School s = new School();
    s.addPerson(new Teacher("Alex", "schmidtberger", 100, (char) 100, "Mathe", "Physik"));
    s.addPerson(new Student("Alex", "Schmidtberger", 15, 'M', "Test"));
    // s.getAllTeachersByAgeAndSubject(100, "Physik");
    //s.getPersons();
    // s.getFirstTeacherWithSubject("Mathe");
    // s.getFirstStudent();
    // s.getFirstTeacher();
    // s.getFirstStudentBySex((char)100);
    // s.getTeachersWithSubject("Physik");

    // s.getPersons();
    s.getFirstMStudentWithFavVidGameStartsWith("T");
    
    s.rmPerson(new Student("Alex", "Schmidtberger", 15, 'M', "Test"));
    s.getPersons();
    System.out.print(s.getAllTeachersByAgeAndSubject(100, "Physik"));
  }
}