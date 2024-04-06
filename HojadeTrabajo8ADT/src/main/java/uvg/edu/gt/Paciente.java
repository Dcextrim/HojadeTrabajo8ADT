package uvg.edu.gt;

/**
 * Clase que representa la ficha de un paciente.
 */
class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private char codigoEmergencia;

    /**
     * Constructor que inicializa los atributos del paciente.
     * @param nombre El nombre del paciente.
     * @param sintoma El síntoma o descripción del problema.
     * @param codigoEmergencia El código de emergencia del paciente (de 'A' a 'E').
     */
    public Paciente(String nombre, String sintoma, char codigoEmergencia) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigoEmergencia = codigoEmergencia;
    }

    /**
     * Obtiene el nombre del paciente.
     * @return El nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el síntoma o descripción del problema del paciente.
     * @return El síntoma o descripción del problema.
     */
    public String getSintoma() {
        return sintoma;
    }

    /**
     * Obtiene el código de emergencia del paciente.
     * @return El código de emergencia del paciente.
     */
    public char getCodigoEmergencia() {
        return codigoEmergencia;
    }

    /**
     * Implementación del método compareTo para comparar pacientes por código de emergencia.
     * @param otro El otro paciente con el que se compara.
     * @return Un valor negativo si este paciente tiene mayor prioridad, cero si tienen la misma prioridad, o un valor positivo si el otro paciente tiene mayor prioridad.
     */
    @Override
    public int compareTo(Paciente otro) {
        return Character.compare(this.codigoEmergencia, otro.codigoEmergencia);
    }
}
