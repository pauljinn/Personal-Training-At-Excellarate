let myNum: number;
myNum = 2;
console.log(myNum);
let myStr: string;
myStr = "Hello World";
console.log(myStr);
let myBool: boolean;
myBool = true;
console.log(myBool);
let myAnyType: any;
myAnyType = "Hello";
console.log(myAnyType);

let arrBool: boolean[];
arrBool = [true, false];
console.log(arrBool);

let myChar;
myChar = "Learning type assertion";
console.log((<string>myChar).length);
