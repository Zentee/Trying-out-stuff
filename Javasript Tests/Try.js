const year = Date;
const currentMmo = 'FFXIV'; 



let dog = {
    sound: 'woof',
    talk: function(){
        console.log(this.sound)
    }
}


dog.talk() // "woof"

let talkFunction = dog.talk 

talkFunction() // undefined


// but by binding we can make the this.binded to the function


let boundFunction = talkFunction.bind(dog)
boundFunction() // "woof"


// some more shenanigans


//let button = document.getElementById('myNiceButton')

/* button.addEventListener(
    'click',
    dog.talk.bind(dog) //again bind para ficar o 'woof'
)
 */

