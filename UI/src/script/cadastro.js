function salvaUsuario() {
  let senha1 = document.querySelector("#senha");
  let senha2 = document.querySelector("#confirma-senha");
  if (senha1.value === senha2.value) {
    let nome = document.querySelector("#nome");
    let email = document.querySelector("#email");
    let p = {
      nome: nome.value,
      email: email.value,
      senha: senha1.value,
    };
    localStorage.setItem("nome", nome.value);
    localStorage.setItem("email", email.value);
    localStorage.setItem("senha", senha1.value);

    window.location.href = "./cadastro_pf.html";
  }
}

function enviaServidor() {
  let nome = localStorage.getItem("nome");
  let email = localStorage.getItem("email");
  let senha = localStorage.getItem("senha");
  let cpf = document.querySelector("#cpf").value;
  let dataNascimento = document.querySelector("#dob").value;
  let telefone = document.querySelector("#telefone").value;
  let cep = document.querySelector("#cep").value;
  let uf = document.querySelector("#uf-municipio").value;
  let logradouro = document.querySelector("#logradouro").value;
  let complemento = document.querySelector("#complemento").value;

  let pessoa = {
    nome: nome,
    email: email,
    senha: senha,
    cpf: cpf,
    dataNascimento: dataNascimento,
    telefone: telefone,
    cep: cep,
    uf: uf,
    logradouro: logradouro,
    complemento: complemento,
  };
  console.log(pessoa);
}
