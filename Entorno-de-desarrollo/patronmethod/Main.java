package patronmethod;

public class Main {
    public static void main(String[] args) {
        AsignaturaFactory asignaturaFactory = new AsignaturaFactoryImpl();

        Asignatura matematicas = asignaturaFactory.crearAsignatura(1);
        System.out.println("Nombre de la asignatura: " + matematicas.getNombre() +
                " Codigo de la asignatura: " + matematicas.getCodigo() + " Profesor: " + matematicas.getProfesor()
                + " Nota:" + matematicas.getNota());

        Asignatura fisica = asignaturaFactory.crearAsignatura(2);
        System.out.println("Nombre de la asignatura: " + fisica.getNombre() + " Codigo de la asignatura :" +
                fisica.getCodigo() + " Profesor: " + fisica.getProfesor() + " Nota:" + fisica.getNota());

        Asignatura historia = asignaturaFactory.crearAsignatura(3);
        System.out.println("Nombre de la asignatura: " + historia.getNombre() + " Codigo de la asignatura :" +
                historia.getCodigo() + " Profesor: " + historia.getProfesor() + " Nota:" + historia.getNota());

        Asignatura quimica = asignaturaFactory.crearAsignatura(4);
        System.out.println("Nombre de la asignatura: " + quimica.getNombre() + " Codigo de la asignatura :" +
                quimica.getCodigo() + " Profesor: " + quimica.getProfesor() + " Nota:" + quimica.getNota());
    }
}
