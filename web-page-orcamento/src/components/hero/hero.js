import "./hero.css";
import Carousel from "react-material-ui-carousel";
import { Paper } from "@mui/material";
import FileDownloadIcon from '@mui/icons-material/FileDownload';

const Hero = ({orcamentosClientes}) => 
{
    return (
        <div id="body-orcamento-tabela-container">
            <div className="orcamento-tabela-container">
                <h4>Orcamentos</h4>
                <table style={{ width: "100%", borderCollapse: "collapse" }}>
                    <thead>
                        <tr>
                            <th style={thStyle}>Data</th>
                            <th style={thStyle}>Cliente</th>
                            <th style={thStyle}>Orcamento(s)</th>
                            <th style={thStyle}>Valor Total</th>
                            <th style={thStyle}>Gerar Orcamento</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            orcamentosClientes.map((orcamentoCliente, index) => (
                            <tr key={index}>
                                <td class="tdTabelaOrcamento" >{formatarData(orcamentoCliente.data)}</td>
                                <td class="tdTabelaOrcamento" >{orcamentoCliente.cliente.nome}</td>
                                <td class="tdTabelaOrcamento" >{concatOrcamentos(orcamentoCliente.orcamentos)}</td>
                                <td class="tdTabelaOrcamento" >{formatarNumero(orcamentoCliente.valorTotal, 2, 2)}</td>
                                <td class="tdTabelaOrcamento" ><button class="btn btn-success btnGerarOrcamento"><FileDownloadIcon/></button></td>
                            </tr>
                            ))
                        }
                    </tbody>
                </table>
            </div>
        </div>
        
    )
}

const thStyle = {
    border: "1px solid #ccc",
    backgroundColor: "#004B2C",
    color:"white",
    padding: "8px",
    textAlign: "left"
};

export default Hero;


function isValido(reg)
{
    if(reg != null && reg != undefined)
    {return true;}

    return false;
}

function concatOrcamentos(listOrcamentos)
{
    let textoResultado = "";

    if(isValido(listOrcamentos) && listOrcamentos.length > 0)
    {   
        for(var i = 0; i < listOrcamentos.length; i++)
        {
            let orcamento = listOrcamentos[i]; 

            if(i > 0) { textoResultado = textoResultado.concat(", "); }
            textoResultado = textoResultado.concat(orcamento.descricao);
        }
    }

    return textoResultado;
}

function formatarData(dataString) 
{
  const data = new Date(dataString);

  if (isNaN(data)) return "Data inválida";

  const dia = String(data.getDate()).padStart(2, '0');
  const mes = String(data.getMonth() + 1).padStart(2, '0'); // mês começa do 0
  const ano = data.getFullYear();

  return `${dia}/${mes}/${ano}`;
}

function formatarNumero(numero, minFrac, maxFrac) {
  return numero.toLocaleString('pt-BR', {
    minimumFractionDigits: minFrac,
    maximumFractionDigits: maxFrac
  });
}