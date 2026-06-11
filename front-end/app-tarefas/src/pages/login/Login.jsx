import { useState } from "react";
import { Link, useNavigate  } from "react-router-dom";
import '../cadastro/Cadastro.css'

function Login(){
   const navigate = useNavigate();

   const [name, setName] = useState("");
   const [senha, setSenha] = useState("");
   
   function handleLogin(event){
      event.preventDefault();
      
      if (!name.trim() || !senha.trim()) {
         alert("Preencha todos os campos!");
         return;
      }

      console.log(name);
      console.log(senha);
      
      navigate("/dashboard");
   }
   //const formularioValido = name.trim() !== "" && senha.trim() !== "";

   return (
      <div className="container-login">
         <form id="form" onSubmit={handleLogin}>
          <h1>Login</h1>
            <div className="entrada">
               <label>Name</label>
               <input type="text"
               placeholder="Digite deu nome"
               value={name}
               onChange={(e) => setName(e.target.value)} />
            </div>

             <div className="entrada">
               <label>Senha</label>
               <input type="password"
               placeholder="Digite sua senha"
               value={senha}
               onChange={(e) => setSenha(e.target.value)} />
               
            </div>
             <p className="link">Não possui cadastro? <Link className="linkm" to="/cadastro">cadastrar</Link></p>

            <button  type="submit">Entrar</button>
         </form>
      </div>
   );
}

export default Login;