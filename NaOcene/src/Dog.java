public class Dog {
    String breed;
    String color;
    int age;
    public Dog(String breed, String color, int age){
        this.breed = breed;
        this.color = color;
        this.age = age;
    }
    public static void bark(String x){
        switch (x){
            case "owczarek":
                System.out.println("Woof Woof Woof");
            case "korwa":
                System.out.println("Moooo?");
        }
    }
    public static void sleep(){
        System.out.println("Zzzz");
    }

    public static void main(String[] args){
        Dog dog1 = new Dog("owczarek","czarny",2137);
        Dog dog2 = new Dog("krowa","biały",1);
        bark(dog1.breed);
        bark(dog2.breed);
        sleep();


    }

}

