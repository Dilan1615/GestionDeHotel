package gestionhotel;

/**
 *
 * @author Grupo7PIS
 */
public class Personal {
    private String cargo;
    private String turno;
    private float salario;
    private int horasTrabajadas;

    public Personal(String cargo, String turno, float salario, int horasTrabajadas) {
        this.cargo = cargo;
        this.turno = turno;
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
    }

    public void registrarHuesped(Huesped huesped) {
        // Lógica para registrar un huésped
    }

    public void editarHuesped(Huesped huesped, String nuevoNombre, String nuevoTelefono) {
        huesped.setNombre(nuevoNombre);
        huesped.setTelefono(nuevoTelefono);
    }

    // Getters y setters para los campos
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}