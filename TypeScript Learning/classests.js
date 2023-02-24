var MyClass = /** @class */ (function () {
    //   private firstName: String;
    //   private lastName: String;
    //   private age: number;
    function MyClass(firstName, age, lastName) {
        if (age === void 0) { age = 0; }
        if (lastName === void 0) { lastName = "test"; }
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
        console.log("Class object initialized");
        // this.firstName = firstName;
        // this.lastName = lastName;
        // this.age = age;
    }
    MyClass.prototype.setFirstName = function (firstName) {
        // this.firstName = firstName;
    };
    MyClass.prototype.getFirstName = function () {
        return this.firstName;
    };
    MyClass.prototype.setLastName = function (lastName) {
        // this.lastName = lastName;
    };
    MyClass.prototype.getLastName = function () {
        return this.lastName;
    };
    MyClass.prototype.getAge = function () {
        return this.age;
    };
    MyClass.prototype.setAge = function (age) {
        this.age = age;
    };
    return MyClass;
}());
var obj = new MyClass("Aman", 12);
obj.setFirstName("Rahul");
console.log(obj.getFirstName() + " " + obj.getLastName() + " " + obj.getAge());
