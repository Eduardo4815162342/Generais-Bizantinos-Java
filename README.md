
# Projeto dos Generais Bizantinos

Este projeto é uma implementação em Java de uma variação do Problema dos Generais Bizantinos, onde generais leais devem chegar a um consenso sobre atacar ou recuar, mesmo na presença de alguns traidores.

## Descrição

O Problema dos Generais Bizantinos é um clássico problema de consenso em sistemas distribuídos. Esta implementação assume que:
- O meio de comunicação (mensageiros) é seguro e as mensagens não podem ser alteradas.
- A ação (atacar ou recuar) é emitida pelo comandante, que é confiável, a cada um dos generais.
- Generais traidores podem enviar mensagens conflitantes para tentar impedir o consenso.

## Estrutura do Projeto

O projeto consiste nas seguintes classes:
- `General`: Representa um general, que pode ser leal ou traidor.
- `Comandante`: Representa o comandante que envia a ordem inicial para os generais.
- `GeneraisBizantinos`: Classe principal que coordena o processo de envio de ordens e tomada de decisões.

## Como Executar

1. Clone o repositório para sua máquina local:
   ```sh
   git clone https://github.com/eduardo4815162342/
   ```

2. Navegue até o diretório do projeto:
   ```sh
   cd diretorio-do-projeto
   ```

3. Compile o projeto:
   ```sh
   javac *.java
   ```

4. Execute a classe principal:
   ```sh
   java ProblemaDosGeneraisBizantinos
   ```

## Exemplo de Saída

A saída do programa será algo assim:
```
Ordem do comandante: atacar
General{id=1, ehTraidor=false, decisao='atacar', mensagensRecebidas=[atacar, atacar, atacar, atacar, recuar]}
General{id=2, ehTraidor=true, decisao='recuar', mensagensRecebidas=[atacar, atacar, atacar, atacar, recuar]}
General{id=3, ehTraidor=false, decisao='atacar', mensagensRecebidas=[atacar, atacar, atacar, atacar, recuar]}
General{id=4, ehTraidor=false, decisao='atacar', mensagensRecebidas=[atacar, atacar, atacar, atacar, recuar]}
General{id=5, ehTraidor=true, decisao='recuar', mensagensRecebidas=[atacar, atacar, atacar, atacar, atacar]}
```


## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
