# PSJ Contabil
Um sistema de geração de orçamentos automático

# Documentação do Sistema

## SUMÁRIO

Dados do Cliente	
Equipe de Desenvolvimento	
1. Introdução	
2. Objetivo	
3. Escopo	
4. Backlogs do Produto	
5. Cronograma	
6. Materiais e Métodos	
7. Resultados	
8. Conclusão	
9. Homologação do MVP junto ao cliente	
10. Divulgação	
11. Carta de Apresentação	
12. Carta de Autorização	
13. Relato individual do processo







## Dados do Cliente

Título do Projeto:  PJS Contabilidade

Cliente: PJS Assessoria & Contábil

CNPJ/CPF: 31.751.942/0001-35

Contato: (19) 98153-4216

Email do contato: contato@pjscontabil.com.br


## Equipe de Desenvolvimento 
| Nome                          | Curso                                | Disciplina                             |
|--------------------------------|-------------------------------------|----------------------------------------|
| Caick Bertin Viana            | Análise e Desenvolvimento de Sistema | Padrões de Projeto em Software em Java |
| Gabriel Juliani Arroyo        | Análise e Desenvolvimento de Sistema | Padrões de Projeto em Software em Java |
| Natália Santos Policeno Rosa  | Análise e Desenvolvimento de Sistema | Padrões de Projeto em Software em Java |



## Professor Orientador
_Kesede Rodrigues Julio_

## Introdução
 O cliente enfrenta dificuldades na organização de dados e na elaboração de orçamentos para seus clientes, resultando em um processo demorado e pouco eficiente. Para solucionar esse problema, propomos o desenvolvimento de um sistema web que permitirá o armazenamento, a estruturação dos dados e a geração automatizada de orçamentos.

 A solução será implementada utilizando MongoDB para o gerenciamento do banco de dados, Java para a estruturação e desenvolvimento do sistema, e JasperStudio para a criação de relatórios. Com essa abordagem, buscamos automatizar o processo, tornando-o mais ágil e eficiente.

## Objetivo

O objetivo deste projeto é desenvolver um sistema baseado em plataforma web que permita ao usuário organizar e estruturar informações de forma mais consistente, prática e ágil. A proposta visa facilitar a elaboração de orçamentos por meio de processos mais automatizados e integrados, utilizando dados previamente cadastrados, otimizando, assim, o tempo e a eficiência das operações realizadas pelo cliente.

## Escopo

Este projeto tem como finalidade a implementação de uma estrutura de back-end voltada à automatização e organização do processo de geração de orçamentos comerciais. O foco principal está na construção da lógica de negócio e na modelagem do banco de dados, não sendo contemplado, nesta etapa, o desenvolvimento da interface de usuário (front-end).

A solução será desenvolvida em Java, utilizando os princípios da programação orientada a objetos, o que proporciona maior modularidade, reutilização de código e manutenção facilitada. Para a criação e gerenciamento da aplicação web, será utilizado o framework Spring Boot, que oferece uma base consolidada para o desenvolvimento de APIs RESTful, além de recursos que favorecem a escalabilidade e a integração entre os componentes do sistema.

Como mecanismo de persistência, será adotado o MongoDB, banco de dados NoSQL que permite maior flexibilidade na estruturação de documentos, adequando-se eficientemente a contextos que exigem variações e expansões dinâmicas de dados.

## Backlogs do Produto

### Requisitos Funcionais (RF)

RF01 – Cadastro de Clientes
O sistema deve permitir o cadastro e armazenamento de dados básicos e complementares de clientes, incluindo nome, CNPJ/CPF, endereço e informações de contato.

RF02 – Estruturação de Dados por Cliente
Deve ser possível organizar os dados do cliente em categorias pré-definidas (produtos, serviços, necessidades, etc.) para facilitar a geração de orçamentos personalizados.

RF03 – Geração de Orçamentos
O sistema deve gerar orçamentos automaticamente com base nos dados cadastrados, permitindo a inclusão dinâmica de itens e condições comerciais.

RF04 – Armazenamento de Orçamentos
Todos os orçamentos gerados devem ser armazenados no sistema, com possibilidade de edição, histórico de versões e exportação para formatos como PDF.

RF05 – Integração com JasperStudio
A aplicação deve ser capaz de gerar relatórios customizados em PDF por meio da integração com o JasperStudio, utilizando os dados estruturados no MongoDB.

RF06 – API RESTful para Consumo de Dados
A aplicação deve disponibilizar uma API REST para que os dados possam ser consumidos ou integrados a outros sistemas futuramente.

### Requisitos Não Funcionais (RNF)

RNF01 – Plataforma Web
O sistema será exclusivamente acessado por meio de navegadores (web-based), dispensando instalação local.

RNF02 – Backend em Java com Spring Boot
A aplicação será desenvolvida em Java, utilizando Spring Boot para estruturar o servidor e facilitar a criação de endpoints e regras de negócio.

RNF03 – Banco de Dados MongoDB
Os dados serão armazenados em um banco NoSQL (MongoDB), devido à sua flexibilidade em lidar com documentos com estrutura variável.

RNF04 – Modularidade do Código
O sistema será implementado com foco em modularidade e boas práticas de programação orientada a objetos, garantindo manutenção facilitada e reutilização de código.

RNF05 – Desempenho e Escalabilidade
A estrutura deverá ser projetada para suportar crescimento de volume de dados e múltiplos usuários acessando simultaneamente sem degradação de performance.

RNF06 – Segurança na API
As rotas da API devem ser protegidas com autenticação (JWT ou similar), impedindo o acesso não autorizado aos dados do sistema.

## Cronograma

<!--
<Insira aqui uma imagem ou tabela de todo o planejamento do projeto (com atividades e datas). A periodicidade das tarefas será de 2 semanas. O cronograma deve abranger todo o processo de construção do projeto. Isso pode ser feito diretamente neste doc, no excel, canva etc>
-->


## Materiais e Métodos

[Diagrama Modelagem UML](imagensProjeto/PJS_OrcamentoModelagem.drawio.pdf)

[Diagrama Modelagem Caso de Uso](imagensProjeto/PSJ_Orcamento_CasoDeUso2.drawio.pdf)



## Resultados

<!--
Protótipo: <Dica: são as telas do software e suas descrições. Em cada uma delas, descreva as ações possíveis do usuário e reações do sistema. Isto pode ser feito através do print das telas do seu sistema. As telas não podem ocupar muito espaço da página, porém também não podem ficar ilegíveis>
Códigos das principais funcionalidades: <Dica: copy-cole aqui as seções mais relevantes do seu código. Insira comentários sobre cada seção.>
-->

## Conclusão

<!--
Impacto do sistema: <Dica: como o sistema impactou (alterou positivamente) o processo do cliente>
Melhorias Futuras: <Dica: elencar, pelo menos, uma melhoria que poderá ser realizada futuramente no sistema.>
-->

## Homologação do MVP junto ao cliente


Após as entregas parciais, realizadas de acordo com os requisitos do sistema  e cronograma, o MVP foi apresentado em uma reunião, realizada entre o time de desenvolvedores e o cliente.

![image](https://github.com/user-attachments/assets/2b683a01-8e08-4833-ac8b-df8b05393974)

Lista de presentes na Homologação

| Nome                                      | Matrícula     |
|-------------------------------------------|---------------|
| Adriano de Sousa Ramos                    | 202302381219  |
| Aline Silveira Cordeiro                   | 202302376533  |
| André Lucas Martins Ezequie               | 202402810201  |
| Beatriz Colombo de Oliveira               | 202303878451  |
| Bianca Pessin Avelino                     | 202302377076  |
| Breno Zachello Oliveira                   | 202202455601  |
| Caick Bertin Viana                        | 202302773664  |
| Daniel Servino da Rocha                   | 202302381464  |
| Derek Bergesch                            | 202303321279  |
| Douglas Carlos de Castro                  | 202202771309  |
| Eduardo Alejandro Meli Aracena Bello      | 202303413572  |
| Emilly Araújo Marques                     | 202303801841  |
| Fabrício Amorim dos Santos                | 202302857957  |
| Felipe Orpheu Santoro Vasconcelos         | 202202389706  |
| Fernando Ferreira da Silva                | 202208700195  |
| Fernando Rodrigues de Sousa               |               |
| Gabriel Cangiani                          | 202304302723  |
| Gabriel de Oliveira Lima                  | 202302381261  |
| Gabriel Juliani Arroyo                    | 202302784471  |
| Guilherme Afonso da Silva Ferrari         | 202302468659  |
| Guilherme Martins Spiandorin              | 202302381359  |
| Heric Prestelo Pedro                      | 202302382479  |
| Jennifer de Oliveira                      | 202103014411  |
| João Alexandre Nunes Belchior             | 202303467079  |
| João Henrique Augait do Nascimento        | 202202782671  |
| João Pedro Dumbra Sturla                  | 202302424856  |
| João Victor Tourinho dos Santos           | 202308428489  |
| Leonardo Hideki Kuriki                    | 202302381431  |
| Lucas Ferreira Ascioni                    | 202108617806  |
| Lucas Guilherme Silva                     | 202303886241  |
| Lucas Guthierrez Oliver                   | 202208700292  |
| Lucas Ryan Rodrigues Barbosa              | 202303181493  |
| Lucas Silva do Carmo                      | 202202834181  |
| Lucas de Souza Pereira                    | 202303152035  |
| Luiz Gustavo de Lara Freschi              | 202303112581  |
| Marcos Vinicius Cardoso Correa            | 202204018292  |
| Matheus Azevedo Rosa                      | 202204156326  |
| Matheus Ramos Marcolino                   | 202302376819  |
| Michael de Souza da Silva                 | 202308396382  |
| Natalia Policeno                          | 202304086826  |
| Paulo Henrique Angelino Braga             | 202302380026  |
| Pedro Daniel Marques                      | 202302892523  |
| Pedro Henrique da Silva dos Santos        | 202403070049  |
| Sabrina Ribeiro Guimarães dos Santos      | 202203181076  |
| Samuel Bernardes                          | 202303459696  |
| Thiago Moscatini Carvalho                 | 202302382428  |
| Tonislau Domingos Quissanga               | 202208700519  |
| Victor Hugo Brito Marião                  | 202304086826  |
| Vinícius Teixeira Tamasaukas              | 202302381642  |
| Wellington José de Lima                   | 202302380921  |

## Divulgação

Apresentação do Projeto

[Slides da Apresentação][(https://www.exemplo.com](https://www.canva.com/design/DAGnpUcQg70/U-ggAkNMhnzFkoESZlNPTA/edit?utm_content=DAGnpUcQg70&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)


<!-- 
**Seminário de Projetos de Software

Vídeo da apresentação: <Grave sua apresentação, poste no Linkedin do projeto e insira aqui o link público (acesso sem login) do vídeo da apresentação>

<Na tabela abaixo, inserir uma foto da apresentação em cada linha. Serão 4 fotos (tiradas no momento da apresentação). Para cada foto, descreva uma legenda na linha de baixo.>

<foto 1: foto do time com o primeiro slide de fundo>
<foto 2: foto de um integrante apresentando o sistema.>
Da esquerda para direita: <legenda 1: descreva quem está na foto>
<legenda 2: coloque o nome de quem está apresentando>
<foto 3: foto plano geral da apresentação de frente para o fundo da sala>
<foto 4:  foto plano geral da apresentação do fundo para a frente da sala>
Participantes do evento assistindo a apresentação
Participantes do evento assistindo a apresentação


Segue abaixo a lista de presentes na apresentação.

Lista de presentes na Apresentação
<Faça uma lista de presença numa folha A4, contendo no alto da folha “Seminários de Projetos de Software”. A lista deve conter ra, nome e assinatura dos presentes. Cole aqui a foto desta lista.>
-->
<!--
FENETEC: Feira de Negócios em Tecnologia

Apresentação do projeto: <Um vídeo deve ser produzido mostrando o time apresentando seu projeto para algum visitante. Importante que neste video tenha uma tomada do banner e dos integrantes. Insira aqui o link público deste vídeo.>

<Na tabela abaixo, inserir uma foto da apresentação em cada linha. Serão 4 fotos (tiradas do evento). Para cada foto, descreva uma legenda na linha de baixo.>

<foto 1: foto do time ao lado do poster>
<foto 2: foto de um integrante apresentando o sistema.>
Da esquerda para direita: <legenda 1: descreva quem está na foto>
<legenda 2: coloque o nome de quem está apresentando>
<foto 3: foto do público assistindo sua apresentação>
<foto 4:  foto plano geral da FENETEC>
Participantes do evento assistindo a apresentação
Estandes da FENETEC


Segue abaixo a lista de presentes na FENETEC.

Lista de presentes na Apresentação
<cole aqui a lista de presença dos visitantes da FENETEC com nome e email do visitante . Os próprios times farão um form contendo no cabeçalho: Lista de Visitantes FENETEC. Compartilhe a planilha gerada pelo form com todos os times.>

-->













<!--
Carta de Apresentação

Vimos por desta apresentar o grupo de acadêmicos do Centro Universitário Unimetrocamp, localizada à Rua Sales de Oliveira, 1661 - Campinas - SP, a fim de convidá-lo a participar de uma atividade extensionista associada ao componente curricular <inserir o nome da disciplina>, sob responsabilidade do orientador Prof. Kesede Rodrigues Julio (profkesede64@gmail.com).
Em consonância ao Plano Nacional de Educação vigente, o Centro Universitário Unimetrocamp promove o Desenvolvimento de Software que, norteados pela metodologia de Gerenciamento Ágil Scrum, tem por princípios fundantes o diagnóstico dos problemas/demandas/necessidades, a participação ativa dos interessados/públicos participantes, a construção dialógica, coletiva e experiencial de conhecimentos, o planejamento de ações, o desenvolvimento e avaliação das ações, a sistematização dos conhecimentos, a avaliação das ações desenvolvidas.
Nesse contexto, a disciplina acima mencionada tem como principal escopo os temas relacionados à Programação Orientada à Objeto / Padrões de Projetos de Software, no que diz respeito ao desenvolvimento de um software utilizando Programação Orientada à Objeto.
Sendo assim, pedimos o apoio de <nome do cliente> para a realização das seguintes atividades: levantamento de requisitos, validação das entregas parciais, revalidação dos requisitos, homologação do MVP, ou qualquer outra intervenção que auxilie no desenvolvimento das competências de nossos acadêmicos e ao mesmo tempo possa contribuir para a comunidade em que estamos inseridos.
Aproveitamos a oportunidade para solicitarmos, em caso de aceite, que a parceria seja formalizada, mediante assinatura da Carta de Autorização, as atividades e informações que o(s) aluno(s) poderá(ão) ter acesso.
Em tempo, registramos ainda, o convite para a participação de todos os interessados no fórum semestral de acompanhamento e avaliação das atividades realizadas, que está previsto para o final deste semestre, e será comunicado previamente em convite específico.
Desde já nos colocamos à sua disposição para quaisquer esclarecimentos.
Atenciosamente,
Campinas, ____ de _________ de 202___.

____________________________________
Assinatura Direção Acadêmica da IES
 
____________________________________
Assinatura Docente
-->

<!--
Carta de Autorização

Eu, (preencher com nome do responsável), (preencher com cargo ocupado), da (nome da empresa, organização, associação, escola, secretaria, etc., situada no endereço – inserir o endereço), autorizo a realização das seguintes atividades acadêmicas do componente extensionista <código e nome da disciplina>, do Centro Universitário Unimetrocamp, sob orientação do Prof. Kesede Rodrigues Julio.
 
Atividades:
 
 
 
 

Conforme combinado em contato prévio, as atividades acima descritas são autorizadas para os seguintes alunos:
 
Nome dos/das alunos/as
Curso
Matrícula
 
 
 
 
 
 
 
 
 
 
 
 







 
Declaro que fui informado por meio da Carta de Apresentação sobre as características e objetivos das atividades que serão realizadas na organização/instituição/empresa a qual represento e afirmo estar ciente de tratar-se de uma atividade realizada com intuito exclusivo de ensino de alunos de graduação, sem a finalidade de exercício profissional.
 
Desta forma, autorizo, em caráter de confidencialidade:
 
 o acesso a informações e dados que forem necessários à execução da atividade;
 o registro de imagem por meio de fotografias;
 outro: (especificar)
 
 
Campinas, ___ de ___________de 202_.
 
___________________________________________________________________
(Assinatura, nome completo do responsável, email de contato e com carimbo da empresa)
-->

<!--
Relato individual do processo


<nome do aluno>
<um breve relato pessoal sobre o trabalho extensionista desenvolvido>


<nome do aluno>
<um breve relato pessoal sobre o trabalho extensionista desenvolvido>


<nome do aluno>
<um breve relato pessoal sobre o trabalho extensionista desenvolvido>


<nome do aluno>
<um breve relato pessoal sobre o trabalho extensionista desenvolvido>


<nome do aluno>
<um breve relato pessoal sobre o trabalho extensionista desenvolvido>

-->


 

