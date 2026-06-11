import AreaTarefa from '../areaTarefa/AreaTarefa'
import NavBar from '../navbar/NavBar'
import './MainDashboard.css'

function MainDashboard(){
   return (
      <div className="section-main">
            <NavBar />
            <AreaTarefa />
      </div>
   )
}

export default MainDashboard