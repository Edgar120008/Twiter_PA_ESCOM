// Call the dataTables jQuery plugin
$(document).ready(function() {
  
  reloadUser();
  
  $('#users').DataTable();
});

async function reloadUser(){

  const request = await fetch('users', {
    method: 'GET',
    headers:{
      'Accept': 'application/json',
      'Content-Type':'application/json'
    }
  });

  const users = await request.json();

  let listUsers='';
  for(let user  of users){

    let infoUsers='<tr><td>'+user.id+'</td><td>'+user.name+'</td><td>'+user.nickname+'</td><td>'+user.email+'</td><td> <a href="#" class="btn btn-success btn-circle"><i class="fas fa-check"></i></a></td></tr>';

    listUsers += infoUsers;
  }
  
  document.querySelector('#users tbody').outerHTML = listUsers;


}
