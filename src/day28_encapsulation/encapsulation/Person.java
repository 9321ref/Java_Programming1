package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class Person {

        private String name;
        private int age;
        private char gender;
        private LocalDate dateOfBirth;

        public String getName() {
            if (name == null) {
                return "Unknown";
            }
            return name;
        }

        public void setName(String name) {
            if (name.isEmpty() || name.isBlank()) {
                System.err.println("Name can not be empty ,blank or null!");
                System.exit(1);
            }
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 120 || age < 0) {
                System.err.println("Age can not be less than 0 or greater than 120");
                System.exit(1);
            }
            this.age = age;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            if (!(gender == 'M' || gender == 'F')) {
                System.err.println("Invalid gender has given" + gender);
                System.exit(1);
            }
            this.gender = gender;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            if (dateOfBirth.isAfter(LocalDate.now())) {
                System.err.println("Date of birth can not be after today!");
                System.exit(1);
            }
            this.dateOfBirth = dateOfBirth;
        }

        public Person(String name, int age, char gender, LocalDate dateOfBirth) {
            setName(name);
            setAge(age);
            setGender(gender);
            setDateOfBirth(dateOfBirth);
        }

        public String toString() {
            return "Person{" +
                    "name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", gender=" + getGender() +
                    ", dateOfBirth=" + getDateOfBirth() +
                    '}';
        }


    }
