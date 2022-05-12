package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.AnioPlanImpl;
import ar.edu.iua.modelo.academico.plan.MateriaImpl;
import ar.edu.iua.modelo.academico.plan.Plan;
import java.io.*;
import java.util.Random;

public class CrearPlanImpl implements CrearPlan {

    @Override
    public Plan crear(Plan plan, int anio) throws IOException {
        
        plan.setAnio(anio);
        Random random = new Random();
        int aux = random.nextInt(3); //random para elegir estado 
        switch(aux){
            case 1:
                plan.setEstadoActivo();
                break;
            case 2:
                plan.setEstadoNoActivo();
                break;
            default:
                plan.setEstadoBorrador();
                break;
        }
        
        BufferedReader in = null; 
        aux = random.nextInt(3); //random para elegir archivo a leer
        try {
            
            switch(aux){
                case 0:
                    in = new BufferedReader(new InputStreamReader(new FileInputStream("ar/edu/iua/recurso/materias1.txt"), "utf-8"));                  
                    break;
                case 1:
                    in = new BufferedReader(new InputStreamReader(new FileInputStream("ar/edu/iua/recurso/materias2.txt"), "utf-8"));
                    break;
                default:
                    in = new BufferedReader(new InputStreamReader(new FileInputStream("ar/edu/iua/recurso/materias3.txt"), "utf-8"));
                    break;
            }
           
        
            int codigo_materia = 1;
            
            for(int i = 1; i<6; i++){
                
                AnioPlan anio_plan = null;
                switch(i){
                    case 1:
                        anio_plan = new AnioPlanImpl(plan, i, "Primer año");
                        break;     
                    case 2:
                        anio_plan = new AnioPlanImpl(plan, i, "Segundo año");
                    break;
                    case 3:
                        anio_plan = new AnioPlanImpl(plan, i, "Tercer año");
                        break;
                    case 4:
                        anio_plan = new AnioPlanImpl(plan, i, "Cuarto año");
                        break;
                    case 5:
                        anio_plan = new AnioPlanImpl(plan, i, "Quinto año");
                        break;
                }
                
                String linea;
                
                
                

                while((linea=in.readLine())!=null && !linea.equals("zzz")){
                    anio_plan.getMaterias().add(new MateriaImpl(anio_plan, codigo_materia++, linea,(double) (random.nextInt(6)+1)));

                }
                plan.getAnios().add(anio_plan);

            }



        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            in.close();
        }
        
        
        
        return plan;        
    }

}

    /*
        Este metodo requiere que se guarde en la base de datos un plan
        Se debe validar y retornar false si:
            - plan no puede ser null
            - No se permite recibir un plan sin estado
            - No se permite un plan con año null, excepto si el estado es BORRADOR
            - No se permite un plan con año < 1990 y > 2040
            - No se permite un listado de años null o vacio, excepto si el estado del plan es BORRADOR
            - No se permite un año con el att plan != del plan que se recibe [ej. plan.getAnios().get(0).getPlan().equals(plan) == false, es error ]
            - No se permite un año con el att numero <= 0, recordar que si el estado del plan es BORRADOR, este att puede ser null, pero nunca <= 0
            - Los numeros de los años en el listado de años debe ser secuancial, comenzando en 1
            - No se puede repetir años con el mismo numero, en el mismo plan
            - No se permite que un año del plan no tenga nombre, excepto si el estado del plan es BORRADOR 
            - No se permiten años con un listado de materias null o vacio, excepto si el estado del plan es BORRADOR
materia tiene un att anioplan tmb            - No se permite una materia con el att anioPlan != del anioPlan al q pertenece [ej. anioPlan.getMaterias().get(0).getAnioPlan().equals(anioPlan) == false, es error ]
            - No se permite una materia con el att codigo <= 0, recordar que si el estado del plan es BORRADOR, este att puede ser null, pero nunca <= 0 
            - Los numeros de las materias en el listado de materias de un año debe ser secuancial, comenzando en 1
            - No se permiten materias con el mismo codigo, en el mismo plan
            - No se permite que una materia no tenga nombre, excepto si el estado del plan es BORRADOR 
            - No se permite que una materia no tenga carga horaria, excepto si el estado del plan es BORRADOR 
            - No se permite que una materias tenga carga horaria < 0, recordar que si el estado del plan es BORRADOR, este att puede ser null, pero nunca <= 0 
    */