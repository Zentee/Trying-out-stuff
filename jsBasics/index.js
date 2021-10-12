console.log("hello World");


//Types of variables

const primitives;

let name = 'Filipe';
let age = 29;
let isNice = true;
let middleName = undefined;
let dreams = null;

const referenceTypes;

let objectPerson = {
    name:'Filipe',
    age: 29
};

//Overwrite a property of an object with a dot notation or bracket notation
objectPerson.name = 'John';

objectPerson['name'] = 'Mary';

let arrayOfColors = ['red', 'blue'];

//functions

function greet(name, lastName){
    console.log('Hello' + name + ' ' + lastName);
}

greet('filipe', 'Yum');

function square(number){
   return number * number;
}

let number = square(2);
console.log(number);
console.log(square(2));