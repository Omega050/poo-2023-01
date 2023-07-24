package t13;

import java.util.Date;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private Date dataConsulta;

    public Consulta(Medico m, Paciente p, Date d){
        this.medico = m;
        this.paciente = p;
        this.dataConsulta = d;
    }

    public Medico getMedico() {
        return medico;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public Date getDataConsulta() {
        return dataConsulta;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
}
