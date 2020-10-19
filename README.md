# Ficticius Clean
Projeto backend utilizando a stack java __spring boot__, para o cálculo e precificação do consumo de combustível de veículos.

## Features
- Cadastro de veículo :heavy_check_mark:
- Retorno da lista ordenada por consumo de combustível :heavy_check_mark:

## Build e run dos testes :computer:
Para efetuar o build e o run dos testes iremos utilizar o __maven__.

`mvn clean package -U`

Caso optar por não rodar os testes poderá executar o seguinte comando

`mvn clean package -U -DskipTests`

## Criando a imagem do docker :scroll:
O próximo passo é criar a imagem do docker com o comando:

`docker build -t ficticiusclean:0.0.1 .`

## Rodando a aplicação com docker-compose :computer:
Depois da imagem criado, para dar o start na aplicação basta apenas executar o comando:

`docker-compose up -d`

A aplicação estará disponível e rodando na porta `9000`

Para para de executar a aplicação basta executar o comando:

`docker-compose stop`

## Utilizando a aplicação
Para efetuar a consulta dos *endpoints* eu utilizei o insomnia [Insomnia](https://insomnia.rest/download/). 
Criei um arquivo com as requests existem [insomnia.json](/insomnia.json), para utilizar
basta você importar este arquivo pro seu __Insomnia__ e seu ambiente estará preparado.
