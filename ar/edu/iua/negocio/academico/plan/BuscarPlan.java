package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.excepciones.BuscarPlanEx;

public interface BuscarPlan {

    // este metodo debe devolver un plan correspondiente al año ingresado 
    //(si este se encuentra en nuestra BD)
    Plan buscar(int anio) throws BuscarPlanEx;
}
