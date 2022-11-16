package j18_제네릭.와일드카드;

public class Main {
    // 어떤 클래스도 다 리턴이 가능하지만 Animal을 상속받은 클래스만 리턴 가능하다.
    public AnimalData<? extends Animal> getAnimal(int flag){
        if(flag ==1){
            AnimalData<Human> animalData = new AnimalData<Human>(new Human());
            return animalData;
        }else if(flag == 2){
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;
        }
//        else if(flag == 3){
//            AnimalData<Car> animalData = new AnimalData<Car>(new Car("k8"));
//            return animalData;
//        }
            return null;
    }

    public static void main(String[] args) {
//        AnimalData<Human> animalData1 = new AnimalData<Human>(new Human());
//        animalData1.printData();

        Main main = new Main();
        main.getAnimal(1).printData();
        System.out.println(main.getAnimal(3));
    }
}



