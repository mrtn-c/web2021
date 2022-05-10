package ar.edu.iua.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ar.edu.iua.modelo.academico.plan.*;
import ar.edu.iua.negocio.academico.plan.*;

public class GenerarEjemplosDePlanes {


    // Este metodo primero crea 2 planes, segun https://monserrat.unc.edu.ar/secundario/plan-de-estudios/#1523542585948-acc3dfd8-8da3
    // y tambien crea de forma aleatoria una determinada cantidad de planes
    public static List<Plan> generar(int cantidadAGenerar, boolean imprimirResultado) {

        List<Plan> planes = new ArrayList<Plan>();

        // ==========================================================================

        // PLAN 2018

        Plan plan2018 = new PlanImpl();

        plan2018.setAnio(2018);
        plan2018.setEstadoActivo();

        planes.add(plan2018);

        // AÑOS DEL PLAN 2018

        AnioPlan primero2018 = new AnioPlanImpl(plan2018, 1, "Primer año");
        AnioPlan segundo2018 = new AnioPlanImpl(plan2018, 2, "Segundo año");
        AnioPlan tercero2018 = new AnioPlanImpl(plan2018, 3, "Tercer año");
        AnioPlan cuarto2018 = new AnioPlanImpl(plan2018, 4, "Cuarto año");
        AnioPlan quinto2018 = new AnioPlanImpl(plan2018, 5, "Quinto año");

        plan2018.getAnios().add(primero2018);
        plan2018.getAnios().add(segundo2018);
        plan2018.getAnios().add(tercero2018);
        plan2018.getAnios().add(cuarto2018);
        plan2018.getAnios().add(quinto2018);

        // MATERIAS DEL PLAN 2018 - PRIMER AÑO

        int codigoMateria2018 = 1;

        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria2018++, "Ciencias de la Vida y de la Tierra ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria2018++, "Lengua y Literatura Castellanas I", 5.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria2018++, "Lengua y Cultura Latinas I ", 4.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria2018++, "Lengua y Cultura Inglesas I ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria2018++, "Formación Musical I ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria2018++, "Formación Plástica I ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria2018++, "Matemática I", 4.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria2018++, "Geografía I ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria2018++, "Historia I", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria2018++, "Formación Ética y Ciudadana I", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria2018++, "Estrategias de Aprendizaje y Entornos Virtuales", 4.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria2018++, "Educación Física y Deportes I", 0.0));

        // MATERIAS DEL PLAN 2018 - SEGUNDO AÑO

        codigoMateria2018 = 1;

        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Educación para la Salud", 4.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Lengua y Literatura Castellanas II ", 5.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Lengua y Cultura Latinas II ", 4.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Lengua y Cultura Inglesas II  ", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Formación Musical II ", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Formación Plástica II ", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Matemática II ", 4.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Geografía II ", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Historia II", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Formación Ética y Ciudadana II", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Educación Física y Deportes II", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Espacios Optativos 2019/2021", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria2018++, "Espacios Optativos 2022", 3.0));

        // MATERIAS DEL PLAN 2018 - TERCER AÑO

        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Ciencias Naturales", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Lengua y Literatura Castellanas III", 5.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Lengua y Cultura Latinas III", 4.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Lengua y Cultura Inglesas III", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Formación Plástica III", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Matemática III", 4.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Geografía III", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Historia III ", 4.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Formación Ética y Ciudadana III ", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Educación Tecnológica", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Educación Física y Deportes III", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Espacios Optativos 2020/2021", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Espacios Optativos 2021", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria2018++, "Espacios Optativos 2022", 3.0));

        // MATERIAS DEL PLAN 2018 - CUARTO AÑO
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Biología I", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Físico-Química", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Lengua y Literatura Castellanas IV", 4.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Lengua y Cultura Latinas IV", 4.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Lengua y Cultura Inglesa IV", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Lengua y Cultura Francesas I ", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Historia del Arte", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Matemática IV ", 5.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Geografía IV", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Historia IV", 4.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Educación Física y Escuadras I", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Espacios Optativos 2020/2021", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Espacios Optativos 2021", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria2018++, "Espacios Optativos 2022", 3.0)); 

        // MATERIAS DEL PLAN 2018 - QUINTO AÑO
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Biología II", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Química I", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Lengua y Literatura Castellanas V", 4.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Lengua y Cultura Griegas I", 4.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Lengua y Cultura Inglesas V", 4.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Lengua y Cultura Francesas II ", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Matemática V", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Geografía V", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Historia V", 5.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Lógica", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Educación Física y Escuadras", 4.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Proyectos Sociocomunitarios", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria2018++, "Espacios Optativos 2022", 3.0));

        // PLAN 2001

        Plan plan2001 = new PlanImpl();

        plan2001.setAnio(2001);
        plan2001.setEstadoNoActivo();

        planes.add(plan2001);

        // AÑOS DEL PLAN 2001

        AnioPlan primero2001 = new AnioPlanImpl(plan2001, 1, "Primer año");
        AnioPlan segundo2001 = new AnioPlanImpl(plan2001, 2, "Segundo año");
        AnioPlan tercero2001 = new AnioPlanImpl(plan2001, 3, "Tercero año");
        AnioPlan cuarto2001 = new AnioPlanImpl(plan2001, 4, "Cuarto año");
        AnioPlan quinto2001 = new AnioPlanImpl(plan2001, 5, "Quinto año");
        AnioPlan sexto2001 = new AnioPlanImpl(plan2001, 5, "Sexto año");
        AnioPlan septimo2001 = new AnioPlanImpl(plan2001, 5, "Septimo año");

        plan2001.getAnios().add(primero2001);
        plan2001.getAnios().add(segundo2001);
        plan2001.getAnios().add(tercero2001);
        plan2001.getAnios().add(cuarto2001);
        plan2001.getAnios().add(quinto2001);
        plan2001.getAnios().add(sexto2001);
        plan2001.getAnios().add(septimo2001);

        int codigoMateria2001 = 1;

        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria2001++, "Lengua y Literatura I", 5.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria2001++, "Lengua y Culturas Latinas I", 5.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria2001++, "Ingles I", 3.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria2001++, "Geografia I", 3.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria2001++, "Historia I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria2001++, "Matematica I", 4.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria2001++, "Plastica I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria2001++, "Musica I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria2001++, "Ciencias Naturales I", 3.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria2001++, "Tecnicas De Trabajo Intelectual I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria2001++, "Informatica I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria2001++, "Educacion Fisica I", 2.0));

        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria2001++, "Lengua y Literatura II", 5.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria2001++, "Lengua y Culturas Latinas II", 5.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria2001++, "Ingles II", 3.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria2001++, "Formacion Etica y Civica I", 2.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria2001++, "Geografia II", 3.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria2001++, "Historia II", 4.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria2001++, "Matematica II", 4.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria2001++, "Plastica II", 2.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria2001++, "Musica II", 2.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria2001++, "Ciencias Naturales II", 3.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria2001++, "Tecnicas De Trabajo Intelectual I", 2.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria2001++, "Educacion Fisica II", 2.0));
        
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria2001++, "Lengua y Literatura III", 5.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria2001++, "Lengua y Culturas Latinas III", 4.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria2001++, "Ingles III", 3.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria2001++, "Formacion Etica y Civica II", 2.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria2001++, "Geografia III", 3.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria2001++, "Historia III", 4.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria2001++, "Historia del Arte I", 2.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria2001++, "Plastica III", 2.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria2001++, "Musica III", 2.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria2001++, "Ciencias Naturales III", 3.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria2001++, "Matematica III", 5.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria2001++, "Educacion Fisica III", 2.0));

        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria2001++, "Lengua y Literatura IV", 4.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria2001++, "Lengua y Culturas Latinas IV", 5.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria2001++, "Ingles IV", 3.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria2001++, "Geografia IV", 3.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria2001++, "Historia IV", 4.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria2001++, "Formacion Etica y Civica III", 2.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria2001++, "Historia del Arte II", 2.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria2001++, "Plastica IV", 2.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria2001++, "Matematica IV", 5.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria2001++, "Biologia I", 2.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria2001++, "Fisico-Quimica", 3.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria2001++, "Educacion Fisica IV", 2.0));

        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Lengua y Literatura V", 4.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Lengua y Culturas Latinas V", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Lengua y Culturas Griegas I", 5.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Ingles V", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Frances I", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Geografia V", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Historia V", 4.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Quimica I", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Biologia II", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Matematica V - Algebra", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Estadistica y Probabilidades", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Informatica II", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Metodologia de la Investigacion", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Filosofia I", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria2001++, "Educacion Fisica V", 2.0));
        
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Lengua y Literatura VI", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Lengua y Culturas Griegas II", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Ingles VI", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Frances II", 4.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Historia VI", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Historia de la Cultura I", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Geografia VI", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Filosofia II", 4.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Matematica VI - Trigonometria", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Geometria", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Biologia III", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Quimica II", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Fisica I", 4.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Informatica III", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria2001++, "Educacion Fisica VI", 2.0));
        // ==========================================================================

        generarYAgregarPlanesAleatoriamente(cantidadAGenerar, planes);

        // ==========================================================================

        if (imprimirResultado) {
            imprimirPlanes(planes);
        }

        return planes;

    }

    private static void generarYAgregarPlanesAleatoriamente(int cantidadAGenerar, List<Plan> planes){
        
        CrearPlan crear_plan = new CrearPlanImpl();
        List<Integer> anios_p = new ArrayList<>(40);
        for (int i=1990; i<=2040; i++){
            anios_p.add(i);
        }
        Random random = new Random();
        anios_p.remove(2001-1990);
        anios_p.remove(2018-1990);
        ValidarPlan vp = new ValidarPlan();

        for (int i=cantidadAGenerar; i != 0; i--){
            int indexRamdom = random.nextInt(anios_p.size());
            int anioRandom = anios_p.get(indexRamdom);
            try {
                Plan plan_aux = crear_plan.crear(new PlanImpl(), anioRandom);
                if(vp.validar(plan_aux, planes)){
                    planes.add(plan_aux);
                } else {
                    System.out.println("Plan con año " + plan_aux.getAnio() + " no es valido");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

           
            
            anios_p.remove(indexRamdom);

        }

        
        
       
    } 


    private static void imprimirPlanes(List<Plan> planes) {
        for (Plan plan : planes) {
            System.out.println("\n" + plan);
            for (AnioPlan anio : plan.getAnios()) {
                System.out.println("\t" + anio);
                for (Materia materia : anio.getMaterias()) {
                    System.out.println("\t\t" + String.format("%1$" + 2 + "s", materia.getCodigo()) + " - " + materia);
                }
                if (anio.getMaterias().size() == 0) {
                    System.out.println("\t\tA este año no se le cargaron materias!!");
                }
            }
            if (plan.getAnios().size() == 0) {
                System.out.println("\tA este plan no se le cargaron años!!");
            }

        }
    }

}
