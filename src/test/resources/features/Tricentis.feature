Feature: Realizar cadastro no site

Background:
		Given Entra no site "http://sampleapp.tricentis.com/101/app.php"
  
  Scenario: Realizar cadastro no site
    And Preencher o formulario aba Enter Vehicle Data e precione next
		And Preencher o formulario aba Enter Insurant Data e precione next
		And Preencher o formulario aba Enter Product Data e precione nex
		And Preencher o formulario aba Select Price Option e precione next
		And Preencher o formulario aba Send Quote e precione next
		And Verificar a mensagem "Sending e-mail success!" na tela
		

	Scenario Outline: Realizando cadastros
		When Preencher o formulario aba Enter Vehicle Data e next "<Make>" "<Performance>" "<Manufacture>" "<Seats>" "<Type>" "<Price>" "<Number>" "<Mileage>"
		And Preencher o formulario aba Enter Insurant Data e next "<First>" "<Last>" "<Birth>" "Gender" "<Address>" "<Country>" "<Code>" "<City>" "<Occupation>" "<Hobbies>" "<Website>"
		And Preencher o formulario aba Enter Product Data e nex "<Date>" "<Sum>" "<Rating>" "<Insurance>" "<Products>" "<Car>"
		And Preencher o formulario aba Select Price Option e precione next
		And Preencher o formulario aba Send Quote e precione next "<E-Mail>" "<Phone>" "<Username>" "<Password>" "<Confirm>" "<Comments>"
		And Verificar a mensagem "Sending e-mail success!" na tela
	
	Examples:
	| Make					| Performance   | Manufacture | Seats  | Type    | Price   | Number | Mileage | First  				| Last    			| Birth 			| Gender | Address | Country | Code		| City 		| Occupation | Hobbies        | Website 																							| Date       | Sum 				  | Rating  | Insurance 			 | Products 			 | Car | E-Mail 					 | Phone        | Username | Password    | Confirm     | Comments |
	| Honda 				| 120			 			| 03/01/2021	| 3 		 | Diesel  | 5454    | 112    | 51155   | Teste 				|	uuuu 					|	08/08/1994  | Male 	 | rua 10  | Andorra | 125255 | aaa 		| Farmer     | Bungee Jumping | https://www.linkedin.com/in/rodolfo-farley-1288a9140/ | 06/19/2021 | 3.000.000,00 | Bonus 2 | Partial Coverage | Euro Protection | Yes | sdfjsdo@gmail.com | 315456445684 | Lucas    | Dodo@940808 | Dodo@940808 | asdasdas |
	
 	
 	
 	Scenario:  Realizar cadastro 
		And Preencher o formulario Enter Vehicle Data e precione next
				| Make					| Performance   | Manufacture | Seats  | Type    | Price   | Number | Mileage | 
 				| Honda 				| 120			 			| 03/01/2021	| 3 		 | Diesel  | 5454    | 112    | 51155   |
 		And Preencher o formulario Enter Insurant Data e precione next
 				| First  				| Last    			| Birth 			| Gender | Address | Country | Code		| City 		| Occupation | Hobbies        | Website 																							|
 		 		| Teste 				|	uuuu 					|	08/08/1994  | Male 	 | rua 10  | Andorra | 125255 | aaa 		| Farmer     | Bungee Jumping | https://www.linkedin.com/in/rodolfo-farley-1288a9140/ |
 		And Preencher o formulario Enter Product Data e precione nex
 		    | Date       | Sum 				  | Rating  | Insurance 			 | Products 			 | Car |
 		    | 06/19/2021 | 3.000.000,00 | Bonus 2 | Partial Coverage | Euro Protection | Yes |
 		And Preencher o formulario aba Select Price Option e precione next
 		And Preencher o formulario Send Quote e precione next
 		    | E-Mail 					  | Phone        | Username | Password    | Confirm     | Comments |
 		    | sdfjsdo@gmail.com | 315456445684 | Lucas    | Dodo@940808 | Dodo@940808 | asdasdas |
 		And Verificar a mensagem "Sending e-mail success!" na tela
 		    
 		


		