package Classes;

public class DataTest {
    public static void main(String[] args) {
        
        Data d1 = new Data();
        d1.dia = 25;
        d1.mes = 12;
        d1.ano = 1996;

        System.out.printf("%s/%s/%s",d1.dia,d1.mes,d1.ano);
    }
    
}
