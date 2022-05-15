package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

import java.io.*;


public class CrearPlanImpl implements CrearPlan {

    @Override
    public boolean crear(Plan plan) throws IOException {
        
        if(ValidarPlan.validar(plan)) {
            try{
                BaseDeDatos.planes.add((Plan)plan.clone());
                return true;
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        
        return false;
                   
    }

}