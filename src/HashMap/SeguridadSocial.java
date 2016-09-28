package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

    public class SeguridadSocial {
    Map<String,Persona> personaMapDni;
    Map<String,Persona> personaMapNumSS;
    public SeguridadSocial() {

        personaMapDni=new HashMap<>();
        personaMapNumSS=new HashMap<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {
        //Muestra todos los valores(Personas) de un hash, stream los muestra en flujo, anyMatch para cuando ocurra lo indicado en este caso que el dni de la persona del hash sea igual al de la persona que se introduce
        boolean repetida = personaMapDni.values().stream().anyMatch(persona1 -> persona1.getDni().equals(persona.getDni()));
        //for(Persona p : personaMapDni.values()){
        //}
        if(repetida==false){
            personaMapDni.put(persona.getDni(), persona);
            personaMapNumSS.put(persona.getNumSeguridadSocial(), persona);
        }
    }

    public void bajaPersona(String dni) {

        Persona p =personaMapDni.get(dni);
        personaMapDni.remove(p.getDni());
        personaMapNumSS.remove(p.getNumSeguridadSocial());

    }

    public Persona obtenerPersonaPorDNI(String dni) {
        return personaMapDni.get(dni);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {

        return personaMapDni.get(numSS);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        List<Persona> personasSalario=new ArrayList<>();
        //personaMapDni.values().stream().filter(p -> p.getSalario()>=min&&p.getSalario()<=max).collect(Collectors.toList());

        for(Persona p : personaMapDni.values()){
            if(p.getSalario()>=min&&p.getSalario()<=max){
                personasSalario.add(p);
            }
        }
        return personasSalario;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        List<Persona> personasEdad=new ArrayList<>();
        personasEdad=personaMapDni.values().stream().filter(p -> p.getEdad()>=edad).collect(Collectors.toList());

        //for(Persona p : personaMapDni.values()){
            //if(p.getSalario()>=min&&p.getSalario()<=max){
               // personasSalario.add(p);
            //}
        //}
        return personasEdad;
    }

    public List<Persona> obtenerTodas(){
        return personaMapDni.values().stream().collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" +
                '}';
    }
}

