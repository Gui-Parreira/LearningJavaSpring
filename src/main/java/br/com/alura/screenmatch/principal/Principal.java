package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.service.ConsumoApi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=ccf04810";
    private  ConsumoApi consumo = new ConsumoApi();

    public void exibeMenu() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome da Série para busca: ");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO +
                                        nomeSerie.replace(" ", "+") +
                                        API_KEY);
        //"https://www.omdbapi.com/?t=gilmore+girls&season=1&apikey=ccf04810"
    }

}
