import React from "react";
import Hero from "../hero/hero";

const Home = ({orcamentosClientes}) => 
{
    return(
        <Hero orcamentosClientes = {orcamentosClientes}/>
    ); 
}

export default Home;