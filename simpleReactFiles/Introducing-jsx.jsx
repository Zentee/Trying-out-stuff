const fullName = 'Filipe Yum';
const oldElement = <h1>hey, {fullName}!</h1>
const element = <h1>Hey, {formatName(user)}</h1>

const user = {
    firstName: 'Filipe',
    lastName: 'Yum'
};


function formatName(user){
    return user.firstName + ' ' + user.lastName;
}

function getGreeting(user){
    if(user) {
        return <h1>Hello, {formatName(user)}!</h1>
    }
    return <h1>Hello, stranger.</h1>
}


// Identical //

const element1 = (
    <h1 className='greeting'>
        Hello, World!
    </h1>
);

const element2 = React.createElement(
    'h1',
    {className: 'greeting'},
    'Hello, world!'
);

/////////////////////////////////////////



ReactDOM.render(
    element,
    document.getElementById('root')
);