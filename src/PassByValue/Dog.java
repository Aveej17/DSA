package PassByValue;

public class Dog {
    private String dog;

    Dog(String dog){
        this.dog = dog;
    }

    private String getName(){
        return this.dog;
    }
    private void setName(String s){
        this.dog = s;
    }
    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        // we pass the object to foo
        System.out.println("Passing aDog");
        foo(aDog);

        // aDog variable is still pointing to the "Max" dog when foo(...) returns
//        System.out.println(aDog.getName().equals("Max")); // true
        System.out.println("aDog "+aDog.getName());
//        System.out.println(aDog.getName().equals("Fifi")); // false
        System.out.println("oldDog "+oldDog.getName());
        System.out.println(aDog == oldDog); // true

        System.out.println("Passing oldDog");
        foo(oldDog);
//        System.out.println(aDog.getName().equals("Fifi")); // false
        System.out.println(aDog.getName());
        System.out.println(oldDog.getName());
        System.out.println(aDog == oldDog);
    }

    public static void foo(Dog d) {
//        System.out.println(d.getName().equals("Max")); // true
        System.out.println("dDog "+d.getName());
        // change d inside of foo() to point to a new Dog instance "Fifi"
//        d = new Dog("Fifi");
        d.setName("Fifi");

//        System.out.println(d.getName().equals("Fifi")); // true
//        System.out.println(d.getName());
    }
}
