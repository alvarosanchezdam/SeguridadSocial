package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SeguridadSocial {
    private List<Persona> personasList;
    public SeguridadSocial() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {
        boolean repetido=false;
        for(int i=0; i< personasList.size();i++){
            if(persona.getDni()==personasList.get(i).getDni()){
                repetido=true;
                System.out.println("El dni esta repetido");
            }
            if(persona.getNumSeguridadSocial()==personasList.get(i).getNumSeguridadSocial()){
                repetido=true;
                System.out.println("El número de la seguridad social esta repetido");
            }

        }
        if(repetido==false) {
            personasList.add(persona);
        }
    }

    public void bajaPersona(String dni) {

        personasList.removeIf(p -> dni.equals(p.getDni()));

        for(int i=0; i< personasList.size();i++){
            if(dni==personasList.get(i).getDni()){
                personasList.remove(i);
            }
        }
    }

    public Persona obtenerPersonaPorDNI(String dni) {
        for(int i=0; i< personasList.size();i++){
            if(dni.equals(personasList.get(i).getDni())){
                 return personasList.get(i);
            }
        }
        return personasList.get(0);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        for(int i=0; i< personasList.size();i++){
            if(numSS.equals(personasList.get(i).getNumSeguridadSocial())){
                return personasList.get(i);
            }
        }
        return personasList.get(0);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        List<Persona> personasSalario=new ArrayList<>();
        for(int i=0; i< personasList.size();i++){
            if(personasList.get(i).getSalario()>=min&&personasList.get(i).getSalario()<=max){
                personasSalario.add(personasList.get(i));
            }
        }
        return personasSalario;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        List<Persona> personasEdad=new ArrayList<>();
        for(int i=0; i< personasList.size();i++){
            if(personasList.get(i).getEdad()>=edad){
                personasEdad.add(personasList.get(i));
            }
        }
        return personasEdad;
    }

    public List<Persona> obtenerTodas(){
        List<Persona> personas=new ArrayList<>();
        for(int i=0; i< personasList.size();i++){
            personas.add(personasList.get(i));
        }
        return personas;
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}

