class MyClass {
  //   private firstName: String;
  //   private lastName: String;
  //   private age: number;

  constructor(
    private firstName: string,
    private age: number = 0,
    private lastName: string = "test"
  ) {
    console.log("Class object initialized");
    // this.firstName = firstName;
    // this.lastName = lastName;
    // this.age = age;
  }

  setFirstName(firstName: String) {
    // this.firstName = firstName;
  }

  getFirstName() {
    return this.firstName;
  }

  setLastName(lastName: String) {
    // this.lastName = lastName;
  }

  getLastName() {
    return this.lastName;
  }

  getAge() {
    return this.age;
  }
  setAge(age: number) {
    this.age = age;
  }
}

let obj = new MyClass("Aman", 12);
obj.setFirstName("Rahul");
console.log(obj.getFirstName() + " " + obj.getLastName() + " " + obj.getAge());
