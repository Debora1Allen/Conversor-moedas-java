
# Conversor de Moeda

## Visão geral

Este aplicativo Java permite aos usuários converter moedas usando taxas de câmbio em tempo real obtidas do serviço ExchangeRate-API. Ele fornece uma interface de linha de comando simples para conversão de moedas.

## Características

- Converte USD em EUR,por exemplo, e vice-versa com base na entrada do usuário.
- Usa biblioteca Gson para análise JSON e HttpURLConnection para solicitações de API.

## Dependências

- Java SDK (versão XX)
- Biblioteca Gson (versão 2.10.1)

## Configurar

1. **Clone Repositório:**
 ```bash
 git clone git@github.com:Debora1Allen/Conversor-moedas-java.git
 cd CurrencyConverter
 ```

2. **Configurar chave de API:**
 - Obtenha uma chave de API em [ExchangeRate-API](https://www.exchangerate-api.com/).
 - Substitua `API_KEY` em `CurrencyApi.java` pela sua chave API:
 ```java
 private static final String API_KEY = "sua-chave de API";
 ```

3. **Construir e executar:**
 - Compile e execute o aplicativo usando seu IDE preferido ou linha de comando:
 ```bash
 javac com/project/currencyconverter/Main.java
 java com.project.currencyconverter.Main
 ```

## Uso

1. **Escolha a opção de conversão:**
 - Execute o aplicativo e selecione uma opção:
 ```texto simples
 Conversor de moeda
 1. USD para EUR
 2. EUR para USD
 Escolha uma opção:
 ```

2. **Insira o valor:**
 - Digite o valor a ser convertido:
 ```texto simples
 Insira o valor em USD:
 ```

3. **Ver resultado da conversão:**
 - O aplicativo exibe o valor equivalente na moeda de destino:
 ```texto simples
 Equivalente em EUR: X.XX
 ```

## Manipulação de erros

- O aplicativo lida com erros comuns, como entrada inválida (valores não numéricos) e falhas de solicitação de API.


## Licença

- Este projeto está licenciado sob a licença MIT - consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

---