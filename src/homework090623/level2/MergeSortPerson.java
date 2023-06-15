package homework090623.level2;

import java.util.Arrays;

public class MergeSortPerson {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 35),
                new Person("Eve", 28)
        };

        System.out.println(Arrays.toString(people));
        mergeSortDesc(people);
        System.out.println(Arrays.toString(people));
    }

    public static void mergeSortDesc(Person[] people) {
        if (people.length == 1) {
            return;
        }
        int leftLength = people.length / 2;
        int rightLength = people.length - leftLength;

        Person[] leftPeople = new Person[leftLength];
        Person[] rightPeople = new Person[rightLength];

        for (int i = 0; i < leftLength; ++i) {
            leftPeople[i] = people[i];
        }
        for (int j = 0; j < rightLength; ++j) {
            rightPeople[j] = people[j + leftLength];
        }
        mergeSortDesc(leftPeople);
        mergeSortDesc(rightPeople);

        merge(people, leftPeople, rightPeople);
    }

    public static void merge(Person[] people, Person[] leftPeople, Person[] rightPeople) {
        int leftPeopleIndex = 0;
        int rightPeopleIndex = 0;
        int peopleIndex = 0;

        while (leftPeopleIndex < leftPeople.length && rightPeopleIndex < rightPeople.length) {
            if (leftPeople[leftPeopleIndex].getAge() > rightPeople[rightPeopleIndex].getAge()) {
                people[peopleIndex] = leftPeople[leftPeopleIndex];
                peopleIndex++;
                leftPeopleIndex++;
            } else {
                people[peopleIndex] = rightPeople[rightPeopleIndex];
                peopleIndex++;
                rightPeopleIndex++;
            }
        }
        while (leftPeopleIndex < leftPeople.length) {
            people[peopleIndex] = leftPeople[leftPeopleIndex];
            peopleIndex++;
            leftPeopleIndex++;
        }
        while (rightPeopleIndex < rightPeople.length) {
            people[peopleIndex] = rightPeople[rightPeopleIndex];
            peopleIndex++;
            rightPeopleIndex++;
        }
    }
}
