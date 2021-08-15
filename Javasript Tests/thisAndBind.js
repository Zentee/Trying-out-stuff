let talk = function talk(){
    console.log(this.sound)
}

let boromir = {
    sound: 'One does not simply walk into Mordor'
}

// esta funciona porque fizemos bind ao this.sound. 

let talkBoundToBoromir = talk.bind(boromir);

// esta nao funciona porque nao esta binded ao this.
talkBoundToBoromir();


//tambem se pode fazer assim. ou seja speak tem o valor da função declarada em cima 

let aragorn = {
    //speak: talk,   antigo
    blabber: talk,
    sound: 'One does not simply walk into mordor'
}

aragon.speak = talk.bind(aragorn);

//aragorn.speak(); forma antiga

let blabber = aragon.speak;
blabber();

let gollum = {
        jabber: aragorn.blabber,
        sound: 'My precious.....'
}

gollum.jabber();