package ar.edu.iua.interfazusuario;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.negocio.academico.plan.BuscarPlanes;
import ar.edu.iua.negocio.academico.plan.BuscarPlanesImpl;
import ar.edu.iua.excepciones.BuscarPlanEx;
import ar.edu.iua.modelo.academico.plan.AnioPlan;

public class BuscarEImprimirPlanesImpl implements BuscarEImprimirPlanes {

    @Override
    public void buscarEImprimirPlanes(String terminos) throws BuscarPlanEx {
    BuscarPlanes planesBuscados = new BuscarPlanesImpl();
       List<Plan> planes = planesBuscados.buscar(terminos);
       imprimirPlanes(planes);
        
    }

	public static void imprimirPlanes(List<Plan> planes) {
        System.out.println();
        System.out.println();
        System.out.println("AÑO   DURACION (AÑOS)  Nº MATERIAS  ESTADO");
        System.out.println("---   ---------------  -----------  ------");
        for(Plan plan : planes) {
            int totalMaterias = 0;
            for(AnioPlan aniopl : plan.getAnios()){
                    totalMaterias += aniopl.getMaterias().size();
            }
            System.out.println(plan.getAnio()+ "         " +plan.getAnios().size() 
            +"           "+totalMaterias+"          "+plan.estadoString());
        }
        System.out.println();
        System.out.println();
	}
}