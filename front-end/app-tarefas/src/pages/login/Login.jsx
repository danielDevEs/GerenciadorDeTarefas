import { useState } from "react";
import { Link } from "react-router-dom";
import '../cadastro/Cadastro.css'

function Login(){
   const [name, setName] = useState("");
   const [senha, setSenha] = useState("");

   function handleLogin(event){
      event.preventDefault();

      console.log(name)
      console.log(senha)

      //posteriormente enviar para API
   }

   return (
      <div className="container-login">
         <form onSubmit={handleLogin}>
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

            <button  type="submit"><Link className="link-but" to="/dashboard">Entrar</Link></button>
         </form>
      </div>
   );
}

export default Login;