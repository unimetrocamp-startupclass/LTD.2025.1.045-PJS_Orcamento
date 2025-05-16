package com.pjs.orcamento.entidades; 

import java.sql.Date;

public class Orcamento {

    double valor;
    double valorTotal;
    Date data;
    String descricao;
    int status;
    /*  status[0] = ativo, [1] = removido, [2] = aguardando_aprovacao, [3] = aprovado
        [4] = recusado, [5] = aguardando_pagamento, [6] = pago

        int idCliente;
        int idFuncionario;
        int idOrcamento; 

    */
 
}
