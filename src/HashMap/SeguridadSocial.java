package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        for(Persona p : personaMapDni.values()){
            if(p.getDni().equals(dni)){
                personaMapNumSS.remove(p.getNumSeguridadSocial());
            }
        }
        personaMapDni.remove(dni);

    }

    public Persona obtenerPersonaPorDNI(String dni) {
        return personaMapDni.get(dni);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        return personaMapDni.get(numSS);
    }

    public Map<String, Persona> obtenerPersonasRangoSalarial(double min, double max){
        Map<String, Persona> personasSalarioDni=new HashMap<>();
        for(Persona p : personaMapDni.values()){
            if(p.getSalario()>=min&&p.getSalario()<=max){
                personasSalarioDni.put(p.getDni(), p);
            }
        }
        return personasSalarioDni;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
return
    }

    public List<Persona> obtenerTodas(){

    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" +
                '}';
    }
}

