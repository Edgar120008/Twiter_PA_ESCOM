$(document).ready(function(){

});

async function registerUser(){
    const request = await fetch('user/register', {
        method: 'POST',
        headers:{
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });

    const newUser = await request.json();
    
    
}