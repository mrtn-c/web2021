package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;

public interface BuscarPlan {

    // este metodo debe devolver un plan correspondiente al año ingresado 
    //(si este se encuentra en nuestra BD)
    Plan buscar(int anio);
    // IMPLEMENTAR LAS EXCEPCIONES (INVENTARNOS COMPROBACIONES COMO LAS DE BORRARPLANIMPL)
}
