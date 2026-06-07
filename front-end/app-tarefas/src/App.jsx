;//import Titulo from "./Titulo"
import { Route, BrowserRouter, Routes } from "react-router-dom"
import Login from "./pages/login/Login"
import Cadastro from "./pages/cadastro/Cadastro"
import Dashboard from "./pages/Dashboard/Dashboard"


function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Login />} />
                <Route path="/cadastro" element={<Cadastro />} />
                <Route path="/dashboard" element={<Dashboard />} />
            </Routes>
        </BrowserRouter>
    )
}

export default App
