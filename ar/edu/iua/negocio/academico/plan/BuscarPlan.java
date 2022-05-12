package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public interface BuscarPlan {

    Plan buscar(int anio, List<Plan> planes);
    
}
