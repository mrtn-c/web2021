package ar.edu.iua.modelo.academico.plan;

import java.util.ArrayList;
import java.util.List;

public class PlanImpl extends Plan implements Cloneable {

    private Integer anio;
    private Estado estado;
    private List<AnioPlan> anios = new ArrayList<AnioPlan>();

    private enum Estado {
        BORRADOR,
        ACTIVO,
        INACTIVO
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public void setEstadoBorrador() {
        estado = Estado.BORRADOR;
    }

    public void setEstadoActivo() {
        estado = Estado.ACTIVO;
    }

    public void setEstadoNoActivo() {
        estado = Estado.INACTIVO;
    }

    public boolean isEstadoBorrador() {
        return estado == Estado.BORRADOR;
    }

    public boolean isEstadoActivo() {
        return estado == Estado.ACTIVO;
    }

    public boolean isEstadoNoActivo() {
        return estado == Estado.INACTIVO;
    }
    
    public boolean hasEstado(){
        return estado != null;
    }

    public List<AnioPlan> getAnios() {
        return anios;
    }

    public String estadoString(){
        return estado.name();
    }

    public void setAnios(List<AnioPlan> anios) {
        this.anios = anios;
    }

    // ---
    
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((anio == null) ? 0 : anio.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PlanImpl other = (PlanImpl) obj;
        if (anio == null) {
            if (other.anio != null)
                return false;
        } else if (!anio.equals(other.anio))
            return false;
        return true;
    }

    public String toString() {
        return "Plan de estudios " + (anio != null ? anio.toString() : " desconocido");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
	    Plan cloned = (Plan)super.clone();
	    List<AnioPlan> aux = new ArrayList<>();
        for(AnioPlan anio : this.anios){
            if(anio != null){
                anio.setPlan(this);
                aux.add((AnioPlan)anio.clone());
            }
        }
        cloned.setAnios(aux);
        return cloned;
    }

}
