$(document).ready(function(){
});

async function login(){
    let data ={};

    data.email = document.getElementById('email').value;
    data.password = document.getElementById('password').value;

    const request = await fetch('login', {
        method: 'POST',
        headers:{
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }, 
        body: JSON.stringify(data)
    });
    const log = await request.text();
    if(log==="ok"){

        window.location.href = 'users.html';
    }
    else{
        alert("Inicio de sesion equivocado");
    }
    
}