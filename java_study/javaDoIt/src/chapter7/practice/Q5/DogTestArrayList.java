package practice.Q5;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args){
        ArrayList<Dog> dog = new ArrayList<Dog>();

        dog.add(new Dog("일", "요크셔테리어"));
        dog.add(new Dog("이", "푸들"));
        dog.add(new Dog("삼", "불독"));
        dog.add(new Dog("사", "섀퍼드"));
        dog.add(new Dog("오", "도베르만"));

        for(int i=0;i<dog.size();i++){
            System.out.println(dog.get(i).showDogInfo());
        }

        for(Dog doglist : dog){
            System.out.println(doglist.showDogInfo());
        }
    }
}
