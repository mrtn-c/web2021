package ar.edu.iua.negocio.academico.plan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BuscarPlanesImpl implements BuscarPlanes {

    @Override
    public List<Plan> buscar(String terminos) {
        
        
        List<Plan> planes = new ArrayList<>();
        terminos = terminos.toLowerCase();
        terminos = Normalizador.cleanString(terminos);
        List<String>palabras = Arrays.asList(terminos.split("\\s+")); 

        for(String palabra : palabras ){
            
            if(palabra == null){
                continue;
            } 
            
            for(Plan plan : BaseDeDatos.planes){
                //Busqueda por año.
                if(palabra.contains(plan.getAnio().toString())){
                    encontrado(planes, plan);
                    continue;
                }
                //Busqueda por estado.
                if(palabra.equals(plan.estadoString().toLowerCase())){
                    encontrado(planes, plan);
                    continue;
                }

                //busqueda por materia.
                for(AnioPlan anio : plan.getAnios()){
                    for(Materia materia : anio.getMaterias()){
                        List<String> aux = Arrays.asList(materia.getNombre().toLowerCase().split("\\s+")); 
                        for(String limpiar: aux){
                            Normalizador.cleanString(limpiar);
                        }

                        if(aux.contains(palabra)){
                            encontrado(planes, plan);
                            continue; //o iria un break aca???
                        }
                    }
                }
                
                
                
                
            }
        }

        imprimirEncontrados(planes);

         
        
        
        
        return planes;
    }


    private void encontrado(List<Plan> planes, Plan plan){ //capaz q void
        if(planes.contains(plan)){
            return;
        } else {
            planes.add(plan);
            return;
        }
        
        
 
    }

    private void imprimirEncontrados(List<Plan> planes){
        
        for(Plan plan : planes){
            System.out.println("plan año: " + plan.getAnio());
        }
        
    }


    
    
    
}
