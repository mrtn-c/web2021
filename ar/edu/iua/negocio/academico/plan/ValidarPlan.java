package ar.edu.iua.negocio.academico.plan;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.Plan;

public class ValidarPlan {

    public boolean validar(Plan plan, List<Plan> planes) {

        List <Integer> auxNumAnio = new ArrayList<>();
            
        
        
        if (!plan.hasEstado()){ //comprobamos que tenga estado asignado.
            return false;
        }
        
        boolean borrador = plan.isEstadoBorrador() ? true : false;
         
        
        
        //si se cumple alguna condicion, el plan NO se valida   
        for(int i = 0; i<plan.getAnios().size(); i++){
                
            if(!plan.getAnios().get(i).getPlan().equals(plan)){
                System.out.println("año del plan, no pertenece a ese plan");
                return false;
            }    
        }

            
        for(int i = 1; i<plan.getAnios().size()-1; i++){
               
            if(!(plan.getAnios().get(i-1).getNumero() < plan.getAnios().get(i).getNumero()) || !(plan.getAnios().get(i+1).getNumero() > plan.getAnios().get(i).getNumero())){     
                System.out.println("no hay secuencialidad en los años");
                return false;     
            }  
        }

            
        for(AnioPlan anio : plan.getAnios()){
            for(int j = 0; j<auxNumAnio.size(); j++){
                if(auxNumAnio.get(j).equals(anio.getNumero())){ 
                    System.out.println("año con el mismo numero");
                    return false;  
                }        
            }       
            
            auxNumAnio.add(anio.getNumero());
                  
            for (int j = 0; j<anio.getMaterias().size(); j++){           
                if(!anio.getMaterias().get(j).getAnio().equals(anio)){            
                    System.out.println("materia no pertenece a ese año");
                    return false;           
                } //J -- recorre materias, la i los años.                   
            }   
        }
            

            auxNumAnio.clear();
            
        for(AnioPlan anio : plan.getAnios()){//año
                
            for(int i = 0; i<anio.getMaterias().size(); i++){//materia a comparar.

                for(int j = 0; j<auxNumAnio.size(); j++){//materia con la que comparo
                        
                    if(anio.getMaterias().get(i).getCodigo().equals(auxNumAnio.get(j)) && anio.getMaterias().get(i).getCodigo()>0){
                        System.out.println("materia con mismo codigo " + anio.getMaterias().get(i). getCodigo() + " - " + auxNumAnio.get(j));
                        return false;
                    }
                }
                auxNumAnio.add(anio.getMaterias().get(i).getCodigo());
            }
        }

        auxNumAnio.clear();

        for(AnioPlan anio : plan.getAnios()){
            for(int i = 1; i<anio.getMaterias().size()-1; i++){
               if(!(anio.getMaterias().get(i-1).getCodigo()<anio.getMaterias().get(i).getCodigo()) || !(anio.getMaterias().get(i+1).getCodigo()>anio.getMaterias().get(i).getCodigo())){
                    System.out.println("materia sin secuencialidad");
                    return false;
                }
            }
        }


        if (plan == null || plan.getAnio() == null || plan.getAnio() <= 1990 || plan.getAnio() >= 2040) {
            return false;
        }

        if(!borrador){

            if(plan.getAnio() == null || plan.getAnio()<=0)
                return false;
            
            if(plan.getAnios() == null)
                return false;
            
            
            for(AnioPlan anio : plan.getAnios()){
                if(anio.getNombre() == null){
                    return false;
                }

                if(anio.getMaterias() == null){
                    return false;
                }

                for(Materia materia : anio.getMaterias()){
                    if(materia.getCargaHoraria()<0 || materia.getCargaHoraria()==null || materia.getNombre()==null || materia.getCodigo()<0){
                        System.out.println("A materia se le cargo mal un dato");
                        return false;
                    }
                }
            }

        }
        

        return true;
    }
    
}

    /*
        Este metodo requiere que se guarde en la base de datos un plan
        Se debe validar y retornar false si:
           
        PA TODOS, CON BORRADOR TMB! []
        - plan no puede ser null (ok) -----
            - No se permite recibir un plan sin estado (ok) -------
            - No se permite un plan con año < 1990 y > 2040 (ok) -------
            - No se permite un año con el att plan != del plan que se recibe [ej. plan.getAnios().get(0).getPlan().equals(plan) == false, es error ] FOR q vea todos ----
            - Los numeros de los años en el listado de años debe ser secuencial, comenzando en 1 FOR -------
            - No se puede repetir años con el mismo numero, en el mismo plan FOR COMPROBACION PARA TODO ----------
            - No se permite una materia con el att anioPlan != del anioPlan al q pertenece [ej. anioPlan.getMaterias().get(0).getAnioPlan().equals(anioPlan) == false, es error ] FOR 
            - Los numeros de las materias en el listado de materias de un año debe ser secuancial, comenzando en 1 FOR DE ARRIBA - compruebo agregando FOR
            - No se permiten materias con el mismo codigo, en el mismo plan arriba, compruebo todo. FOR
             LISTO ESTOOO........

            - No se permite un plan con año null, excepto si el estado es BORRADOR -----
            - No se permite un listado de años null o vacio, excepto si el estado del plan es BORRADOR--------
            - No se permite un año con el att numero <= 0, recordar que si el estado del plan es BORRADOR, este att puede ser null, pero nunca <= 0----------
            - No se permite que un año del plan no tenga nombre, excepto si el estado del plan es BORRADOR -FOR ----
            - No se permiten años con un listado de materias null o vacio, excepto si el estado del plan es BORRADOR  ----
            - No se permite una materia con el att codigo <= 0, recordar que si el estado del plan es BORRADOR, este att puede ser null, pero nunca <= 0 -----
            - No se permite que una materia no tenga nombre, excepto si el estado del plan es BORRADOR ---- 
            - No se permite que una materia no tenga carga horaria, excepto si el estado del plan es BORRADOR 
            - No se permite que una materias tenga carga horaria < 0, recordar que si el estado del plan es BORRADOR, este att puede ser null, pero nunca <= 0
    */
