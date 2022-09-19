package Classes;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFormatada () {
        return (String) (dia + "/" + mes + "/" + ano);
    }
    
}
