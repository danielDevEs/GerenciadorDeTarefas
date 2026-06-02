import BarraLateral from "../../components/barraLateral/barraLateral"
import MainDashboard from "../../components/MainDashboard/MainDashboard"
import './Dashboard.css'

function Dashboard(){
   return(
      <div className="container-dash">
         <BarraLateral />
         <MainDashboard />
      </div>
   )
}

export default Dashboard