import "./BarraLateral.css";
import { Link } from "react-router-dom";
import logo from './imgs/logo.png'
import home from './imgs/home.png'
import rela from './imgs/rela.png'
import perfil from './imgs/user.png'

function BarraLateral() {
  return (
    <div className="barraContainer">
      <div className="logo">
        <img src={logo} alt="foto da logo" />
      </div>
      <ul className="menuLateral">
        <li className="opMenu"><img src={home} alt="" />  Tarefas</li>
        <li className="opMenu"> <img src={rela} alt="" /> Relatórios</li>
        <li className="opMenu"> <img src={perfil} alt="" /> Perfil</li>
      </ul>
      <div className="sair">
        <Link className="link" to="/">
          Sair
        </Link>
      </div>
    </div>
  );
}

export default BarraLateral;
