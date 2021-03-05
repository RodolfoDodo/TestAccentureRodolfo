Este projeto foi desenvolvido com Java, Maven e Cucumber.

Para executar o projeto basta realizar um clone e abrir ele no eclipse.

Para executar via linha de comando basta acessar a pasta que contém o arquivo pom.xml

Comando para executar o projeto mvn test

Uma observação importante sempre que exectar os testes o navegador do Chrome ele fechar matando a seção do driver.

Para não fechar bastar acessar a classe Propriedades e mude a linha de codigo

public static boolean FECHAR_BROWSER = true;
Para essa

public static boolean FECHAR_BROWSER = false;
