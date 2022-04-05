package practice.Q4;

public class DogTest {
    public static void main(String[] args){

        Dog[] dog = new Dog[5];
        
        dog[0] = new Dog("일", "요크셔테리어");
        dog[1] = new Dog("이", "푸들");
        dog[2] = new Dog("삼", "불독");
        dog[3] = new Dog("사", "섀퍼드");
        dog[4] = new Dog("오", "도베르만");

        for(int i=0;i<dog.length;i++){
            System.out.println(dog[i].showDogInfo());            
        }

        for(Dog doglist : dog){
            System.out.println(doglist.showDogInfo());
        }
    }
}
