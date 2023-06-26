$(document).ready(function(){
});

async function registerUser(){
    let data ={};

    data.name = document.getElementById('name').value;
    data.nickname = document.getElementById('nickname').value;
    data.email = document.getElementById('email').value;
    data.password = document.getElementById('password').value;
    let password2 = document.getElementById('password2').value;

    if(data.password !=  password2){
        alert('Por favor repita su contraseña para verificarla'); 
        return;
    }

    const request = await fetch('user/register', {
        method: 'POST',
        headers:{
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }, 
        body: JSON.stringify(data)
    });

    // const users = await request.json(); 
    console.log(request)
    window.location.href = 'users.html';
    
}