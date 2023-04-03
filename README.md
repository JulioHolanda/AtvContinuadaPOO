O sistema a ser desenvolvido é uma solução simples de cartão de fidelidade, onde o cliente vai
acumulando pontos e pode resgatá-los para comprar produtos, serviços e viagens. As seguintes
funcionalidades serão desenvolvidas:

• Cadastros de cliente e de cartão fidelidade: são feitos em uma única tela, que deve
solicitar os seguintes dados do cliente: CPF, nome completo, data de nascimento, sexo,
renda e endereço completo. Quando o cliente é cadastrado, o sistema gera
automaticamente o número do cartão fidelidade, que é a concatenação do CPF do
cliente com a data de cadastro do cliente.

• Alteração de cliente: é feita na mesma tela de cadastro de cliente. O operador digita o
CPF do cliente, os dados cadastrados são carregados na tela e é possível alterá-los,
exceto o CPF.

• Pontuação: é uma tela simples, onde o operador digita o número do cartão fidelidade
do cliente e a quantidade de pontos a ser creditado, e, após um botão ser pressionado,
o sistema gera um registro de pontuação e atualiza o saldo de pontos do cliente.

• Resgate: é uma tela simples, onde o operador digita o número do cartão fidelidade do
cliente, a quantidade de pontos a ser resgatado, seleciona o tipo de resgate (produto,
serviço, viagem) e, a após um botão ser pressionado, o sistema gera um registro de
resgate e atualiza o saldo de pontos do cliente.

• Consulta de saldo e extrato: é uma tela onde o operador digita o número do cartão
fidelidade do cliente e são mostrados todos os resgates e pontuações do cliente e o
seu saldo atual.

• Relatório de clientes: é uma tela que mostra a lista de todos os clientes. Na tela,
operador define o critério de ordenação (por nome, por saldo crescente, por saldo
decrescente, por idade crescente, por idade decrescente).

Várias classes devem ser implementadas, e estas classes juntas, umas usando as outras, vão
compor as funcionalidades descritas. Tais classes vão ser organizadas em camadas (assunto a
ser visto logo em breve) e vão ter funções específicas.

A ideia é ter as duas funcionalidades prontas até o fim da 1a unidade, e as demais até o fim da
2a unidade. À medida que os assuntos forem sendo abordados, o sistema vai sendo
incrementado com as partes e as funcionalidades pertinentes.
