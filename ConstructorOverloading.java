class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("No data");
    }

    ConstructorOverloading(String name) {
        System.out.println("Name: " + name);
    }

    ConstructorOverloading(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading("John");
        ConstructorOverloading obj3 = new ConstructorOverloading("John", 20);
    }
}