package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;

public interface CrearPlan {


    Plan crear(Plan plan, int anio) throws Exception;    
    
}
