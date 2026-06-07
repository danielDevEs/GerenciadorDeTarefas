import './BarraLateral.css'
import { Link } from 'react-router-dom'

function BarraLateral(){
   return (
      <div className="barraContainer">
         <div className="logo">
            check-list-popo
         </div>
         <div className="menuLateral">
            <ul>Dashboard</ul>
            <ul>Relatórios</ul>
            <ul>dfjsjdfhjs</ul>
         </div>
         <br />
        <ul><Link className="linkm" to="/cadastro">Sair</Link></ul>
      </div>
   )
}

export default BarraLateral