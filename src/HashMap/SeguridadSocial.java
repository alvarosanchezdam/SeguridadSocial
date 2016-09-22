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
        if(personaMapDni.containsValue(persona.getDni())==false||personaMapNumSS.containsValue(persona.getNumSeguridadSocial())==false){
            personaMapDni.put(persona.getDni(), persona);
            personaMapNumSS.put(persona.getNumSeguridadSocial(), persona);
        }
        else{
            System.out.println("Dni o Numero de la seguridad social repetidos");
        }
    }

    public void bajaPersona(String dni) {

    }

    public Persona obtenerPersonaPorDNI(String dni) {

    }

    public Persona obtenerPersonaPorNumSS(String numSS) {

    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){

    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){

    }

    public List<Persona> obtenerTodas(){

    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}

