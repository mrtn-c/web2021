package ar.edu.iua.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ar.edu.iua.modelo.academico.plan.*;
import ar.edu.iua.negocio.academico.plan.*;
import ar.edu.iua.persistencia.BaseDeDatos;

public class GenerarEjemplosDePlanes {


    // Este metodo primero crea 2 planes, segun https://monserrat.unc.edu.ar/secundario/plan-de-estudios/#1523542585948-acc3dfd8-8da3
    // y tambien crea de forma aleatoria una determinada cantidad de planes
    public static boolean generar(int cantidadAGenerar, boolean imprimirResultado) {

        //List<Plan> planes = new ArrayList<Plan>();

        // ==========================================================================

        // PLAN 2018

        Plan plan2018 = new PlanImpl();

        plan2018.setAnio(2018);
        plan2018.setEstadoActivo();

        //planes.add(plan2018);

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

        int codigoMateria = 1;

        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria++, "Ciencias de la Vida y de la Tierra ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria++, "Lengua y Literatura Castellanas I", 5.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria++, "Lengua y Cultura Latinas I ", 4.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria++, "Lengua y Cultura Inglesas I ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria++, "Formación Musical I ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria++, "Formación Plástica I ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria++, "Matemática I", 4.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria++, "Geografía I ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria++, "Historia I", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria++, "Formación Ética y Ciudadana I", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria++, "Estrategias de Aprendizaje y Entornos Virtuales", 4.0));
        primero2018.getMaterias().add(new MateriaImpl(primero2018, codigoMateria++, "Educación Física y Deportes I", 0.0));

        // MATERIAS DEL PLAN 2018 - SEGUNDO AÑO



        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Educación para la Salud", 4.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Lengua y Literatura Castellanas II ", 5.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Lengua y Cultura Latinas II ", 4.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Lengua y Cultura Inglesas II  ", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Formación Musical II ", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Formación Plástica II ", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Matemática II ", 4.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Geografía II ", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Historia II", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Formación Ética y Ciudadana II", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Educación Física y Deportes II", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Espacios Optativos 2019/2021", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(segundo2018, codigoMateria++, "Espacios Optativos 2022", 3.0));

        // MATERIAS DEL PLAN 2018 - TERCER AÑO

        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Ciencias Naturales", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Lengua y Literatura Castellanas III", 5.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Lengua y Cultura Latinas III", 4.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Lengua y Cultura Inglesas III", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Formación Plástica III", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Matemática III", 4.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Geografía III", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Historia III ", 4.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Formación Ética y Ciudadana III ", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Educación Tecnológica", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Educación Física y Deportes III", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Espacios Optativos 2020/2021", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Espacios Optativos 2021", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(tercero2018, codigoMateria++, "Espacios Optativos 2022", 3.0));

        // MATERIAS DEL PLAN 2018 - CUARTO AÑO
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Biología I", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Físico-Química", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Lengua y Literatura Castellanas IV", 4.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Lengua y Cultura Latinas IV", 4.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Lengua y Cultura Inglesa IV", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Lengua y Cultura Francesas I ", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Historia del Arte", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Matemática IV ", 5.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Geografía IV", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Historia IV", 4.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Educación Física y Escuadras I", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Espacios Optativos 2020/2021", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Espacios Optativos 2021", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(cuarto2018, codigoMateria++, "Espacios Optativos 2022", 3.0)); 

        // MATERIAS DEL PLAN 2018 - QUINTO AÑO
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Biología II", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Química I", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Lengua y Literatura Castellanas V", 4.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Lengua y Cultura Griegas I", 4.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Lengua y Cultura Inglesas V", 4.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Lengua y Cultura Francesas II ", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Matemática V", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Geografía V", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Historia V", 5.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Lógica", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Educación Física y Escuadras", 4.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Proyectos Sociocomunitarios", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(quinto2018, codigoMateria++, "Espacios Optativos 2022", 3.0));

        // PLAN 2001

        if(ValidarPlan.validar(plan2018)){
            BaseDeDatos.planes.add(plan2018);
        } else {
            System.out.println("Plan " + plan2018.getAnio() + " no validado!");
        }

        Plan plan2001 = new PlanImpl();

        plan2001.setAnio(2001);
        plan2001.setEstadoNoActivo();

        //planes.add(plan2001);

        // AÑOS DEL PLAN 2001

        AnioPlan primero2001 = new AnioPlanImpl(plan2001, 1, "Primer año");
        AnioPlan segundo2001 = new AnioPlanImpl(plan2001, 2, "Segundo año");
        AnioPlan tercero2001 = new AnioPlanImpl(plan2001, 3, "Tercero año");
        AnioPlan cuarto2001 = new AnioPlanImpl(plan2001, 4, "Cuarto año");
        AnioPlan quinto2001 = new AnioPlanImpl(plan2001, 5, "Quinto año");
        AnioPlan sexto2001 = new AnioPlanImpl(plan2001, 6, "Sexto año");
        AnioPlan septimo2001 = new AnioPlanImpl(plan2001, 7, "Septimo año");

        plan2001.getAnios().add(primero2001);
        plan2001.getAnios().add(segundo2001);
        plan2001.getAnios().add(tercero2001);
        plan2001.getAnios().add(cuarto2001);
        plan2001.getAnios().add(quinto2001);
        plan2001.getAnios().add(sexto2001);
        plan2001.getAnios().add(septimo2001);

        codigoMateria = 1;

        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Lengua y Literatura I", 5.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Lengua y Culturas Latinas I", 5.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Ingles I", 3.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Geografia I", 3.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Historia I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Matematica I", 4.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Plastica I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Musica I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Ciencias Naturales I", 3.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Tecnicas De Trabajo Intelectual I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Informatica I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Educacion Fisica I", 2.0));

        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria++, "Lengua y Literatura II", 5.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria++, "Lengua y Culturas Latinas II", 5.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria++, "Ingles II", 3.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria++, "Formacion Etica y Civica I", 2.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria++, "Geografia II", 3.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria++, "Historia II", 4.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria++, "Matematica II", 4.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria++, "Plastica II", 2.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria++, "Musica II", 2.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria++, "Ciencias Naturales II", 3.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria++, "Tecnicas De Trabajo Intelectual I", 2.0));
        segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoMateria++, "Educacion Fisica II", 2.0));
        
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria++, "Lengua y Literatura III", 5.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria++, "Lengua y Culturas Latinas III", 4.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria++, "Ingles III", 3.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria++, "Formacion Etica y Civica II", 2.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria++, "Geografia III", 3.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria++, "Historia III", 4.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria++, "Historia del Arte I", 2.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria++, "Plastica III", 2.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria++, "Musica III", 2.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria++, "Ciencias Naturales III", 3.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria++, "Matematica III", 5.0));
        tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoMateria++, "Educacion Fisica III", 2.0));

        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria++, "Lengua y Literatura IV", 4.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria++, "Lengua y Culturas Latinas IV", 5.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria++, "Ingles IV", 3.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria++, "Geografia IV", 3.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria++, "Historia IV", 4.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria++, "Formacion Etica y Civica III", 2.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria++, "Historia del Arte II", 2.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria++, "Plastica IV", 2.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria++, "Matematica IV", 5.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria++, "Biologia I", 2.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria++, "Fisico-Quimica", 3.0));
        cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoMateria++, "Educacion Fisica IV", 2.0));

        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Lengua y Literatura V", 4.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Lengua y Culturas Latinas V", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Lengua y Culturas Griegas I", 5.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Ingles V", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Frances I", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Geografia V", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Historia V", 4.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Quimica I", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Biologia II", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Matematica V - Algebra", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Estadistica y Probabilidades", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Informatica II", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Metodologia de la Investigacion", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Filosofia I", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoMateria++, "Educacion Fisica V", 2.0));
        
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Lengua y Literatura VI", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Lengua y Culturas Griegas II", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Ingles VI", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Frances II", 4.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Historia VI", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Historia de la Cultura I", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Geografia VI", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Filosofia II", 4.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Matematica VI - Trigonometria", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Geometria", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Biologia III", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Quimica II", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Fisica I", 4.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Informatica III", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoMateria++, "Educacion Fisica VI", 2.0));
        
        
        if(ValidarPlan.validar(plan2001)){
            BaseDeDatos.planes.add(plan2001);
        } else {
            System.out.println("Plan " + plan2001.getAnio() + " no validado!");
        }
        
        // ==========================================================================

        generarYAgregarPlanesAleatoriamente(cantidadAGenerar);

        // ==========================================================================

        if (imprimirResultado) {
            imprimirPlanes(BaseDeDatos.planes);
        }

        return true;

    }

    private static void generarYAgregarPlanesAleatoriamente(int cantidadAGenerar){
        
        CrearPlan crear_plan = new CrearPlanImpl();
        List<Integer> anios_p = new ArrayList<>(40);
        for (int i=1990; i<=2040; i++){
            anios_p.add(i);
        }
        Random random = new Random();
        anios_p.remove(2001-1990);
        anios_p.remove(2018-1990);

        for (int i=cantidadAGenerar; i != 0; i--){
            int indexRamdom = random.nextInt(anios_p.size());
            int anioRandom = anios_p.get(indexRamdom);
            try {
                Plan aux = new PlanImpl();
                crear_plan.crear(aux, anioRandom);
                            
                /*if(ValidarPlan.validar(plan_aux)){
                    System.out.println("plan:"+ plan_aux.getAnio() +" validado!");
                    planes.add(plan_aux);
                } else {
                    System.out.println("Plan con año " + plan_aux.getAnio() + " no es valido");
                }*/

            } catch (Exception e) {
                e.printStackTrace();
            }

            anios_p.remove(indexRamdom);

        }

        
        
       
    } 


    public static void imprimirPlanes(List<Plan> planes) {
        for (Plan plan  : planes) {
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
