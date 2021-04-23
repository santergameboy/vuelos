import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main (String[] args ){

        Cliente victor = new Cliente(1,"victor","pinto","mora");
        //ciudad
        Ciudad cochabamba = new Ciudad(1, "cocha");
        Ciudad santacruz = new Ciudad(2 , "Lp");
        Ciudad oruro = new Ciudad(3 , "Tr");

        //categoria
        Categoria gold = new Categoria(1,"Gold");
        //Categoria vip = new Categoria(2,"ViAiPi");
        //aeropuertos
        Aeropuerto jorgewilsterman = new Aeropuerto("JW" , "Jorge Wilstrerman ", cochabamba);
        Aeropuerto viruviru = new Aeropuerto("VV","ViruViru",santacruz);
        Aeropuerto oriella = new Aeropuerto("OR","orieulla",oruro);

        //vuelo
        List<Vuelo> vuelos = new ArrayList<>();
      Vuelo cochabambasantacruz = new Vuelo("ECOJET-159",Calendar.getInstance().getTime(),jorgewilsterman,viruviru);
      vuelos.add(cochabambasantacruz);
      Vuelo santacruzoruro = new Vuelo("BOA-666",Calendar.getInstance().getTime(), viruviru,oriella);
      vuelos.add(santacruzoruro);
      //billete
        Billete billete = new Billete(1,Calendar.getInstance().getTime(), 658.5 , victor,cochabamba,oruro,gold,vuelos);
        System.out.println("Billete");
        System.out.println("*******");
        System.out.println("Id:"+billete.getIdBillete());
        System.out.println("Fecha"+billete.getFechaEmision());
        System.out.println("precio"+billete.getPrecioTotal());
        System.out.println("cliente"+billete.getCliente().getNombre());
        System.out.println("Origen"+billete.getOrigen().getNombre());
        System.out.println("destino:"+billete.getDestino().getNombre());
        System.out.println("categoria:"+billete.getCategoria().getNombre());
        System.out.println("Vuelos");
        for (Vuelo vuelo:billete.getVuelos()){
            System.out.println("codigo vuelo:"+ vuelo.getCodigoVuelo()+"**Salida"+vuelo.getSalida()+"**orige:"+vuelo.getOrigen().getNombre());
        }
    }
}
