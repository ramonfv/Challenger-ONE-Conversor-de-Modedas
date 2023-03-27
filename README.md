# Challenger-ONE-Conversor-de-Modedas

Repositório destinado ao primeiro challenger do programa ONE back-end. Este é um programa Java que usa a API da apilayer para converter moedas.

## Pré-requisitos

- Java 8 ou superior
- Biblioteca OkHttp 3.14 ou superior
- Chave de API para a API da apilayer

O conversor faz comunicação com a Exchange Rates Data API, para que o usuário possa utilizar o conversor é necessário criar uma conta em:

``
https://apilayer.com/marketplace/exchangerates_data-api?utm_source=apilayermarketplace&utm_medium=featured#
``
       
## Instalação

1. Faça o download do código-fonte do repositório do GitHub.
2. Importe o código-fonte em sua IDE Java.
3. Adicione a biblioteca OkHttp ao seu projeto.
4. Obtenha uma chave de API para a API da apilayer.
5. Insira a chave de API no código-fonte.

Bibliotecas adicionadas:

dependencies {

    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.1'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.8.1'
    implementation 'org.apache.httpcomponents.client5:httpclient5:5.1.3'
    implementation 'org.apache.httpcomponents.client5:httpclient5-fluent:5.1.3'
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation 'org.json:json:20090211'
    
   
}

## Uso

Para converter moedas, execute a classe `ApiTest`. O programa exibirá uma caixa de diálogo solicitando a chave de API, a moeda de origem, a moeda de destino e o valor a ser convertido. Depois de inserir essas informações, o programa fará uma chamada para a API da apilayer e exibirá uma caixa de diálogo com a data da conversão e o valor convertido.

- Consultar a API para conhecer a sintaxe utilizada para as moedas:

     Ex: Real -> BRL, Dólar -> USD
     
## Contribuição

Contribuições são bem-vindas! Para contribuir, envie um pull request ou relate um problema.

# Licenças de Terceiros

Este projeto usa as seguintes bibliotecas de terceiros:

- JUnit 5 (Eclipse Public License 2.0)
- Apache HttpComponents (Apache 2.0)
- OkHttp (Apache 2.0)
- JSON (Domínio Público)


O conversor faz comunicação com a Exchange Rates Data API, para que o usuário possa utilizar o conversor é necessário criar uma conta em:

``
https://apilayer.com/marketplace/exchangerates_data-api?utm_source=apilayermarketplace&utm_medium=featured#
``
Ao criar a conta será possível converter não apenas as moedas indicadas acima, mas todas as moedas suportadas pela API.
