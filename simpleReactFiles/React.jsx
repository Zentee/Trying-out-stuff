const ffxivCurrentXpac = 'ShadowBringers';
const element = <h1>This is the last FFXIV Expansion : {ffxivCurrentXpac} </h1>
const user = {
    firstName: 'Filipe',
    lastName: 'Yum'
};

const helloUser = (
    <h1>
        yo this is {formatName(user)}!
    </h1>
);

function possibleGreeting(user){
    if(user) {
        return <h1>yo, this be {formatName(user)}! </h1>;
    }
    return <h1>Hello, who be dis?</h1>
}


function formatName(user){
    return user.firstName + ' ' + user.lastName;
}



reactDom.render(
    element,
    document.getElementById('root')
);