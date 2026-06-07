import { useState } from "react";
import { Link } from "react-router-dom";
import './Cadastro.css'

function Cadastro(){
   const [name, setName] = useState("");
   const [senha, setSenha] = useState("");
   const [confimarSenha, setConfimarSenha] = useState("");

   function handleLogin(event){
      event.preventDefault();

      if (senha != confimarSenha){
         alert("senha diferentes");
         return
      }

      console.log(name)
      console.log(senha)

      //posteriormente enviar para API
   }

   return(
      <div className="container-cadastro">
               <form onSubmit={handleLogin}>
                <h1>Cadastro</h1>
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

                   <div className="entrada"> 
                     <label>Confirmar Senha</label>
                     <input type="password"
                     placeholder="Digite sua senha"
                     value={confimarSenha}
                     onChange={(e) => setConfimarSenha(e.target.value)} />
                  </div>
                     <p className="link">Já possui Login? <Link className="linkm" to="/">Logar</Link></p>
      
                  <button type="submit"><Link className="link-but" to="/dashboard">Cadastrar</Link></button>
               </form>
            </div>
   )
}

export default Cadastro