import './App.css';
import api from './api/axiosConfig';
import { useState, useEffect } from 'react';
import Layout from './components/layout';
import { Routes, Route } from 'react-router-dom';
import Home from './components/home/home';

function App() 
{
  const [orcamentosClientes, setOrcamentosClientes] = useState([]);

  const getOrcamentoCliente = async () => 
  {
    try 
    {
      const response = await api.get("/pjs/orcamento/buscarOrcamentosClientes");

      console.log("Data", response.data)

      setOrcamentosClientes(response.data);
    } 
    catch (error) 
    {
      console.log(error); 
    }

  }

  useEffect(()=> 
  {
    getOrcamentoCliente();
  }, []); 

  return (
    <div className="App">
      
    <Routes>
      <Route  path='/' element={<Layout/>}>
        <Route path='/' element={<Home orcamentosClientes={orcamentosClientes} />}></Route>
      </Route>
    </Routes>

    </div>
  );
}

export default App;
